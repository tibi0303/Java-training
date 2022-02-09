package looptypes;

public class Sum {
    void printSums(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            int numb = numbers[i-1] + numbers[i];
            System.out.print(numb + ", ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 6, 3, 5, 7, 9};
        Sum sum = new Sum();
        sum.printSums(numbers);
    }
}
