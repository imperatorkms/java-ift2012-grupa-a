package collections.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 06.11.12
 */
public class DoubleLinkedListTest {

    @Test
    public void empty_list_should_have_zero_size() {
        DoubleLinkedList list = new DoubleLinkedList();
        assertEquals(list.size(), 0);
    }
}
