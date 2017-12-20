/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.yardstick.ml.math;

import org.apache.ignite.ml.math.Matrix;
import org.apache.ignite.ml.math.StorageConstants;
import org.apache.ignite.ml.math.impls.matrix.SparseDistributedMatrix;

/**
 * Ignite benchmark that performs ML Grid operations.
 * Todo: IGNITE-7097, complete implementation of this benchmark.
 */
@SuppressWarnings("unused")
public class IgniteSparseDistributedMatrixMulBenchmark extends IgniteAbstractMatrixMulBenchmark {
    /** {@inheritDoc} */
    @Override Matrix newMatrix(int rowSize, int colSize) {
        return new SparseDistributedMatrix(rowSize, colSize,
            StorageConstants.ROW_STORAGE_MODE, StorageConstants.RANDOM_ACCESS_MODE);
    }
}