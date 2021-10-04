// An avid hiker keeps meticulous records of their hikes.
// During the last hike that took exactly steps steps,
// for every step it was noted if it was an uphill,U , or a downhill, D step.
//  Hikes always start and end at sea level, and each step up or down represents
//   a 1  unit change in altitude. We define the following terms:
//
// A mountain is a sequence of consecutive steps above sea level,
//  starting with a step up from sea level and ending with a step down to sea level.
// A valley is a sequence of consecutive steps below sea level,
// starting with a step down from sea level and ending with a step up to sea level.
// Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
//
// Example
//
//  steps = 8 path = [DDUUUUDD]
//
// The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high.
//  Finally, the hiker returns to sea level and ends the hike.
//
// Function Description
//
// Complete the countingValleys function in the editor below.
//
// countingValleys has the following parameter(s):
//
// int steps: the number of steps on the hike
// string path: a string describing the path
// Returns
//
// int: the number of valleys traversed

class ex2{
  public static int countingValleys(int steps, String path){

    //breaking down the path string to a single character
    int D_count=0;
    int U_count=0;

    int hill = 0;
      int valley = 0;
    int valley_number_V_and_H=0;
    for(int i=0;i<steps;i++){

      if(path.charAt(i)=='D'){
        D_count++;
        if(D_count==U_count){
          valley_number_V_and_H++;
          D_count=0;
          U_count=0;
          if(path.charAt(i)=='D'){
            hill++;
          }
          if(path.charAt(i)=='U'){
            valley++;
          }
        }
      }
      if(path.charAt(i)=='U'){
        U_count++;
        if(D_count==U_count){
          valley_number_V_and_H++;
          D_count=0;
          U_count=0;
          if(path.charAt(i)=='D'){
            hill++;
          }
          if(path.charAt(i)=='U'){
            valley++;
          }
        }
      }
      // System.out.println(path.charAt(i));
    }
    System.out.println("hill No: "+ hill);
    System.out.println("valley No: "+ valley);
    System.out.println("total No: "+ valley_number_V_and_H);
    // if(valley_number_V_and_H%2==0){
    //   return valley_number_V_and_H/2;
    // }
    return valley;
  }

  public static void main(String args []){
    int steps = 8;
    String path = "DDUUUUDD";
     int answer = countingValleys(steps, path);
     System.out.println(answer);
  }
}
