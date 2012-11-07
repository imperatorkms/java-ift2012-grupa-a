package collections.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * User: Marcin Matuszak
 * Date: 06.11.12
 */
public class ArrayStackTest {


    @Test
    public void empty_stack_should_have_zero_size() {
        ArrayStack stack = new ArrayStack();
        assertEquals(stack.size(), 0);
    }
}
