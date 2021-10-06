// There is a string,S ,
//  of lowercase English letters that is repeated infinitely many times.
//   Given an integer,n , find and print the number of letter a's in
//   the first  letters of the infinite string.
// example:
// s="abcac"
// n=10
//
// The substring we consider is "abcacabcac", the first 10 characters of the infinite string.
// There are  occurrences of a in the substring.
// Function Description
//
// Complete the repeatedString function in the editor below.
//
// repeatedString has the following parameter(s):
//
// s: a string to repeat
// n: the number of characters to consider
// Returns
//
// int: the frequency of a in the substring

class ex4{

  public static int frequency(String s, int n){
    int number=0;
    char str[] = new char[n];
    // pupulating aray
    int pos =0;
    for(int i=0;i<n;i++){
      if(pos==s.length()){
        pos=0;
      }
      str[i]=s.charAt(pos);
      pos++;
    }
    // print string array to see what is in it
    for(int i=0;i<str.length;i++){
      if(str[i]=='a'){
        number++;
      }
      System.out.print(str[i]+" ");
    }

    return number;
  }
  public static int frequency2(String s, int n){
    int number1=0;
    int number2=0;
    int s_length=s.length();
    int number_substr_in_s=(n/s_length);
    int remender = n-(number_substr_in_s*s_length);
    // counting 'a' in s
    for(int i=0;i<s_length;i++){
      if(s.charAt(i)=='a'){
        number1++;
      }
    }
    //counting 'a' in remender
    if(remender>0){
      for(int i=0;i<remender;i++){
        if(s.charAt(i)=='a'){
          number2++;
        }
      }
    }

    // calculationgs
    int anwer = (number1*number_substr_in_s)+number2;


    return anwer;
  }
  public static void main(String args[]){
    String s="aba";
    int n = 10;
    int answer = frequency2(s,n);
    System.out.println(answer);
  }
}
