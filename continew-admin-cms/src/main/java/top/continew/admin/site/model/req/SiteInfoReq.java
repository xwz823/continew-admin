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

package top.continew.admin.site.model.req;

import java.io.Serial;
import java.time.*;

import jakarta.validation.constraints.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import org.hibernate.validator.constraints.Length;

import top.continew.starter.extension.crud.model.req.BaseReq;

/**
 * 创建或修改站点信息
 *
 * @author xwz
 * @since 2024/09/26 16:21
 */
@Data
@Schema(description = "创建或修改站点信息")
public class SiteInfoReq extends BaseReq {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 站点名称
     */
    @Schema(description = "站点名称")
    @NotBlank(message = "站点名称不能为空")
    @Length(max = 64, message = "站点名称长度不能超过 {max} 个字符")
    private String name;

    /**
     * 绑定域名
     */
    @Schema(description = "绑定域名")
    @NotBlank(message = "绑定域名不能为空")
    @Length(max = 64, message = "绑定域名长度不能超过 {max} 个字符")
    private String bindDomain;

    /**
     * 二级目录
     */
    @Schema(description = "二级目录")
    @Length(max = 128, message = "二级目录长度不能超过 {max} 个字符")
    private String bindPath;

    /**
     * 绑定语言
     */
    @Schema(description = "绑定语言")
    @Length(max = 256, message = "绑定语言长度不能超过 {max} 个字符")
    private String bindLangs;
}
