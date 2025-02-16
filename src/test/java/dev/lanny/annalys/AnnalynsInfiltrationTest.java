package dev.lanny.annalys;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AnnalynsInfiltrationTest {
    @Test
    @DisplayName("Validamos que el caballero esta despierto y no se puede atacar")
    void testCantFastAttack_KnightIsAwake() {
        boolean knightIsAwake = true;
        assertFalse(AnnalynsInfiltration.canFastAttack(knightIsAwake));
    }

    @Test
    @DisplayName("Validamos que el caballero esta dormido y se puede atacar")
    void testCantFastAttack_KnightIsSleeping() {
        boolean knightIsAwake = false;
        assertTrue(AnnalynsInfiltration.canFastAttack(knightIsAwake));
    }

}
