/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.endpoint.interceptor;

import org.springframework.integration.endpoint.EndpointInterceptor;
import org.springframework.integration.handler.MessageHandler;
import org.springframework.integration.message.Message;

/**
 * A convenience base class for implementing {@link EndpointInterceptor EndpointInterceptors}.
 *
 * @author Mark Fisher
 */
public class EndpointInterceptorAdapter implements EndpointInterceptor {

	public Message<?> preHandle(Message<?> requestMessage) {
		return requestMessage;
	}

	public Message<?> aroundHandle(Message<?> requestMessage, MessageHandler handler) {
		return handler.handle(requestMessage);
	}

	public Message<?> postHandle(Message<?> replyMessage) {
		return replyMessage;
	}

}
