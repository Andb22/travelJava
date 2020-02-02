import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

        Plane plane;

        @Before
        public void before(){
            plane = new Plane(PlaneType.BOEING747);
        }

        @Test
        public void hasWeight(){
            assertEquals(420000, plane.getWeightFromEnum());
        }
}
