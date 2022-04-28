package com.sparta.dw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Classification_Tests {
    private static FilmClassifications films = new FilmClassifications();

    @Test
    void testUnderTwelve() {
        assertEquals(films.availableClassifications(11), "U, PG & 12A films are available.", "Returned value is wrong or invalid.");
    }

    @Test
    void testIsTwelve() {
        assertEquals(films.availableClassifications(12), "U, PG, 12A & 12 films are available.", "Returned value is wrong or invalid.");
    }

    @Test
    void testIsFourtneen() {
        assertEquals(films.availableClassifications(14), "U, PG, 12A & 12 films are available.", "Returned value is wrong or invalid.");
    }

    @Test
    void testIsFifteen() {
        assertEquals(films.availableClassifications(15), "U, PG, 12A, 12 & 15 films are available.", "Returned value is wrong or invalid.");
    }

    @Test
    void testIsSeventeen() {
        assertEquals(films.availableClassifications(17), "U, PG, 12A, 12 & 15 films are available.", "Returned value is wrong or invalid.");
    }

    @Test
    void testIsEighteen(){
        assertEquals(films.availableClassifications(18), "All films are available.", "Returned value is wrong or invalid.");
    }

}
