package array;

public class ArrayHandler {
    void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + i;
        }
    }

    void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] words = {"a", "b", "c", "d"};

        ArrayHandler ah = new ArrayHandler();

        ah.addIndexToNumber(numbers);
        for ( int number: numbers)
            System.out.print(number + ", ");

        System.out.println();

        ah.concatenateIndexToWord(words);
        for (String word: words)
            System.out.print(word + ", ");
    }
}
