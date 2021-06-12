package pl.venustus.Test2021.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ShortWayLadderTest {
    private ShortWayLadder shortWayLadder;

    @BeforeEach
    void setUp() {
        shortWayLadder = new ShortWayLadder();
    }

    @Test
    void shouldCalcShortWayLadderReturnCorrectValue() {
        //given
        String testString = "1 10 100 1 10 15 10 23";
        //when
        Integer result = shortWayLadder.calcShortWayLadder(testString);
        //then
        assertThat(result).isEqualTo(55);
    }

}