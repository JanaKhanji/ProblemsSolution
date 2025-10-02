// https://leetcode.com/problems/container-with-most-water/
//Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49


// Failed: Time Limit Exceeded
var maxArea = function (height) {
    let max = 0;
    for (let i = 0; i < height.length; i++) {
      for (let j = i + 1; j < height.length; j++) {
        let temp = (j - i) * Math.min(height[i], height[j]);
        if (temp > max) max = temp;
      }
    }
    return max;
  };