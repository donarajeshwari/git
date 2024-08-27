var fs = require("fs");
console.log("writing into file !!!");
fs.appendFile("data.txt", '\nDone with UI and Node file system',
    function(err){
        if(err){
            return console.error(err);

    }
    console.log("data written successfully !!!");
    fs.readFile('data.txt', function(err,data){
        if (err){
            return console.error(err);
        }
        console.log("async Read : " +data);
    })
});