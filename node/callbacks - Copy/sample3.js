function getUser(){
    let users = [];

    setTimeout( () => {
        users = [
            {username:"john", email:"john@gmail.com"},
            {username:"joe", email:"joe@gmail.com"},
        ];
    },1000);
    return users;
}
function findUser(username){
    const users = getUser();
    const user= users.find((user) => user.username==username);
    return user;
}
console.log(findUser('joe'));
// the out is undefined