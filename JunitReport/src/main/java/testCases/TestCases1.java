package testCases;

import common.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestCases1 extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestCases1.class.getName());

    @BeforeEach
    void beforeEach() {
        LOG.info("This is beforeEach()");
    }

    @AfterEach
    void afterEach() {
        LOG.info("This is afterEach()");
    }

    @Test
    void test1_pass() {
        LOG.info("This is test1_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    void test2_fail() {
        LOG.info("This is test2_fail()");
        assertTrue(steps.getFalse());
    }

    @Test
    void test3_random(){
        LOG.info("This is test3_random()");
        assertTrue(steps.getRandomBoolean());
    }

}
