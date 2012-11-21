package collections.impl;

import collections.impl.ArrayImpl;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ListImplTest {

    @Test
    public void without_argument_should_have_1_size() {
        ArrayImpl list = new ArrayImpl();
        assertEquals(list.size(), 1);
    }

    @Test
    public void with_argument_5_should_have_5_size() {
        ArrayImpl list = new ArrayImpl(5);
        assertEquals(list.size(), 5);
    }

    @Test // zwiekszamy rozmiar 2 -> 4
    public void should_have_4_size() {
        ArrayImpl list = new ArrayImpl(2);
        list.add(5);
        list.add(6);
        list.add(7);
        assertEquals(list.size(), 4);
    }

    @Test   // zwiekszamy rozmiar dodajac ponownie 2->4->8(
    public void should_have_8_size() {
        ArrayImpl list = new ArrayImpl(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        assertEquals(list.size(), 8);
    }

    @Test   // test funkcji get z obiektem
         public void should_return_10() {
        ArrayImpl list = new ArrayImpl(2);
        list.add(10);
        assertEquals(list.get(0), 10);
    }

    @Test   // test funkcji get bez obiektu
    public void should_return_null() {
        ArrayImpl list = new ArrayImpl(2);
        list.add(10);
        assertEquals(list.get(1), null);
    }

    @Test   // test funkcji get ostatni elemnt
    public void should_return_11() {
        ArrayImpl list = new ArrayImpl(2);
        list.add(10);
        list.add(11);
        assertEquals(list.get(list.size()-1), 11);
    }

    // test kasowania elementu o zadanym indeksie
    @Test
    public void should_return_eight_using_remove() {
        ArrayImpl list = new ArrayImpl(4);
        list.add(10);
        list.add(11);
        list.add(8);
        list.add(9);
        // tablica 10 11 8 9
        list.remove(0);
        // tablica 11 8 9
        assertEquals(list.get(0), 11);
    }

    // test kasowania elementu o zadanym indeksie, na koncu null
    @Test
    public void should_return_null_using_remove() {
        ArrayImpl list = new ArrayImpl(4);
        list.add(10);
        list.add(11);
        list.add(8);
        list.add(9);
        // tablica 10 11 8 9
        list.remove(0);
        // tablica 11 8 9 null
        assertEquals(list.get(3), null);
    }


    @Test (expectedExceptions = IllegalArgumentException.class)
    public void should_throw_exception_when_given_negative_size() {

        ArrayImpl list = new ArrayImpl(-1);

    }


    @Test
    public void should_handle_zero_sized_array() {
        ArrayImpl list = new ArrayImpl(0);

        list.add(1);
        list.add(2);

        assertEquals(list.size(), 2);
    }


    @Test
    public void array_should_return_proper_size_after_removing_element() {

        ArrayImpl list = new ArrayImpl(4);

        assertEquals(list.size(), 0);

        list.add(1);
        list.add(2);

        assertEquals(list.size(), 2);


        list.remove(0);

        assertEquals(list.size(), 1);

    }


    @Test (expectedExceptions = IllegalArgumentException.class)
    public void should_throw_exception_when_given_illegal_index() {

        ArrayImpl list = new ArrayImpl();

        list.remove(-100);

    }

}
