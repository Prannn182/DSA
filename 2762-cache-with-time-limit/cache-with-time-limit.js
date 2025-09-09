var TimeLimitedCache = function() {
    this.cache = new Map();
};

TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    const expiry = now + duration;
    const exists = this.cache.has(key) && this.cache.get(key).expiry > now;

    this.cache.set(key, { value, expiry });
    return exists;
};

TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();
    if (!this.cache.has(key)) return -1;

    const { value, expiry } = this.cache.get(key);
    if (expiry > now) return value;

    this.cache.delete(key);
    return -1;
};

TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let validCount = 0;

    for (const [key, { expiry }] of this.cache) {
        if (expiry > now) validCount++;
        else this.cache.delete(key); // cleanup expired
    }

    return validCount;
};
