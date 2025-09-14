/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if (Array.isArray(obj)) {
        // Process arrays
        return obj
            .map(compactObject)            // recursively compact each element
            .filter(Boolean);              // remove falsy values
    } else if (obj !== null && typeof obj === "object") {
        // Process objects
        const newObj = {};
        for (const key in obj) {
            const val = compactObject(obj[key]);
            if (Boolean(val)) {
                newObj[key] = val;
            }
        }
        return newObj;
    }
    // Primitive value (number, string, boolean, etc.)
    return obj;
};
