var express = require('express');
var route = express.Router();

//p1로 들어오는 요청을 router가 받아서 , 결국 /p1/r1로 요청이 된다. 
route.get('r1', function(req, res){
    res.send('Hello /p1/r1');
});

route.get('/p1/r2', function(req, res){
    res.send('Hello /p1/r2');
});
//p1으로 들어오는 모든 요청을 router로 위임한 것이다.

module.exports = route;