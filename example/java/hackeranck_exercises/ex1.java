
class ex1 {
  // There is a large pile of socks that must be paired by color.
  // Given an array of integers representing the color of each sock,
  // determine how many pairs of socks with matching colors there are.
  //
  // Example:
  // n=7
  // ar=[1,2,1,2,1,3,2]
  // There is one pair of color 1 and one of color 2 .
  // There are three odd socks left, one of each color.
  // The number of pairs is 2.
  //
  // Function Description
  //
  // Complete the sockMerchant function in the editor below.
  //
  // sockMerchant has the following parameter(s):
  // int n: the number of socks in the pile
  // int ar[n]: the colors of each sock
  //
  // Returns
  // int: the number of pairs

    public static void sockMerchant(int n, int [] arr){
      //printing the array unsorted array
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+ " ");

      }
        System.out.println("unsorted array");
      //sort the array using boble sort
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1;j++){
          if(arr[j]<arr[j+1]){
            // swap arr[j+1] and arr[j]
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }

        }
      }

      //printing the array sorted array
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+ " ");

      }
        System.out.println("sorted array");

// linear scan of clors to know number of pair count
    int number_of_pair_count=0;

    for(int i=0;i<arr.length;i++){
    
      if((i+1) < (arr.length)){
        if(arr[i]==arr[i+1]){
          number_of_pair_count ++;
          i++;
        }
      }
    }
    System.out.println("number of counts is: "+ number_of_pair_count);

    }

    public static void main( String args[] ) {
        int [] colors_of_each_sock = {1,2,1,2,1,3,2};
        int number_of_socks_in_the_pile = 7;
        sockMerchant(number_of_socks_in_the_pile, colors_of_each_sock);

        // for(int i=0;i<arr.length;++i){
        //   System.out.print(arr[i] + " ");
        // }
    }
}
