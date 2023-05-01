// https://leetcode.com/problems/count-the-number-of-consistent-strings/
// Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
// Output: 2

var countConsistentStrings = function (allowed, words) {
    return words.reduce((count, element) => {
      let test = element.split("").reduce((all, char) => {
        return allowed.includes(char) && all;
      }, true);
      return count + (test ? 1 : 0);
    }, 0);
};

  