package collections.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 06.11.12
 */
public class HashMapTest {

    @Test
    public void empty_map_should_have_zero_size() {
        HashMap map = new HashMap();
        assertEquals(map.size(), 0);
    }
}
