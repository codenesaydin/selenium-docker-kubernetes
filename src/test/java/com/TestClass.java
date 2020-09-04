package com;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class TestClass
{
    @Test
    public void test() throws InterruptedException
    {
        System.out.println(Thread.currentThread().hashCode());
        Thread.sleep(1000);
    }

    @Test
    void test2() throws InterruptedException
    {
        System.out.println(Thread.currentThread().hashCode());
        Thread.sleep(1000);
    }

    @Test
    void test3() throws InterruptedException
    {
        System.out.println(Thread.currentThread().hashCode());
        Thread.sleep(1000);
    }
}
