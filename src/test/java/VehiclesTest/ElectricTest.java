package VehiclesTest;

import VehicleParts.Engine;
import Vehicles.Electric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine("electric");
        electric = new Electric("Blue", 25000, engine, 75);
    }


    @Test
    public void hasColour() {
        assertEquals("Blue", electric.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(25000, electric.getPrice());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electric.getEngine());
    }

    @Test
    public void hasBatteryLevelPercentage() {
        assertEquals(75, electric.getBatteryLevelPercentage());
    }
}
