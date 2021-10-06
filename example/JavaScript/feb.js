//memoization
// storing in object
// let memo={};
function fibonachie(n,memo={}){
  if( memo[n]) return memo[n];
  if(n<=2) return 1;
  memo[n]=fibonachie(n-1,memo) + fibonachie(n-2,memo);
  return memo[n];
}

console.log(fibonachie(50))
