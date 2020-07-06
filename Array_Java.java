public class Array_Java {
    public static void main(String args[]) {
        int[] emptyArray = new int [3];
        System.out.println(emptyArray[0]); // Default value 0
        System.out.println(emptyArray[1]); // Default value 0
        System.out.println(emptyArray[2]); // Default value 0

        int[] nums = {1,2,3,4,5};
        int sum = 0;
        double avg;
        int length  = nums.length;
        

        for( int num : nums) {
            System.out.println("Elements of array "+ num);
            sum = sum + num;
        }

        avg = sum/length;

        System.out.println("Sum of array elements is : " + sum);
        System.out.println("Length of array is : " + length);
        System.out.println("Average of array elements is : " + avg);
    }
}