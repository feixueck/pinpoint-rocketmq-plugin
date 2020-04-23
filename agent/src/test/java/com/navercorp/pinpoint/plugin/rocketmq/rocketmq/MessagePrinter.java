/*
 * Copyright 2018 NAVER Corp.
 *
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

package com.navercorp.pinpoint.plugin.rocketmq.rocketmq;

import com.aliyun.openservices.ons.api.Message;

/**
 * Helper class that simply prints a {@link Message} whose purpose is to check if trace has been propagated properly.
 *
 * @author 微风
 */
public class MessagePrinter {

    public void printMessage(Message message) {
        System.out.println("message : " + message);
    }
}