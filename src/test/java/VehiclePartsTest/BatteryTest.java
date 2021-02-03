package VehiclePartsTest;

import VehicleParts.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before() {
        battery = new Battery(10);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, battery.getCapacity());
    }
}


