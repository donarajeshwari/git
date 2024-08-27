function getUserNames(){
    return [
            {username:"john", email:"john@gmail.com"},
            {username:"joe", email:"joe@gmail.com"}
        
    ]
    
}
function findUserName(username){
    const users = getUserNames();
    const user= users.find((user) => user.username==username);
    return user;


}
console.log(findUserName('joe'));