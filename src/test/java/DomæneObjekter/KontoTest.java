package DomæneObjekter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto konto = new Konto("navn","1",100);

    @Test
    void insert() {

        assertEquals(200, konto.insert(100));
    }

    @Test
    void insertnegativ() {
        assertEquals(100, konto.insert(-100));
    }

    @Test
    void hævfrasaldo() {
        assertEquals(50, konto.hæv(50));
    }

    @Test
    void withdrawnegativt() {
        assertEquals(100, konto.hæv(-50));
    }

    @Test
    void withdrawabove() {
        assertEquals(100, konto.hæv(1200));
    }
}
