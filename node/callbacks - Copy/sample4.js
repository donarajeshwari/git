function getUsers(callback){
    let users = [];

    setTimeout(()=>{
        callback([
            {username:"john", email:"john@gmail.com"},
            {username:"joe", email:"joe@gmail.com"},
        ]);
    },1000);
    return users;
}
function findUser(username,email,callback){
    getUsers( (users) => {
        const user= users.find((user) => 
        ( user.username== username && user.email == email));
        callback(user);
    })
}
findUser('joe','joe@gmail.com',console.log);
//  return the out put after 1 min Delay