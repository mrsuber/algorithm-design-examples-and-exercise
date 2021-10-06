// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// given that array, print the largest sum of
// a b c
//   d
// e f g

class Ex5{
  public static int hourGlass(int[][] metrix){
  if(metrix.length<3 || metrix[0].length<3 || metrix[1].length<1 || metrix[2].length<3){
    return -1;
  }
    int answer = metrix[0][0]+metrix[0][1]+metrix[0][2]+metrix[1][1]+metrix[2][0]+metrix[2][1]+metrix[2][2];
    for(int i=0;i<metrix.length;i++){
      for(int j=0;j<metrix[i].length;j++){
        if((j+2)<metrix[i].length && (i+2)<metrix.length){
          int temp = metrix[i][j]+metrix[i][j+1]+metrix[j][j+2]+metrix[i+1][j+1]+metrix[i+2][j]+metrix[i+2][j+1]+metrix[i+2][j+2];
          if(answer<temp){
            answer = temp;
          }
        }

      }

    }
    return answer;
  }
  public static void main(String args[]){
    int metrix[][] = {
     {0,1,0,0,0,0},
     {1, 1, 1, 0, 0, 0},
     {0, 0, 2, 4, 4, 0},
     {0, 0, 0, 2, 0, 0},
     {0, 0, 1, 2, 4, 0},
   };
   // int metrix[][]={{0,1},{1,2}};
  int answer = hourGlass(metrix);
    System.out.println(answer);
  }
}
