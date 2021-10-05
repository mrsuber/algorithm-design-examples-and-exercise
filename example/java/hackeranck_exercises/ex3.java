// There is a new mobile game that starts with consecutively numbered clouds.
//  Some of the clouds are thunderheads and others are cumulus.
//  The player can jump on any cumulus cloud having a number that is equal to
//  the number of the current cloud plus 1 or 2
//  The player must avoid the thunderheads. Determine the minimum number
//  of jumps it will take to jump from the starting postion to the last cloud.
//  It is always possible to win the game.
// For each game, you will get an array of clouds numbered 0  if they are safe or 1
// if they must be avoided.
class ex3{
  public static int jumpingOnClouds(int [] c){
    int number=0;
    //going trough the array and determinging minimum number of jumpingOnClouds
    for(int i=0;i<c.length;i++){
      if((i+2)<c.length){
        if(c[i+2]==0){
          number++;
          i++;
          continue;
        }
      }
      if((i+1)<c.length){
        if(c[i+1]==0){
          number++;
          continue;
        }else break;
      }
    }

    return number;
  }
  public  static void main(String args[]){
    int [] clouds = {0,0,1,0,0,1,0};
    int number=jumpingOnClouds(clouds);
    System.out.println("number of jumps is: "+number);
  }
}
