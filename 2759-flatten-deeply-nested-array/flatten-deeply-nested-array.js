/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    if (n === 0) return arr; // no flattening
    
    let result = [];
    for (const el of arr) {
        if (Array.isArray(el) && n > 0) {
            // recursively flatten inner arrays, reducing depth
            result.push(...flat(el, n - 1));
        } else {
            result.push(el);
        }
    }
    return result;
};
