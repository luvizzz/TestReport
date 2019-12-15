package testCases;

import common.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestCases4_ordered extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestCases4_ordered.class.getName());

    @BeforeEach
    void beforeEach() {
        LOG.info("This is beforeEach()");
    }

    @AfterEach
    void afterEach() {
        LOG.info("This is afterEach()");
    }

    @Test
    @Order(0)
    void test1_pass() {
        LOG.info("This is test1_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    @Order(2)
    void test2_pass() {
        LOG.info("This is test2_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    @Order(3)
    void test3_v1_pass() {
        LOG.info("This is test3_v1_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    @Order(3)
    void test3_v2_pass() {
        LOG.info("This is test3_v2_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    @Order(3)
    void test3_v3_pass() {
        LOG.info("This is test3_v3_pass()");
        assertTrue(steps.getTrue());
    }

    @Test
    @Order(3)
    void test3_v4_pass() {
        LOG.info("This is test3_v4_pass()");
        assertTrue(steps.getTrue());
    }

}
