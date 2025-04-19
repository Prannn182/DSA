/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const result=[];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){ //checking condition 
        result.push(arr[i]) //filters the result
        }
       
    }
     return result
};