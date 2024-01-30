public class Zadanie3 {
    private int[] array;
    public Zadanie3(int[] array) {
        this.array = array;
    }
    public void reverse() {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Zadanie3 zadanie3 = new Zadanie3(array);
        System.out.println("Oryginalna tablica: " + java.util.Arrays.toString(array));
        zadanie3.reverse();
        System.out.println("Odwrócona tablica: " + java.util.Arrays.toString(array));
    }
}