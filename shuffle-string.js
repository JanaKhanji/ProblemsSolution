// https://leetcode.com/problems/shuffle-string/


var restoreString = function(s, indices) {
    let arr=s.split("");
    let result=[]
    indices.forEach((el,index)=>{
        result[el]=arr[index]
    })
    return result.join("")
};
