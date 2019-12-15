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
class TestCases3_passes extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestCases3_passes.class.getName());

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
    void test2_pass() {
        LOG.info("This is test2_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    void test3_pass() {
        LOG.info("This is test3_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    void test4_pass() {
        LOG.info("This is test4_pass()");
        assertTrue(steps.getTrue());
    }

}
