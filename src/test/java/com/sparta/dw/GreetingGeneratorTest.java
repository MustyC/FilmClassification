package com.sparta.dw;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.sparta.dw.GreetingGenerator.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GreetingGeneratorTest {

    private GreetingGenerator greetingGenerator = new GreetingGenerator();

    @Test
    public void goodMorningVietnam() {
        //act
        String actualResult = greetingGenerator.getGreeting(8);
        //assert
        Assertions.assertEquals(GOOD_MORNING, actualResult);
        //another way of asserting
        assertThat(actualResult).isEqualTo(GOOD_MORNING);
    }

    @Test
    public void goodMorning(){
        String actualResult = greetingGenerator.getGreeting(8);
        Assertions.assertEquals(GOOD_MORNING, actualResult);
    }

    @Test
    public void goodAfternoon(){
        //arrange
        String actualResult = greetingGenerator.getGreeting(13);
        //TODO create assert
        Assertions.assertEquals(GOOD_AFTERNOON, actualResult);
    }

    @Test
    public void midday() {
        // Cathy said this was a good idea
        String actualResult = greetingGenerator.getGreeting(12);
        Assertions.assertEquals(GOOD_MORNING, actualResult);
    }

    @Test
    public void goodEvening(){
        String actualResult = greetingGenerator.getGreeting(19);
        Assertions.assertEquals(GOOD_EVENING, actualResult);
    }

    @Test
    public void earlyHours() {
        String actualResult = greetingGenerator.getGreeting(25);
        Assertions.assertEquals(INVALID, actualResult);
    }

    @Test
    public void testWhenNumberLessThan0(){
        String actualResult = greetingGenerator.getGreeting(-1);
        Assertions.assertEquals(INVALID, actualResult);
    }
}