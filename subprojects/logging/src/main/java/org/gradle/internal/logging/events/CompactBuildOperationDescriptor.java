/*
 * Copyright 2016 the original author or authors.
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
package org.gradle.internal.logging.events;

import org.gradle.api.Nullable;

import java.io.Serializable;

/**
 * Compactly represent a BuildOperationDescriptor, but avoiding expensive details to avoid cost of
 * serializing possibly-large Objects in the {@link org.gradle.internal.progress.BuildOperationDescriptor} details.
 */
public class CompactBuildOperationDescriptor implements Serializable {
    private final Object operationId;
    private final Class<?> operationType;

    public CompactBuildOperationDescriptor(@Nullable Object operationId, @Nullable Class<?> operationType) {
        this.operationId = operationId;
        this.operationType = operationType;
    }

    @Nullable
    public Object getOperationId() {
        return operationId;
    }

    @Nullable
    public Class<?> getOperationType() {
        return operationType;
    }
}
