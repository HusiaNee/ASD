public class Zadanie2 {
    private long[] array;
    public Zadanie2(long[] array) {
        this.array = array;
    }
    public boolean findBin(long key) { //metoda wyszukiwania binarnego
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == key) {
                return true;
            } else if (array[middle] < key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        long[] array = {1, 2, 4, 5, 7, 9};
        Zadanie2 zadanie2 = new Zadanie2(array);

        long keyToFind = 7;
        if (zadanie2.findBin(keyToFind)) {
            System.out.println("Znaleziono wartość " + keyToFind + " w tablicy.");
        } else {
            System.out.println("Nie znaleziono wartości " + keyToFind + " w tablicy.");
        }
        keyToFind = 3;
        if (zadanie2.findBin(keyToFind)) {
            System.out.println("Znaleziono wartość " + keyToFind + " w tablicy.");
        } else {
            System.out.println("Nie znaleziono wartości " + keyToFind + " w tablicy.");
        }
    }
}