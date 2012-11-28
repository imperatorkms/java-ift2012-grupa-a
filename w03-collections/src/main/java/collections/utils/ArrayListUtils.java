    package collections.utils;

import collections.impl.ArrayImpl;

import java.util.Collections;

/**
 * User: Marcin Matuszak
 * Date: 21.11.12
 */
public class ArrayListUtils {

    public int max(ArrayImpl list) {

        Object obj = list.get(0);
        if (obj == null)
            throw new IllegalArgumentException("array is null or empty");
        Object h;
        int result = Integer.parseInt(obj.toString());
        int s;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != null){
                h = list.get(i);
                s = Integer.parseInt(h.toString());
                if (s > result)
                    result = s;
            }
        }
        return result;

    }

    public int min(ArrayImpl list) {

        Object obj = list.get(0);
        if (obj == null)
            throw new IllegalArgumentException("array is null or empty");
        Object h;
        int result = Integer.parseInt(obj.toString());
        int s;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != null){
                h = list.get(i);
                s = Integer.parseInt(h.toString());
                if (s < result)
                    result = s;
            }
        }
        return result;

    }

    public ArrayImpl reverse(ArrayImpl list) {

        return list;
    }

    public void swap(ArrayImpl list, int x, int y) {
    }

    public void fill(ArrayImpl list, Object value) {

    }

}
