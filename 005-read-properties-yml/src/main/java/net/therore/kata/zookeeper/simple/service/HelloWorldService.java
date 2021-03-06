/*
 * Copyright 2012-2013 the original author or authors.
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

package net.therore.kata.zookeeper.simple.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;
import javax.annotation.Resource;

@Component
public class HelloWorldService {

	@Value("${name}")
	private String name;

	@Resource
	private Environment environment;

	public String getHelloMessage() {

	  String nickname = environment.getProperty("nickname");

		if(nickname!=null){
		  return "Hello " + this.name + " " + environment.getProperty("lastname") + " or better known as: "+nickname;
		}else{
			return "Hello " + this.name + " " + environment.getProperty("lastname");
		}



	}

}
