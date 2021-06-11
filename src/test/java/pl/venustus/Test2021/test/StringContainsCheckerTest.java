package pl.venustus.Test2021.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringContainsCheckerTest {
    private StringContainsChecker stringContainsChecker;

    @BeforeEach
    void setUp() {
        stringContainsChecker = new StringContainsChecker();
    }

    @Test
    void shouldFoundStingAInStringB() {
        //given
        String testA = "qwerty", testB = "qswdeffrgthhyy";
        //when
        Boolean result = stringContainsChecker.checkContainString(testA, testB);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotFoundStingAInStringB() {
        //given
        String testA = "qwerty", testB = "qswdeffrghhyy";
        //when
        Boolean result = stringContainsChecker.checkContainString(testA, testB);
        //then
        assertThat(result).isFalse();
    }
}