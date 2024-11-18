/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.continew.admin.open.sign;

import cn.dev33.satoken.sign.SaSignTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import top.continew.admin.open.service.AppService;
import top.continew.starter.core.validation.ValidationUtils;

import java.util.Map;
import java.util.TreeMap;

/**
 * API 参数签名算法
 *
 * @author chengzi
 * @author Charles7c
 * @since 2024/10/17 16:03
 */
@Component
@RequiredArgsConstructor
public class OpenApiSignTemplate extends SaSignTemplate {

    private final AppService appService;
    public static final String ACCESS_KEY = "accessKey";

    @Override
    public void checkParamMap(Map<String, String> paramMap) {
        // 获取必须的参数
        String timestampValue = paramMap.get(timestamp);
        String nonceValue = paramMap.get(nonce);
        String signValue = paramMap.get(sign);
        String accessKeyValue = paramMap.get(ACCESS_KEY);

        // 校验
        ValidationUtils.throwIfBlank(timestampValue, "timestamp不能为空");
        ValidationUtils.throwIfBlank(nonceValue, "nonce不能为空");
        ValidationUtils.throwIfBlank(signValue, "sign不能为空");
        ValidationUtils.throwIfBlank(accessKeyValue, "accessKey不能为空");
        ValidationUtils.throwIf(!appService.isAppExists(accessKeyValue), "accessKey非法");
        ValidationUtils.throwIf(appService.isAppSecretExpired(accessKeyValue), "密钥已过期, 请重置密钥");

        // 依次校验三个参数
        super.checkTimestamp(Long.parseLong(timestampValue));
        super.checkNonce(nonceValue);
        super.checkSign(paramMap, signValue);
    }

    @Override
    public String createSign(Map<String, ?> paramsMap) {
        // 根据 AK 获取 SK
        String accessKeyValue = (String)((Map)paramsMap).get(ACCESS_KEY);
        String secretKey = appService.getSecretKeyByAccessKey(accessKeyValue);
        ValidationUtils.throwIfBlank(secretKey, "密钥缺失, 请检查应用配置");

        // 如果调用者不小心传入了 sign 参数，则此处需要将 sign 参数排除在外
        if (paramsMap.containsKey(sign)) {
            // 为了保证不影响原有的 paramsMap，此处需要再复制一份
            paramsMap = new TreeMap<>(paramsMap);
            paramsMap.remove(sign);
        }

        // 计算签名
        String paramsStr = super.joinParamsDictSort(paramsMap);
        String fullStr = paramsStr + "&" + key + "=" + secretKey;
        return super.abstractStr(fullStr);
    }
}
