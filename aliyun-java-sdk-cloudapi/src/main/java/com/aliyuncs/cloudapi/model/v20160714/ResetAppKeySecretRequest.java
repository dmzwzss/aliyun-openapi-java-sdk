/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ResetAppKeySecretRequest extends RpcAcsRequest<ResetAppKeySecretResponse> {
	
	public ResetAppKeySecretRequest() {
		super("CloudAPI", "2016-07-14", "ResetAppKeySecret", "apigateway");
	}

	private String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	@Override
	public Class<ResetAppKeySecretResponse> getResponseClass() {
		return ResetAppKeySecretResponse.class;
	}

}
