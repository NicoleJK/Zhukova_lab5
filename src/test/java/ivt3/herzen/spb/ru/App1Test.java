package ivt3.herzen.spb.ru;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ni on 10.01.2016.
 */
public class App1Test {
    private App1 app1;

    @Before
    public void initialize() {
        app1 = new App1();
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(1, app1.add(2, -1));
        assertEquals(-2, app1.add(-1, -1));
        assertEquals(7, app1.add(4, 3));
    }

    @Test
    public void testMult() throws Exception {
        assertEquals(5.57f, app1.mult(5, 1.114f), 0.0001);
        assertEquals(-0.05736f, app1.mult(-4, 0.01434f), 0.0001);
        assertEquals(11.998f, app1.mult(-2, -5.999f), 0.0001);
    }

    @Test
    public void testMult1() throws Exception {
        assertEquals(0, app1.mult(0, 3));
        assertEquals(-4, app1.mult(-4, 1));
        assertEquals(14, app1.mult(-2, -7));
    }

    @Test
    public void testStr() throws Exception {
        assertEquals("parovoz", app1.str("paro", "voz"));
        assertEquals("254111", app1.str("254", "111"));
        assertEquals("1abc2cde", app1.str("1abc", "2cde"));
    }

    @Test
    public void testFunc() throws Exception {
        assertEquals(1.66666667f, app1.func(-2), 0.000001);
        assertEquals(5.09683996f, app1.func(0.019f), 0.000001);
        assertEquals(-0.79101408f, app1.func(7.321f), 0.000001);
        assertEquals(5, app1.func(0), 0.0001);
        assertEquals(1.66666667f, app1.func(-2), 0.0001);
        assertEquals(Double.POSITIVE_INFINITY, app1.func(1), 0.000001);
    }
}
