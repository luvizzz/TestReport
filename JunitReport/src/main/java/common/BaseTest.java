package common;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import testSteps.Steps;

public class BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);

    protected Steps steps = new Steps();

    @BeforeAll
    private void beforeAll() {
        LOG.info("This is beforeAll()");
    }

    @AfterAll
    private void afterAll() {
        LOG.info("This is afterAll()");
    }
}