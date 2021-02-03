package VehiclePartsTest;

import VehicleParts.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres(55);
    }

    @Test
    public void hasSize(){
        assertEquals (55, tyres.getSize());
    }
}
