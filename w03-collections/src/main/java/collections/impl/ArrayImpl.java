package collections.impl;
import java.util.Arrays;

public class ArrayImpl {

    int rozmiar;
    int ile_danych;
    Object tablica[];

    // tutaj konstruktor gdy nie podamy zadnego argumentu
    // domyślny rozmiar 1 dla ulatwienia zwiekszania *2
    public ArrayImpl()
    {
       rozmiar = 1;
        tablica = new Object[1];
    }

    // tutaj konstruktor ktory utworzy tablice z rozmiarem rownym argumentowi
    public ArrayImpl(int r)
    {
        rozmiar = r;
        tablica = new Object[r];
    }

    // metoda dodawania do listy, zwieksza rozmiar *2 w razie potrzeby
    public void add(Object element) {
        // jezeli barkuje miejsca zwiekszamy tablice
        if(tablica[rozmiar-1] != null){
           tablica = Arrays.copyOf(tablica, this.size()*2);
           rozmiar = this.size()*2;
        }

        // dodajemy
        tablica[ile_danych++] = element;
    }


    //zwraca obiekt pod podanym indeksem
    public Object get(int index) {
        return tablica[index];
    }

    // zwraca rozmiar
    public int size() {
        return rozmiar;
    }

    // usuwamy obiekt o konkretnym indeksie, dosuwamy cala tablicę w lewo
    public void remove(int index) {
        for (int i = index; i < this.size()-1; i++)
             tablica[i] = tablica[i+1];
        // ostatniemu elementowi przypisujemy wartosc null, wazne gdy wszystkie elementy tablicy wypelnione
        tablica[this.size()-1] = null;
    }

}
