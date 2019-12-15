package testCases;

import common.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestCases4_assertionTypes extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestCases4_assertionTypes.class.getName());

    @BeforeEach
    void beforeEach() {
        LOG.info("This is beforeEach()");
    }

    @AfterEach
    void afterEach() {
        LOG.info("This is afterEach()");
    }

    @Test
    void test_assertTruePass() {
        LOG.info("This is test_assertTruePass()");
        assertTrue(steps.getTrue());
    }

    @Test
    void test_assertTrueFail() {
        LOG.info("This is test_assertTrueFail()");
        assertTrue(steps.getFalse());
    }

    @Test
    void test_assertFalsePass() {
        LOG.info("This is test_assertFalsePass()");
        assertFalse(steps.getFalse());
    }

    @Test
    void test_assertFalseFail() {
        LOG.info("This is test_assertFalseFail()");
        assertFalse(steps.getTrue());
    }

    @Test
    void test_assertNullPass() {
        LOG.info("This is test_assertNullPass()");
        assertNull(steps.getNull());
    }

    @Test
    void test_assertNullFail() {
        LOG.info("This is test_assertNullFail()");
        assertNull(steps.getNotNull());
    }

    @Test
    void test_assertNotNullPass() {
        LOG.info("This is test_assertNotNullPass()");
        assertNotNull(steps.getNotNull());
    }

    @Test
    void test_assertNotNullFail() {
        LOG.info("This is test_assertNotNullFail()");
        assertNotNull(steps.getNull());
    }

    @Test
    void test_assertEqualsPass() {
        LOG.info("This is test_assertEqualsPass()");
        assertEquals(steps.getNumber(10), steps.getNumber(10));
    }

    @Test
    void test_assertEqualsFail() {
        LOG.info("This is test_assertEqualsFail()");
        assertEquals(steps.getNumber(10), steps.getNumber(9));
    }

    @Test
    void test_assertArrayEqualsPass() {
        LOG.info("This is test_assertArrayEqualsPass()");
        assertArrayEquals(steps.getArray(1, 5, 10), steps.getArray(1, 5, 10));
    }

    @Test
    void test_assertArrayEqualsFail() {
        LOG.info("This is test_assertArrayEqualsFail()");
        assertArrayEquals(steps.getArray(1, 5, 10), steps.getArray(1, 10, 5));
    }

    @Test
    void test_assertIterableEqualsPass() {
        LOG.info("This is test_assertIterableEqualsPass()");
        assertIterableEquals(steps.getIterable(1, 5, 10), steps.getIterable(1, 5, 10));
    }

    @Test
    void test_assertIterableEqualsFail() {
        LOG.info("This is test_assertIterableEqualsFail()");
        assertIterableEquals(steps.getIterable(1, 5, 10), steps.getIterable(1, 10, 5));
    }

    @Test
    void test_assertLinesMatchPass() {
        LOG.info("This is test_assertLinesMatchPass()");
        assertLinesMatch(steps.getList("word1", "word2", "word3"), steps.getList("word1", "word2", "word3"));
    }

    @Test
    void test_assertLinesMatchFail() {
        LOG.info("This is test_assertLinesMatchFail()");
        assertLinesMatch(steps.getList("word1", "word2", "word3"), steps.getList("word1", "word3", "word2"));
    }

    @Test
    void test_assertNotEqualsPass() {
        LOG.info("This is test_assertNotEqualsPass()");
        assertNotEquals(steps.getNumber(1), steps.getNumber(2));
    }

    @Test
    void test_assertNotEqualsFail() {
        LOG.info("This is test_assertNotEqualsFail()");
        assertNotEquals(steps.getNumber(1), steps.getNumber(1));
    }


    @Test
    void test_assertSamePass() {
        LOG.info("This is test_assertSamePass()");
        assertSame(steps.getNumber(1), steps.getNumber(1));
    }

    @Test
    void test_assertSameFail() {
        LOG.info("This is test_assertSameFail()");
        assertSame(steps.getNumber(1), steps.getNumber(2));
    }


    @Test
    void test_assertNotSamePass() {
        LOG.info("This is test_assertNotSamePass()");
        assertNotSame(steps.getNumber(1), steps.getNumber(2));
    }

    @Test
    void test_assertNotSameFail() {
        LOG.info("This is test_assertNotSameFail()");
        assertNotSame(steps.getNumber(1), steps.getNumber(1));
    }


    @Test
    void test_assertAllPass() {
        LOG.info("This is test_assertAllPass()");
        assertAll(
                () -> assertTrue(steps.getTrue()),
                () -> assertEquals(steps.getNumber(1), steps.getNumber(1)),
                () -> assertNull(steps.getNull())
        );
    }

    @Test
    void test_assertAllFail() {
        LOG.info("This is test_assertAllFail()");
        Integer number1 = 1;
        Integer number2 = 2;
        assertAll(
                () -> assertTrue(steps.getTrue()),
                () -> assertEquals(steps.getNumber(1), steps.getNumber(2)),
                () -> assertNull(steps.getNull())
        );
    }

    @Test
    void test_assertAllFail2() {
        LOG.info("This is test_assertAllFail2()");
        assertAll("Asserting 4 conditions",
                () -> assertTrue(steps.getTrue()),
                () -> assertEquals(steps.getNumber(1), steps.getNumber(2)),
                () -> assertNull(steps.getNull()),
                () -> assertFalse(steps.getTrue())
        );
    }

    @Test
    void test_assertThrowsPass() {
        LOG.info("This is test_assertThrowsPass()");
        assertThrows(IllegalArgumentException.class, () -> steps.throwIllegalArgumentException("test_assertThrowsPass"));
    }

    @Test
    void test_assertThrowsFail() {
        LOG.info("This is test_assertThrowsFail()");
        assertThrows(FileNotFoundException.class, () -> steps.throwIllegalArgumentException("test_assertThrowsFail"));
    }
}
