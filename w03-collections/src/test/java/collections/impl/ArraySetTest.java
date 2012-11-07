package collections.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 06.11.12
 */
public class ArraySetTest {

    @Test
    public void empty_set_should_have_zero_size() {
        ArraySet set = new ArraySet();
        assertEquals(set.size(), 0);
    }

}
