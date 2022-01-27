package packageclient;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCliente {
    private Cliente c;

    @BeforeEach
    void setup() {
        c = new Cliente();
    }

    @Test
    void NumberTest(){
        assertEquals(3, c.suma(1,2));
    }

}
