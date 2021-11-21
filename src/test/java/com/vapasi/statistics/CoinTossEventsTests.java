package com.vapasi.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CoinTossEventsTests {
    @Test
    void shouldReturnProbabilityOfHeadsEqualToTails(){

        CoinTossEvents heads = new CoinTossEvents(0.5);
        CoinTossEvents tails = new CoinTossEvents(0.5);

        assertEquals(heads, tails);

    }

    @Test
    void shouldReturnProbabilityOfHeadsNotEqualToTails(){

        CoinTossEvents heads = new CoinTossEvents(0.4);
        CoinTossEvents tails = new CoinTossEvents(0.5);

        assertNotEquals(heads, tails);

    }

    @Test
    void shouldReturnProbabilityOfTwoEventsOccurringTogether(){

        CoinTossEvents eventOne = new CoinTossEvents(0.5);
        CoinTossEvents eventTwo = new CoinTossEvents(0.5);
        CoinTossEvents expectedResult = new CoinTossEvents(0.25);

        assertEquals(expectedResult, eventOne.probabilityOfTwoEvents(eventTwo));

    }

    @Test
    void shouldNotReturnProbabilityOfTwoEventsOccurringTogether(){

        CoinTossEvents eventOne = new CoinTossEvents(0.5);
        CoinTossEvents eventTwo = new CoinTossEvents(0.5);
        CoinTossEvents expectedResult = new CoinTossEvents(0.5);

        assertNotEquals(expectedResult, eventOne.probabilityOfTwoEvents(eventTwo));

    }

    @Test
    void shouldReturnProbabilityOfAnEventNotOccurring(){

        CoinTossEvents probabilityOfEvent = new CoinTossEvents(0.5);
        CoinTossEvents expectedResult = new CoinTossEvents(0.5);

        assertEquals(expectedResult, probabilityOfEvent.probabilityOfNotAnEvent());

    }

    @Test
    void shouldReturnProbabilityOfEitherOfTwoEventsOccurring(){

        CoinTossEvents eventOne = new CoinTossEvents(0.5);
        CoinTossEvents eventTwo = new CoinTossEvents(0.5);
        CoinTossEvents expectedResult = new CoinTossEvents(0.75);

        assertEquals(expectedResult, eventOne.probabilityOfEitherOfTwoEvents(eventTwo));

    }

    @Test
    void shouldNotReturnProbabilityOfEitherOfTwoEventsOccurring(){

        CoinTossEvents eventOne = new CoinTossEvents(0.5);
        CoinTossEvents eventTwo = new CoinTossEvents(0.8);
        CoinTossEvents expectedResult = new CoinTossEvents(0.75);

        assertNotEquals(expectedResult, eventOne.probabilityOfEitherOfTwoEvents(eventTwo));

    }
}
