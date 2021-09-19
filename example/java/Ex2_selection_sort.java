import java.io.*;
import java.util.*;
class ex2_SelectionSort {
  public static void swap(int x, int y, int[] arr) {
  int temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
}
    public static void sortSelection(int [] arr){
      int n = arr.length;

          // One by one move boundary of unsorted subarray
          for (int i = 0; i < n-1; i++)
          {
              // Find the minimum element in unsorted array
              int min_idx = i;
              for (int j = i+1; j < n; j++)
                  if (arr[j] < arr[min_idx])
                      min_idx = j;

              // Swap the found minimum element with the first
              // element
              int temp = arr[min_idx];
              arr[min_idx] = arr[i];
              arr[i] = temp;
          }

    }

    public static void main( String args[] ) {
        int [] arr = {5,2,12,12,1};
        sortSelection(arr);
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;++i){
          System.out.print(arr[i] + " ");
        }
    }
}
