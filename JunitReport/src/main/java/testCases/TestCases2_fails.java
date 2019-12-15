package testCases;

import common.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestCases2_fails extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestCases2_fails.class.getName());

    @BeforeEach
    void beforeEach() {
        LOG.info("This is beforeEach()");
    }

    @AfterEach
    void afterEach() {
        LOG.info("This is afterEach()");
    }

    @Test
    void test1_fails() {
        LOG.info("This is test1_fails()");
        assertTrue(steps.getFalse());
    }

    @Test
    void test2_fails() {
        LOG.info("This is test2_fails()");
        assertTrue(steps.getFalse());
    }

    @Test
    void test3_fails() {
        LOG.info("This is test3_fails()");
        assertTrue(steps.getFalse());
    }

    @Test
    void test4_fails() {
        LOG.info("This is test4_fails()");
        assertTrue(steps.getFalse());
    }
}
