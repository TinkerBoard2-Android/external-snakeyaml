/**
 * Copyright (c) 2008-2009 Andrey Somov
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
package org.yaml.snakeyaml.constructor;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicJavaBean {
    private float amount;
    private AtomicLong atomic;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public AtomicLong getAtomic() {
        return atomic;
    }

    public void setAtomic(AtomicLong atomic) {
        this.atomic = atomic;
    }

    @Override
    public String toString() {
        return "AtomicJavaBean";
    }
}