public class Zadanie1 {
    private long[] array;
    public Zadanie1(long[] array) {
        this.array = array;
    }
    public boolean find(long key) { //metoda bool find
        for (long element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long[] array = {1, 4, 7, 2, 9, 5};
        Zadanie1 zadanie1 = new Zadanie1(array);

        long keyToFind = 7;
        if (zadanie1.find(keyToFind)) {
            System.out.println("Znaleziono wartość " + keyToFind + " w tablicy.");
        } else {
            System.out.println("Nie znaleziono wartości " + keyToFind + " w tablicy.");
        }
        keyToFind = 3;
        if (zadanie1.find(keyToFind)) {
            System.out.println("Znaleziono wartość " + keyToFind + " w tablicy.");
        } else {
            System.out.println("Nie znaleziono wartości " + keyToFind + " w tablicy.");
        }
    }
}