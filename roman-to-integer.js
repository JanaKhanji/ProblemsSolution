// https://leetcode.com/problems/roman-to-integer/

var romanToInt = function (s) {
    const chars = s.split("");
    let int = 0;
    for (let i = 0; i < chars.length; i++) {
        if (romanCharToInt(chars[i + 1]) > romanCharToInt(chars[i])) {
            int += romanCharToInt(chars[i + 1]) - romanCharToInt(chars[i]);
            i++;
        } else {
            int += romanCharToInt(chars[i]);
        }
    }
    return int;
};

var romanCharToInt = function (c) {
    switch (c) {
        case "I":
            return 1;
        case "V":
            return 5;
        case "X":
            return 10;
        case "L":
            return 50;
        case "C":
            return 100;
        case "D":
            return 500;
        case "M":
            return 1000;
        default:
            return 0;
    }
};

console.log(romanToInt("III"));
console.log(romanToInt("LVIII"));
console.log(romanToInt("MCMXCIV"));
