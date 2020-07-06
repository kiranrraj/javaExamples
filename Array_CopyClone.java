public class Array_CopyClone {
    public static void main(String args[]){

    int[] arr3 = new int[5];
    int[] arr4 = new int[5];

    int []arr1 = {1,2,3,4,5,6,7,8,9,10};
    int []arr2 = {6,7,8,9,10};

    System.arraycopy(arr1, 2, arr3, 0, 5);
    System.out.println("Array from arraycopy");
    for (int i=0; i<arr3.length; i++){
        System.out.print(arr3[i] + " ");
    }

    System.out.printf("%nArray from clone%n");
    arr4 =  arr2.clone();
    for (int i=0; i<arr4.length; i++){
        System.out.print(arr4[i] + " ");
    }


    }
    
}