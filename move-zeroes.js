// https://leetcode.com/problems/move-zeroes/
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

var moveZeroes = function(nums) {
    let iteration= nums.length
   for(let i=0 ; i<iteration ; i++){
        if(nums[i]===0){
            nums.splice(i, 1);
            nums.push(0);
            i--;
            iteration--;
        }
   }
};
