package Unit_test;

import static org.junit.jupiter.api.Assertions.*;
// Izzó és add class pad..


class CalculatorTest {
    private Calculator calc;    // Deklaráljuk a példányt.

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calc = new Calculator();    // Példányosítjuk a példánynak.
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(0, calc.add(0,0));     // assertEquals-t használjuk, első az expected/várt value, a másik az actual/kapott érték. Ide kell a függvényt betenni.
        //Vizsgálja, hogy egyenlő vagy nem egyenlő a két tag. Boolean.
        assertEquals(-5, calc.add(-2,-3));
        assertEquals(-6, calc.add(10, -16));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(6, calc.subtract(-14, -20));
        assertEquals(0, calc.subtract(0, 0));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(0, calc.multiply(-99, 0));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(5, calc.divide(-10,-2));
    }

    @org.junit.jupiter.api.Test
    void isPositive() {
        assertTrue(calc.isPositive(10));    // Igazat tesztel, és igazat kap, azaz átmegy a teszten.
        assertFalse(calc.isPositive(0));    // Hamisat tesztel, és hamisat is kap, ezért  szintén átmegy.
        assertFalse(calc.isPositive(-11));
    }

    @org.junit.jupiter.api.Test // Ezt átmásoljuk, írunk saját tesztet:
    void divideByZero() {
        assertThrows(ArithmeticException.class,()-> calc.divide(2, 0)); // kell a .class az vizsgált exception osztályhoz, illetve a ()-> -vel tudunk függvényt meghívni.
    }
}