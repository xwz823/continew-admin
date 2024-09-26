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

package top.continew.admin.controller.cms;

import top.continew.starter.extension.crud.enums.Api;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import top.continew.starter.extension.crud.annotation.CrudRequestMapping;
import top.continew.starter.extension.crud.controller.BaseController;
import top.continew.admin.site.model.query.SiteInfoQuery;
import top.continew.admin.site.model.req.SiteInfoReq;
import top.continew.admin.site.model.resp.SiteInfoDetailResp;
import top.continew.admin.site.model.resp.SiteInfoResp;
import top.continew.admin.site.service.SiteInfoService;

/**
 * 站点管理 API
 *
 * @author xwz
 * @since 2024/09/26 16:21
 */
@Tag(name = "站点管理 API")
@RestController
@CrudRequestMapping(value = "/site/siteInfo", api = {Api.PAGE, Api.GET, Api.ADD, Api.UPDATE, Api.DELETE, Api.EXPORT})
public class SiteInfoController extends BaseController<SiteInfoService, SiteInfoResp, SiteInfoDetailResp, SiteInfoQuery, SiteInfoReq> {}
