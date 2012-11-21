package collections.utils;

import collections.impl.ArraySet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 21.11.12
 */
public class ArraySetUtilsTest {


    private ArraySetUtils utils;


    @BeforeMethod
    public void setUp() {
        utils = new ArraySetUtils();
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void max_mth_should_throw_exception_for_empty_array() {

        ArraySet set = new ArraySet();
        assertEquals(utils.max(set), 0);
    }


    @Test (expectedExceptions = IllegalArgumentException.class)
    public void min_mth_should_throw_exception_for_empty_array() {

        ArraySet list = new ArraySet();
        assertEquals(utils.min(list), 0);
    }


    @Test
    public void revers_on_empty_list_should_be_equals_to_itself() {
        ArraySet set = new ArraySet();

        assertEquals(utils.reverse(set), set);
    }


}
