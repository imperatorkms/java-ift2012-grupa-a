// zmiany: utworzenie pol i konstruktora

package collections.impl;
import java.util.Arrays;

public class ArrayImpl {

    int rozmiar;
    int array[] = new int[rozmiar];

    public ArrayImpl(int podaj_rozmiar)
    {
        rozmiar = podaj_rozmiar;
    }

    public void add(Object element) {
        if(array[rozmiar] != 0)                           // poki co
            array = Arrays.copyOf(rozmiar, rozmiar*2);
        // dalej...
    }

  
    public Object get(int index) {
        return null;
    }

    
    public int size() {
        return 0;
    }

    
    public void remove(int index) {
    }

}
