const express=require('express')
const app=express()
const port=5000
app.use(express.json())
app.get('/getusers',(req,res)=>{
    //fetch all users from mongodb
    res.send('listing users soon')
})
app.post('/createuser',(req,res)=>{
    //create a new user in mongodb
    const email=req.body.email;
    const password=req.body.password;
    console.log("email:"+email);
    console.log("password:"+password);
    res.send('user will be created soon')
})
app.put('/updateuser/:id',(req,res)=>{
    const id=req.params.id;
    //update user based on id
    res.send('user will be updated soon by id'+id)
})
app.delete('/deleteuser/:id',(req,res)=>{
    const id=req.params.id;
    //delete user in mongodb based on id
    res.send('delete user based on id'+id)
})
 
app.listen(port,()=>{
    console.log(`Example app listening on port ${port}`)
})
