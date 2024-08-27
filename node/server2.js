const express = require('express')
const mongoose = require("mongoose");
const cors = require('cors')
 
const app = express()
const port = 5000
app.use(express.json())
app.use(cors())
 
mongoose.connect("mongodb://localhost:27017/investment_db", {
   useNewUrlParser: true,
   useUnifiedTopology: true
});
 
const userSchema = {
    name: String,
    acc_no: String,
    acc_type:String,
    trn_type:String,
    amt:String,
    date:String
 };
 const investment = mongoose.model("Investment", userSchema);
 
app.get('/getinvestment', async(req, res) => {
    try {
        // Fetch all users from MongoDB
        const data = await investment.find();
       
        // Send the response to the client
        res.json(data);
   
        // If you want to log the data, do it after sending the response
        console.log(data);
      } catch (error) {
        // Handle any errors
        res.status(500).send({ error: 'Failed to fetch investments' });
      }
    });
  //fetch all users from mongodb

 
 
app.post('/createinvestment',(req,res)=>{
    // create a new a user in mongodb
    // const email = req.body.email;
    // const pwd = req.body.password;
    // console.log("Email is : " + email);
    // console.log("Password is: " + pwd);
    const ix = new investment({
        name: req.body.name,
        acc_no: req.body.acc_no,
        acc_type:req.body.acc_type,
        trn_type:req.body.trn_type,
        amt:req.body.amt,
        date:req.body.date,
        
    });
    ix.save().then(()=>{
        res.send("investment created successfully");
    }).catch((err)=>{
        console.log(err);
    })
});
 
app.put('/updateinvestment/:id',async(req,res)=>{
    const id = req.params.id;
    try {
        const updateResult = await investment.findByIdAndUpdate(
            id,
            { name: req.body.name,acc_no: req.body.acc_no,acc_type:req.body.acc_type,trn_type:req.body.trn_type,amt:req.body.amt,date:req.body.date},
        );

        if (updateResult) {
            res.send('investment updated sucessfully.');
        } else{
            res.status(404).send('investment not found');
        }
    } catch (error) {
        res.status(500).send('error updating user:' + error.message);
    }
    //update user in mongodb based on id
    // res.send('user will be updated soon by id...' + id);
});
 
app.delete('/deleteinvestment/:id', async (req, res) => {
    const id = req.params.id;
    try {
        const deleteResult = await investment.findByIdAndDelete(id);

        if (deleteResult) {
            res.send('investment deleted successfully.');
        } else {
            res.status(404).send('investment not found.');
        }
    } catch (error) {
        res.status(500).send('Error deleting user: ' + error.message);
    }
});

 
 
 
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})