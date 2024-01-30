public class Zadanie6 {
    private long[] array;
    private int size;

    public Zadanie6(long[] array) {
        this.array = array;
        this.size = array.length;
    }
    public void remove(long value) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != value) {
                array[newIndex] = array[i];
                newIndex++;
            }
        }
        size = newIndex;
    }
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 2, 5, 2, 7};
        Zadanie6 remover = new Zadanie6(array);
        System.out.println("Tablica przed usunięciem: ");
        remover.printArray();
        long valueToRemove = 2;
        remover.remove(valueToRemove);
        System.out.println("Tablica po usunięciu wartości " + valueToRemove + ":");
        remover.printArray();
    }
}