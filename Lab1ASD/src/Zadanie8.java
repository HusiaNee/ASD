public class Zadanie8 {
    private int[] array;
    private int size;
    public Zadanie8(int[] array) {
        this.array = array;
        this.size = array.length;
    }
    public int even() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Zadanie8 counter = new Zadanie8(array);
        System.out.println("Tablica:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int evenCount = counter.even();
        System.out.println("Liczba elementów parzystych w tablicy: " + evenCount);
    }
}