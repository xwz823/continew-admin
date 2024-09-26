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

package top.continew.admin.system.service;

import top.continew.starter.extension.crud.service.BaseService;
import top.continew.admin.system.model.query.LanguagesQuery;
import top.continew.admin.system.model.req.LanguagesReq;
import top.continew.admin.system.model.resp.LanguagesDetailResp;
import top.continew.admin.system.model.resp.LanguagesResp;

/**
 * 语言信息业务接口
 *
 * @author xwz
 * @since 2024/09/26 15:41
 */
public interface LanguagesService extends BaseService<LanguagesResp, LanguagesDetailResp, LanguagesQuery, LanguagesReq> {}
