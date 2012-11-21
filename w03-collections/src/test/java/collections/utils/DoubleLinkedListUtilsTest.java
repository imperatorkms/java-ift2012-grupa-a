package collections.utils;

import collections.impl.DoubleLinkedList;
import collections.impl.LinkedList;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 21.11.12
 */
public class DoubleLinkedListUtilsTest {


    private DoubleLinkedListUtils utils;


    @BeforeMethod
    public void setUp() {
        utils = new DoubleLinkedListUtils();
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void max_mth_should_throw_exception_for_empty_array() {

        DoubleLinkedList list = new DoubleLinkedList();
        assertEquals(utils.max(list), 0);
    }



    @Test (expectedExceptions = IllegalArgumentException.class)
    public void min_mth_should_throw_exception_for_empty_array() {

        DoubleLinkedList list = new DoubleLinkedList();
        assertEquals(utils.min(list), 0);
    }


    @Test
    public void revers_on_empty_list_should_be_equals_to_itself() {
        DoubleLinkedList list = new DoubleLinkedList();

        assertEquals(utils.reverse(list), list);
    }


}
