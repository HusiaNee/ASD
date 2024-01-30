public class Zadanie7 {
    private long[] array;
    private int size;
    public Zadanie7(long[] array) {
        this.array = array;
        this.size = array.length;
    }
    public long average() {
        long sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] >= 0) {
                sum += array[i];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
    public static void main(String[] args) {
        long[] array = {5, -3, 12, 8, -2, 3, 7};
        Zadanie7 sredniaArytmetyczna = new Zadanie7(array);

        System.out.println("Tablica:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        long srednia = sredniaArytmetyczna.average();
        System.out.println("Średnia arytmetyczna elementów nieujemnych tablicy: " + srednia);
    }
}