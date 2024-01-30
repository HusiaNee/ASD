public class Zadanie9 {
    private int[] array;
    private int size;
    public Zadanie9(int[] array) {
        this.array = array;
        this.size = array.length;
    }
    public int odd() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Zadanie9 counter = new Zadanie9(array);
        System.out.println("Tablica:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        int oddCount = counter.odd();
        System.out.println("Liczba elementów nieparzystych w tablicy: " + oddCount);
    }
}