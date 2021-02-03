package VehiclePartsTest;

import VehicleParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Fuel");
    }

    @Test
    public void hasEngineType(){
        assertEquals("Fuel", engine.getEngineType());
    }
}
