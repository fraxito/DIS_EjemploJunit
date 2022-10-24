package com.ufv.dis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruebaSimpleTest {
    PruebaSimple miPrueba = new PruebaSimple();
    @Test
    void prueba1() {
        assertEquals(false,  miPrueba.prueba1(1,2));
    }
}