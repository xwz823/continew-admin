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

package top.continew.admin.site.model.entity;

import java.io.Serial;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableName;

import top.continew.starter.extension.crud.model.entity.BaseDO;

/**
 * 站点实体
 *
 * @author xwz
 * @since 2024/09/26 16:21
 */
@Data
@TableName("cms_site_info")
public class SiteInfoDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 站点名称
     */
    private String name;

    /**
     * 绑定域名
     */
    private String bindDomain;

    /**
     * 绑定二级目录
     */
    private String bindPath;

    /**
     * 绑定语言
     */
    private String bindLangs;

    /**
     * 其他扩展字段
     */
    private String options;

    /**
     * 逻辑删除;（0否 1是）
     */
    private Integer isDeleted;
}