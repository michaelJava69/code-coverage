import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CircleTest {

	private double diameter = 10;
	  
	private Circle circle;
	
	@Before
    public void setUp() {
        circle = new Circle(diameter);
    }

    @Test
    public void getArea() {
        assertThat(circle.getArea(), is(Math. PI * diameter/2 * diameter/2));
    }

    @Test
    public void getDiameter() {
        assertThat(circle.getDiameter(), is(diameter));
    }

    
    @Test
    public void setDiameter() {
         circle.setDiameter(diameter);
    	 assertThat(circle.getArea(), is(Math. PI * diameter/2 * diameter/2));
    }
    
}
