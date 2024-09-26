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

package top.continew.admin.site.service.impl;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import top.continew.starter.extension.crud.service.impl.BaseServiceImpl;
import top.continew.admin.site.mapper.SiteInfoMapper;
import top.continew.admin.site.model.entity.SiteInfoDO;
import top.continew.admin.site.model.query.SiteInfoQuery;
import top.continew.admin.site.model.req.SiteInfoReq;
import top.continew.admin.site.model.resp.SiteInfoDetailResp;
import top.continew.admin.site.model.resp.SiteInfoResp;
import top.continew.admin.site.service.SiteInfoService;

/**
 * 站点业务实现
 *
 * @author xwz
 * @since 2024/09/26 16:21
 */
@Service
@RequiredArgsConstructor
public class SiteInfoServiceImpl extends BaseServiceImpl<SiteInfoMapper, SiteInfoDO, SiteInfoResp, SiteInfoDetailResp, SiteInfoQuery, SiteInfoReq> implements SiteInfoService {}