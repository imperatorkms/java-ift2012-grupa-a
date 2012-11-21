package collections.utils;

import collections.impl.ArrayImpl;
import collections.impl.LinkedList;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 21.11.12
 */
public class LinkedListUtilsTest {


    private LinkedListUtils utils;


    @BeforeMethod
    public void setUp() {
        utils = new LinkedListUtils();
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void max_mth_should_throw_exception_for_empty_array() {

        LinkedList list = new LinkedList();
        assertEquals(utils.max(list), 0);
    }


    @Test (expectedExceptions = IllegalArgumentException.class)
    public void min_mth_should_throw_exception_for_empty_array() {

        LinkedList list = new LinkedList();
        assertEquals(utils.min(list), 0);
    }


    @Test
    public void revers_on_empty_list_should_be_equals_to_itself() {
        LinkedList list = new LinkedList();

        assertEquals(utils.reverse(list), list);
    }


}
