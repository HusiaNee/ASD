public class Zadanie5 {
    private long[] array;
    public Zadanie5(long[] array) {
        this.array = array;
    }
    public long min() {
        if (array == null || array.length == 0) {
            throw new IllegalStateException("Tablica jest pusta.");
        }
        long minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        long[] array = {1, 10, 100, 1000, 10000, 10002};
        Zadanie5 zadanie5 = new Zadanie5(array);
        try {
            long minElement = zadanie5.min();
            System.out.println("Element minimalny w tablicy: " + minElement);
        } catch (IllegalStateException element) {
            System.out.println(element.getMessage());
        }
    }
}