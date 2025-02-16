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

    @Test
    @DisplayName("Validamos que todos los personajes estan dorminos, devuelve false")
    void testCanSpy_WhenAllAreSleep() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }
    @Test
    @DisplayName("Validamos que solo el caballero esta despierto, devuelve true")
    void testCanSpy_WhenOnlyKnightIsAwake()  {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }
    @Test
    @DisplayName("Validamos que solo el arquero esta despierto, devuelve true")
    void testCanSpy_WhenOnlyArcherIsAwake()  {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }
    @Test
    @DisplayName("Validamos que solo el prisionero esta despierto, devuelve true")
    void testCanSpy_WhenOnlyPrisonerIsAwake()  {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }
    @Test
    @DisplayName("Validamos que todos estan despierto, devuelve true")
    void testCanSpy_WhenOnlyAllIsAwake()  {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }
    @Test
    @DisplayName("Validamos que el caballero y el arquero estan despierto, devuelve true")
    void testCanSpy_When_KnightAndArcher_IsAwake()  {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;

        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    @DisplayName("Validamos que el caballero y el prisionero estan despierto, devuelve true")
    void testCanSpy_When_KnightAndPrisoner_IsAwake()  {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;

        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    @DisplayName("Validamos que el caballero y el arquero estan despierto, devuelve true")
    void testCanSpy_When_ArcherAndPrisoner_IsAwake()  {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    @DisplayName("Validamos que el arquero esta dormido y el prisionero esta despierto, devuelve true")
    void testCanSignalPrisoner_WhenArcherIsAsleep_AndPrisonerIsAwake() {
        
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    @DisplayName("Validamos que el arquero esta despierto, y el prisionero esta despierto, devuelve false")
    void testCanSignalPrisoner_WhenArcherIsAwake_AndPrisonerIsAwake() {
        
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    @DisplayName("Validamos que el arquero esta dormido, pero el prisionero está dormido (debe devolver false)")
    void testCanSignalPrisoner_WhenArcherIsAsleep_AndPrisonerIsAsleep() {
       
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    @DisplayName("Validamos que el arquero está despierto y el prisionero está dormido (debe devolver false)")
    void testCanSignalPrisoner_WhenArcherIsAwake_AndPrisonerIsAsleep() {
   
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

}
