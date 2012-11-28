package collections.impl;

/**
 * User: KMS
 * Date: 14.11.12
 */
public class ArraySet {


    private int my_size=0;
    private int my_capasity=10;
    private  int[] tablica= new int[10] ;

    public ArraySet(int start_capasity){
        if(start_capasity>my_capasity)
        {
            my_capasity=start_capasity;
            tablica=new int[my_capasity] ;
        }
    }

    public ArraySet(){
    }

    public void add(int element) {
    }

    
    public boolean isEmpty() {
        if(my_size==0)return true;
        return false;
    }

    
    public int size() {
        return 0;
    }

    
    public boolean contains(Object element) {
        return false;
    }

    
    public int indexOf(Object element) {
        return 0;
    }
}