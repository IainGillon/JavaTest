import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 'f');
    }
    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void readToHibernateIfGreaterThan80(){
        assertEquals(true, bear.bearReadyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Baloo", 25, 65.44, 'f');
        assertEquals(false, thinBear.bearReadyToHibernate());
    }
    @Test
    public void hasAGender(){
        assertEquals('f', bear.getGender());
    }
}
