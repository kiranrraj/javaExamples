public class Array_copyMethod {
    public static void main(String[] args) {
        int[] arr1 = {1,23,4,5,67,89};
        int len = arr1.length;
        int[] arr2 = new int[len];

        for(int i=0; i<len;i++){
            arr2[i] = arr1[i];
        }

        for(int j=0; j<len; j++){
            System.out.print(arr2[j] + " ");
        }
    }
}