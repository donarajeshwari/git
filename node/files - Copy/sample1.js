var fs = require("fs");
console.log(1);
fs.readFile("input.txt", function(err,data) {
    if (err){
    return console.error(err);
    }
    console.log("asynchronous read: " + data.toString());
});
console.log(3);