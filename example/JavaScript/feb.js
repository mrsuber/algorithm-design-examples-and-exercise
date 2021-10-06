//memoization
// storing in object

function fibonachie(n,memo={}){
  // let memo={};
  if(n in memo) return memo[n];
  if(n<=2) return 1;
  memo[n]=fibonachie(n-1,memo) + fibonachie(n-2,memo);
  return memo[n];
}

console.log(fibonachie(50))
