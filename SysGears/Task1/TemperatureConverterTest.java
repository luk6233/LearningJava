package SysGears.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void converter() {
        assertEquals("{K: 273, F: 32}", new TemperatureConverter().converter("0C"));
        assertEquals("{C: 0, F: 32}", new TemperatureConverter().converter("273K"));
        assertEquals("{C: 0, K: 273}", new TemperatureConverter().converter("32F"));
    }
}