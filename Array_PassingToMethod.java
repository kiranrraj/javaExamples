public class Array_PassingToMethod {
    
    static void ArrayMin(int arr[]) {
        int smallElem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallElem > arr[i]) {
                smallElem = arr[i];
            }
        }
        System.out.println("The smallest element in array is " + smallElem);

    }

    public static void main(String args[]) {
        int[] array1 = { 23, 34, 2, 11, 1 };
        ArrayMin(array1);

    }
}