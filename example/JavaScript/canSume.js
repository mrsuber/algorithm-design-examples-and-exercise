function canSum(targetSum,numberArray,memo={}){
  if(memo[targetSum])return memo[targetSum];
  if(targetSum===0)return true;
  if(targetSum<0)return false;
  for(let i=0;i<numberArray.length;i++){
    // if(targetSum==numberArray[i]) return true;
    let num = numberArray[i];
    const remainder = targetSum-num;
    if(canSum(remainder,numberArray,memo)===true){
      memo[targetSum]=true;
      return true;
    }


  }
  memo[targetSum]=false;
  return false;
}
console.log(canSum(7,[2,3]))
console.log(canSum(7,[5,3,4,7]))
console.log(canSum(7,[2,4]))
console.log(canSum(300,[7,14]))
// console.log(7,[2,3,])
