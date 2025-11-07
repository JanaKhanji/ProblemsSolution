// https://leetcode.com/problems/flood-fill/


/**
 * @param {number[][]} image
 * @param {number} sr
 * @param {number} sc
 * @param {number} color
 * @return {number[][]}
 */
var floodFill = function(image, sr, sc, color) {
    const sourceValue = image[sr][sc];
    if (color == sourceValue) return image;

    image[sr][sc] = color;

    // check adjacent
    [1, -1].forEach(el => {
        if (image[sr][sc + el] != undefined && image[sr][sc + el] == sourceValue) {
            image =  floodFill(image,sr, sc + el, color);
        }
        
        if (image[sr + el]  != undefined && image[sr + el][sc] == sourceValue) {
            image = floodFill(image,sr + el, sc, color);
        }
    })

    return image;
};
