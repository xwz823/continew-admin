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

package top.continew.admin.site.model.resp;

import java.io.Serial;
import java.time.*;

import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;

import top.continew.starter.extension.crud.model.resp.BaseDetailResp;

/**
 * 站点详情信息
 *
 * @author xwz
 * @since 2024/09/26 16:21
 */
@Data
@ExcelIgnoreUnannotated
@Schema(description = "站点详情信息")
public class SiteInfoDetailResp extends BaseDetailResp {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 站点名称
     */
    @Schema(description = "站点名称")
    @ExcelProperty(value = "站点名称")
    private String name;

    /**
     * 绑定域名
     */
    @Schema(description = "绑定域名")
    @ExcelProperty(value = "绑定域名")
    private String bindDomain;

    /**
     * 绑定二级目录
     */
    @Schema(description = "绑定二级目录")
    @ExcelProperty(value = "绑定二级目录")
    private String bindPath;

    /**
     * 绑定语言
     */
    @Schema(description = "绑定语言")
    @ExcelProperty(value = "绑定语言")
    private String bindLangs;

    /**
     * 其他扩展字段
     */
    @Schema(description = "其他扩展字段")
    @ExcelProperty(value = "其他扩展字段")
    private String options;

    /**
     * 逻辑删除;（0否 1是）
     */
    @Schema(description = "逻辑删除;（0否 1是）")
    @ExcelProperty(value = "逻辑删除;（0否 1是）")
    private Integer isDeleted;
}