public class Zadanie4 {
    private long[] array;
    public Zadanie4(long[] array) {
        this.array = array;
    }
    public long max() {
        if (array == null || array.length == 0) {
            throw new IllegalStateException("Tablica jest pusta.");
        }
        long maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        long[] array = {1, 10, 100, 1000, 10000, 10002};
        Zadanie4 zadanie4 = new Zadanie4(array);
        try {
            long maxElement = zadanie4.max();
            System.out.println("Element maksymalny w tablicy: " + maxElement);
        } catch (IllegalStateException element) {
            System.out.println(element.getMessage());
        }
    }
}