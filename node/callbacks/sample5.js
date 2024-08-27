function getUsers(){
    return new Promise( (resolve,reject) => {
        setInterval( () =>{

            resolve([ 
                {username:"john", email:"john@gmail.com"},
                {username:"joe", email:"joe@gmail.com"},
            ]);
        },1000);

    })
    
}
const promise = getUsers();
promise.then( (users) => {
    console.log(users);
})