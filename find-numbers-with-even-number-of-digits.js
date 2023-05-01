// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Input: nums = [12,345,2,6,7896]
// Output: 2

var findNumbers = function(nums) {
    return nums.reduce((ac, el)=>{
        if(((el+"").split("").length)%2===0)
            return ac+1
        else return ac+0
    },0)
};