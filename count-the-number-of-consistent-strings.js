// https://leetcode.com/problems/count-the-number-of-consistent-strings/

var countConsistentStrings = function (allowed, words) {
    return words.reduce((count, element) => {
      let test = element.split("").reduce((all, char) => {
        return allowed.includes(char) && all;
      }, true);
      return count + (test ? 1 : 0);
    }, 0);
  };
  
  console.log(countConsistentStrings("ab", ["ad", "bd", "aaab", "baa", "badab"]));
  