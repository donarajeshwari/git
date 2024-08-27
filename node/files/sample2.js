var fs = require("fs");
console.log(1);
var data = fs.readFileSync('input.txt');
console.log("synchronous read :" + data.toString());
console.log(3);