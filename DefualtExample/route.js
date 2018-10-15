var express = require('express');
var app = express();

var router = require('/routes/p1');
app.use('/p1', router);


var p2 = require('/routes/p2')(app);
app.use('/p2', p2);
app.listen(3003, function(){
    console.log('connected');
})