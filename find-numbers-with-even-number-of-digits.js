// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

var findNumbers = function(nums) {
    return nums.reduce((ac, el)=>{
        if(((el+"").split("").length)%2===0)
            return ac+1
        else return ac+0
    },0)
};