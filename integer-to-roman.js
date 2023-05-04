// https://leetcode.com/problems/integer-to-roman/
// Input: num = 58
// Output: "LVIII"

var intToRoman = function (num) {
  let roman = [];
  let array = num.toString().split("");
  console.log(array);
  for (let i = 0; i < array.length; i++) {
    const element = array[array.length - i - 1];
    let rest = element % 5;
    // get the digit from 1 to 3 or 6 to 8
    if (rest >= 1 && rest <= 3) {
      while (rest > 0) {
        roman.unshift(intToRomanChar(10 ** i));
        rest--;
      }
      if (element > 5) {
        roman.unshift(intToRomanChar(5 * 10 ** i));
      }
    // get the digit for 4 and 9
    } else if (rest === 4) {
      if (element > 5) {
        roman.unshift(intToRomanChar(10 ** (i + 1)));
      } else {
        roman.unshift(intToRomanChar(5 * 10 ** i));
      }
      roman.unshift(intToRomanChar(10 ** i));
    } else {
      roman.unshift(intToRomanChar(+element * 10 ** i));
    }
  }
  return roman.join("");
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