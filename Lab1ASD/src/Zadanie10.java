public class Zadanie10 {
    private long[] array;
    private int size;
    public Zadanie10(long[] array) {
        this.array = array;
        this.size = array.length;
    }
    public int numberInstances(long key) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 2, 5, 2, 7, 2};
        Zadanie10 counter = new Zadanie10(array);
        System.out.println("Tablica:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        long key = 2;
        int instances = counter.numberInstances(key);
        System.out.println("Liczba wystąpień elementu " + key + " w tablicy: " + instances);
    }
}