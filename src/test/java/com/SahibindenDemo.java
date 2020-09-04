package com;

import com.base.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@Tag("SampleTest")
public class SahibindenDemo extends BaseTest
{
    @Test
    public void test() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.get("https://github.com/swtestacademy/junit5-parallel-testing/blob/master/src/test/java/tests/BaseTest.java");
        Thread.sleep(10000);
    }

    @Test
    void test2() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.get("https://www.swtestacademy.com/junit5-parallel-test-execution/");
        Thread.sleep(10000);
    }

    @Test
    void test3() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.get("https://jenkins.gtest.sahibindenlocal.net/jenkins/");
        Thread.sleep(10000);

    }
}
