package collections.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 06.11.12
 */
public class LinkedListTest {

    @Test
    public void empty_list_should_have_zero_size() {
        LinkedList list = new LinkedList();
        assertEquals(list.size(), 0);
    }
}
