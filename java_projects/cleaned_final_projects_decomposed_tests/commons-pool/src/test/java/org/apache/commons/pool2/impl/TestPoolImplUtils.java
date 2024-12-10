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
package org.apache.commons.pool2.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class TestPoolImplUtils {

    @SuppressWarnings("unused")
    private abstract static class FactoryAB<A, B> extends BasePooledObjectFactory<B> {}

    private abstract static class FactoryBA<A, B> extends FactoryAB<B, A> {}

    private abstract static class FactoryC<C> extends FactoryBA<C, String> {}

    @SuppressWarnings("unused")
    private abstract static class FactoryDE<D, E> extends FactoryC<D> {}

    private abstract static class FactoryF<F> extends FactoryDE<Long, F> {}

    private static class NotSimpleFactory extends FactoryF<Integer> {
        @Override
        public Long create() throws Exception {
            return null;
        }

        @Override
        public PooledObject<Long> wrap(final Long obj) {
            return null;
        }
    }

    private static class SimpleFactory extends BasePooledObjectFactory<String> {
        @Override
        public String create() throws Exception {
            return null;
        }

        @Override
        public PooledObject<String> wrap(final String obj) {
            return null;
        }
    }

    private static final Instant INSTANT_1 = Instant.ofEpochMilli(1);

    private static final Instant INSTANT_0 = Instant.ofEpochMilli(0);

    @Test
    public void testFactoryTypeNotSimple_test0_decomposed()  {
        final Class<?> result = PoolImplUtils.getFactoryType(NotSimpleFactory.class);
    }

    @Test
    public void testFactoryTypeNotSimple_test1_decomposed()  {
        final Class<?> result = PoolImplUtils.getFactoryType(NotSimpleFactory.class);
        assertEquals(Long.class, result);
    }

    @Test
    public void testFactoryTypeSimple_test0_decomposed()  {
        final Class<?> result = PoolImplUtils.getFactoryType(SimpleFactory.class);
    }

    @Test
    public void testFactoryTypeSimple_test1_decomposed()  {
        final Class<?> result = PoolImplUtils.getFactoryType(SimpleFactory.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testMaxInstants_test0_decomposed()  {
        assertEquals(INSTANT_1, PoolImplUtils.max(INSTANT_0, INSTANT_1));
        assertEquals(INSTANT_1, PoolImplUtils.max(INSTANT_1, INSTANT_0));
        assertEquals(INSTANT_1, PoolImplUtils.max(INSTANT_1, INSTANT_1));
        assertEquals(INSTANT_0, PoolImplUtils.max(INSTANT_0, INSTANT_0));
    }

    @Test
    public void testMinInstants_test0_decomposed()  {
        assertEquals(INSTANT_0, PoolImplUtils.min(INSTANT_0, INSTANT_1));
        assertEquals(INSTANT_0, PoolImplUtils.min(INSTANT_1, INSTANT_0));
        assertEquals(INSTANT_1, PoolImplUtils.min(INSTANT_1, INSTANT_1));
        assertEquals(INSTANT_0, PoolImplUtils.min(INSTANT_0, INSTANT_0));
    }

    @Test
    public void testToChronoUnit_test0_decomposed()  {
        assertEquals(ChronoUnit.NANOS, PoolImplUtils.toChronoUnit(TimeUnit.NANOSECONDS));
        assertEquals(ChronoUnit.MICROS, PoolImplUtils.toChronoUnit(TimeUnit.MICROSECONDS));
        assertEquals(ChronoUnit.MILLIS, PoolImplUtils.toChronoUnit(TimeUnit.MILLISECONDS));
        assertEquals(ChronoUnit.SECONDS, PoolImplUtils.toChronoUnit(TimeUnit.SECONDS));
        assertEquals(ChronoUnit.MINUTES, PoolImplUtils.toChronoUnit(TimeUnit.MINUTES));
        assertEquals(ChronoUnit.HOURS, PoolImplUtils.toChronoUnit(TimeUnit.HOURS));
        assertEquals(ChronoUnit.DAYS, PoolImplUtils.toChronoUnit(TimeUnit.DAYS));
    }

    @Test
    public void testToDuration_test0_decomposed()  {
        assertEquals(Duration.ZERO, PoolImplUtils.toDuration(0, TimeUnit.MILLISECONDS));
        assertEquals(Duration.ofMillis(1), PoolImplUtils.toDuration(1, TimeUnit.MILLISECONDS));
        for (final TimeUnit tu : TimeUnit.values()) {
            assertEquals(Duration.ZERO, PoolImplUtils.toDuration(0, tu));
        }
    }
}