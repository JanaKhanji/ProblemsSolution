// https://leetcode.com/problems/snail-traversal/description/

Array.prototype.snail = function(rowsCount, colsCount) {
    if (rowsCount * colsCount !== this.length) return [];
    const result = Array(rowsCount).fill().map(() => Array(colsCount).fill(0));

    let row = 0, col = 0;
    this.forEach((element, index) => {
        result[Math.abs(row - (index % rowsCount))][col] = element;
        if (index % rowsCount === rowsCount - 1) {
            if (row === rowsCount -1) row = 0
            else row = rowsCount -1
            col ++;
        }
    });

    return result;
}
