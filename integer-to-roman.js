// https://leetcode.com/problems/integer-to-roman/
// Input: num = 58
// Output: "LVIII"

// Not working yet
var intToRoman = function (num) {
    const iteration = num / 5;
    let rest = num % 5;
    const roman = [];
    console.log(iteration, rest);
    if (iteration > 1) {
      let temp = iteration % 10;
      console.log(intToRomanChar((iteration - temp) * 5));
      roman.push(intToRomanChar((iteration - temp) * 5));
      // roman.push(intToRoman(5 * temp));
    } else {
      while (rest > 0) {
        if (intToRomanChar(rest) !== 0) {
          roman.push(intToRomanChar(rest));
          break;
        } else {
          roman.push("I");
          rest--;
        }
      }
    }
    return roman;
};
  
var intToRomanChar = function (c) {
    switch (c) {
        case 1:
        return "I";
        case 5:
        return "V";
        case 10:
        return "X";
        case 50:
        return "L";
        case 100:
        return "C";
        case 500:
        return "D";
        case 1000:
        return "M";
        default:
        return null;
    }
};