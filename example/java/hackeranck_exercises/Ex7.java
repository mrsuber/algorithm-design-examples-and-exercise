// determain minimum number of bribes in a queue and if any one bribes more than 2, return too chaic
import java.util.*;
class Ex7{
  public static void minimumNumberOfBribes(int[] arr){
    for(int i=0;i<arr.length;i++){
      if(arr[i]>i+2){
        System.out.println("too chaitic");
        break;
      }
    }
  }
  public static void bubbleSort(int[] arr)
  {
      int n = arr.length;
      int count=0;
      for (int i = 0; i < n-1; i++){
        for (int j = 0; j < n-i-1; j++){
          if (arr[j] > arr[j+1]) {
              // swap arr[j+1] and arr[j]
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
              count++;
              System.out.println(count);

          }
        }
        if (count >2){
          System.out.println("too ciotic");
        }
        count=0;
      }


              System.out.println(Arrays.toString(arr));
              System.out.println(count);
  }

  public static void main(String args[]){
    // Scanner scan = new Scanner(System.in);
    // int number_of_times_to_test_program= scan.nextInt();
    // for(int i=0;i<number_of_times_to_test_program;i++){
    //   int array_length = scan.nextInt();
    //   int[] array = new int[array_length];
    //   for(int j=0 ; j<array_length;j++){
    //     array[i]=scan.nextInt();
    //   }
    //   minimumNumberOfBribes(array);
    // }
    //
    // scan.close();
    int[] array = {2, 1, 5, 3, 4};//12534,12354,12345
    int[] array2 = {2, 5, 1, 3, 4};//12534,12354,12345
    bubbleSort(array);


  }
}
