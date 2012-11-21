package collections.utils;

import collections.impl.ArraySet;
import collections.impl.ArrayStack;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 21.11.12
 */
public class ArrayStackUtilsTest {


    private ArrayStackUtils utils;


    @BeforeMethod
    public void setUp() {
        utils = new ArrayStackUtils();
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void max_mth_should_throw_exception_for_empty_array() {

        ArrayStack stack = new ArrayStack();
        assertEquals(utils.max(stack), 0);
    }


    @Test (expectedExceptions = IllegalArgumentException.class)
    public void min_mth_should_throw_exception_for_empty_array() {

        ArrayStack stack = new ArrayStack();
        assertEquals(utils.min(stack), 0);
    }


    @Test
    public void revers_on_empty_list_should_be_equals_to_itself() {
        ArrayStack stack = new ArrayStack();

        assertEquals(utils.reverse(stack), stack);
    }


}
