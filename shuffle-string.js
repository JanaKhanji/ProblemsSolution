// https://leetcode.com/problems/shuffle-string/
// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
// Output: "leetcode"

var restoreString = function(s, indices) {
    let arr=s.split("");
    let result=[]
    indices.forEach((el,index)=>{
        result[el]=arr[index]
    })
    return result.join("")
};
