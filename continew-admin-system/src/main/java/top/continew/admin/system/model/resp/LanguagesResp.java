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

package top.continew.admin.system.model.resp;

import java.io.Serial;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import top.continew.starter.extension.crud.model.resp.BaseResp;

/**
 * 语言信息信息
 *
 * @author xwz
 * @since 2024/09/26 15:41
 */
@Data
@Schema(description = "语言信息")
public class LanguagesResp extends BaseResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    @Schema(description = "名称")
    private String name;

    /**
     * Alpha2编码
     */
    @Schema(description = "Alpha2编码")
    private String iso2;

    /**
     * Alpha3编码
     */
    @Schema(description = "Alpha3编码")
    private String iso3;

    /**
     * 原生名称
     */
    @Schema(description = "原生名称")
    private String nativeName;

    /**
     * 激活状态
     */
    @Schema(description = "是否激活")
    private Boolean isActive;
}
