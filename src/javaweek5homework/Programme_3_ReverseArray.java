package javaweek5homework;

/**
 *  Write a Java program to reverse an array of integer values
 */
public class Programme_3_ReverseArray {
        public static void main(String[] args) {
            int[] originalArray = {10, 20, 30, 40, 50};

            System.out.print("Original array: ");
            printArray(originalArray);

            reversingArray(originalArray);

            System.out.print("Reversed array: ");
            printArray(originalArray);
        }

        public static void reversingArray(int[] array) {
            int left = 0;
            int right = array.length -1;

            while (left<right){
                //Swap elements at left and right indices
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                // Move indices towards center
                left++;
                right--;
            }
        }

        //printing array's elements one by one
        public static void printArray(int[] array) {
            for (int num: array){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

