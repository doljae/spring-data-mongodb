/*
 * Copyright (c) 2011 by the original author(s).
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
package org.springframework.data.mongodb.core.mapping;

import java.util.HashSet;
import java.util.Set;

import org.bson.types.CodeWScope;
import org.bson.types.ObjectId;
import org.springframework.data.mapping.model.SimpleTypeHolder;

import com.mongodb.DBRef;

/**
 * Simple constant holder for a {@link SimpleTypeHolder} enriched with Mongo specific simple types.
 * 
 * @author Oliver Gierke
 */
public abstract class MongoSimpleTypes {

	private static final Set<Class<?>> MONGO_SIMPLE_TYPES = new HashSet<Class<?>>();

	static {
		MONGO_SIMPLE_TYPES.add(DBRef.class);
		MONGO_SIMPLE_TYPES.add(ObjectId.class);
		MONGO_SIMPLE_TYPES.add(CodeWScope.class);
	}

	public static final SimpleTypeHolder HOLDER = new SimpleTypeHolder(MONGO_SIMPLE_TYPES, true);

	private MongoSimpleTypes() {
	}
}
