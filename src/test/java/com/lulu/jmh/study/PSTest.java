package com.lulu.jmh.study;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

/**
 * @Description:
 * @Author: Milo
 * @Date: 2020-08-02 13:09
 */
public class PSTest {
    @Benchmark
    @Warmup(iterations = 1,time = 3)
    @Fork(5)
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 1,time = 3)
    public void testForEach() {
        PS.parallel();
    }
}
