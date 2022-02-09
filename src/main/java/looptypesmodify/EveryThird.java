package looptypesmodify;

public class EveryThird {
    int[] changeToZero(int[] numbers){
        for (int i = numbers.length -1; i >= 0; i -= 3) {
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        EveryThird et = new EveryThird();
        int[] numbers = new int[]{2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        et.changeToZero(numbers);

        for (int i: numbers) {
            System.out.print(i + ", ");
        }
    }
}
