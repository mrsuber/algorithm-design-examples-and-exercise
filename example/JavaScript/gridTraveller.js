//travelling from top left to bottom right

function gridTravel(m,n,memo={}){
  let key = m+','+n;
  //checking if key is in memo
  if(memo[key])return memo[key]
  if(n==1 && m ==1) return 1;
  if(n==0 || m==0) return 0;
  memo[key]= gridTravel(m-1,n,memo)+gridTravel(m,n-1,memo);
  return memo[key]

}
console.log("one by one grid",gridTravel(1,1))
console.log("zero by one grid",gridTravel(0,1))
console.log("two by three grid",gridTravel(2,3))
console.log("18 by 18 grid",gridTravel(18,18))
