package collections.impl;

import collections.impl.ArrayImpl;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ListImplTest {


    @Test
    public void empty_list_should_have_zero_size() {
        ArrayImpl list = new ArrayImpl();
        assertEquals(list.size(), 0);
    }


}
