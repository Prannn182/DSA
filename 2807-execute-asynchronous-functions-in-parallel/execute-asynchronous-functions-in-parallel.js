var promiseAll = function(functions) {
  return new Promise((resolve, reject) => {
    const results = [];
    let completed = 0;
    const total = functions.length;

    functions.forEach((fn, index) => {
      fn()
        .then((value) => {
          results[index] = value;   // preserve order
          completed++;
          if (completed === total) {
            resolve(results);
          }
        })
        .catch((err) => {
          reject(err); // reject on first error
        });
    });
  });
};
