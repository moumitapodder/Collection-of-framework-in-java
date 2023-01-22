import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     
     int index = Arrays.binarySearch(numbers, 10);
    

    System.out.println("The index of element 10 in the array is " + index);

        Integer[] num = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        Arrays.sort(numbers);

        Arrays.parallelSort(num);
        // 8192

       Arrays.fill(numbers, 13);

        for (int i : numbers) {
            System.out.print(i + " ");
        }



    }
}
