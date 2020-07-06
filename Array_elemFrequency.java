public class Array_elemFrequency {
    public static void main (String args[]){
        int[] arr1 = {1,2,4,3,2,1,2,3,4,6,3};
        int len = arr1.length;
        int[] arrFeq = new int[len];
        int counted = -1;
        
        for(int i=0; i<len; i++){
            int count = 1;
            int elem = arr1[i];
            for(int j= i+1; j<len;j++){
                if(elem == arr1[j]){
                    count++;
                    arrFeq[j] = counted;
                }

            }
            if(arrFeq[i] != counted){
                arrFeq[i] = count;
            }
        }

        System.out.println("Frequency of elements");
        for(int k =0; k<arrFeq.length; k++){
            if(arrFeq[k] != counted ) {
                System.out.println(arr1[k]+ " --- " + arrFeq[k]);
            }
        }
    }
}