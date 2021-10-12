// rotating an array d number of times to the left and returning the rotated numberArray
import java.io.*;
import java.util.*;
class Ex6{
  public static int[] rotateArray(int[] arr,int d){

    // int[] array=new int[arr.length];
    if(d >= arr.length){
      int a = d/arr.length;
      int b = d-a*arr.length;
      d=b;
      System.out.println("i saw this");
    }
    if(d==0){
      return arr;
    }

    for(int i =0;i<d;i++){
      int first = arr[0];
      for(int j=0;j<arr.length-1;j++){

        arr[j]=arr[j+1];
      }
      arr[arr.length-1]= first;
    }
    return arr ;
  }
  public static int[] rotateArray2(int[] arr, int d){

      //2,3,4,5,6
      if(d >= arr.length){
        int a = d/arr.length;
        int b = d-a*arr.length;
        d=b;
        System.out.println("i saw this");
      }
      if(d==0){
        return arr;
      }
      int last = arr[arr.length-1];
    for(int i=0;i<arr.length;i++){
      if((arr[i]+d)>last){
        System.out.println("i saw this");
        arr[i]=(arr[i]+d)-(arr[arr.length-1]);
      }else if((arr[i]+d)<=last){
          System.out.println("this is it");
        arr[i]=arr[i]+d;
      }

    }

    return arr;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int arr_size=sc.nextInt();
    int[] array = new int[arr_size];
    for(int i=0;i< arr_size;i++){
      array[i]=sc.nextInt();
    }
    sc.close();

    int answer[] = rotateArray(array,d);

    for(int i=0;i<answer.length;i++){
        System.out.print(answer[i]+" ");
    }
    System.out.println();

  }
}
