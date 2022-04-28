package com.sparta.dw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.sparta.dw.GreetingGenerator.*;


class ParameterisedGreetingGeneratorTest {

    @ParameterizedTest
    @ValueSource(ints = {5, 12})
    void goodMorning() {
        //arrange
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        //act
        String actualResult = greetingGenerator.getGreeting(8);
        //assert
        Assertions.assertEquals("Good Morning!", actualResult);
    }

    void goodAfternoon() {
        //arrange
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        //act
        String actualResult = greetingGenerator.getGreeting(18);
        //assert
        //TODO create an assertion
        Assertions.assertEquals("Good Afternoon!", actualResult);
    }

    @Test
    void goodEvening() {
        //arrange
        GreetingGenerator greetingGenerator = new GreetingGenerator();
        //act
        String actualResult = greetingGenerator.getGreeting(20);
        //assert
        Assertions.assertEquals("Good Evening!", actualResult);
    }
}