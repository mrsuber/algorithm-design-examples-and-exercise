import java.io.*;
import java.util.*;
class ex1_insertionSort {

    public static void sortInsertion(int [] sort_arr){

      for(int i=0;i<sort_arr.length;++i){

        int j = i;
        //pointer j starts for index 1,
        while(j > 0 && sort_arr[j-1]>sort_arr[j]){
            //program checks that the element at j-i is greater than at j
            //if that is the case, swap those elements
            //check again if element at index j-1 is greater than j
            //keep swaping if that is the case
          int key = sort_arr[j];
          sort_arr[j] = sort_arr[j-1];
          sort_arr[j-1] = key;
          j = j-1;

        }
      }
    }

    public static void main( String args[] ) {
        int [] arr = {5,2,12,12,1};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;++i){
        //   System.out.print(arr[i] + " ");
        // }
    }
}
