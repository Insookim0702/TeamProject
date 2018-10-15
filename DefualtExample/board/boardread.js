/*============게시판 글읽기& hit 수 증가시키기============*/
module.exports = function(){
    var express = require('express');
    var app = express();
    
    var route = express.Router();
    route.get('/board/read/:no', function(req, res){
        console.log('/read/:id 라우터 함수를 호출');
    var no = req.params.no;
     
     pool.getConnection(function(err, conn){
        if(err){
            if(conn){
                conn.release();
            }
            callback(err, null);
            return;
        }
        conn.beginTransaction(
            
            function(err){
            if(err) console.log(err);
/*1. 함수 : hit수 증가시키기*/
            conn.query('update board1 set hit =hit+1 where no=?', [no], function(err){
                if(err) {
                /*이 쿼리에서 에러가 발생하면 쿼리문 수행 취소하고 콜백*/
                console.log(err);
                conn.rollback(function(){
                    console.error('rollback error1');
                })
                }
/*2. 함수 : 글 호출하기*/
                conn.query('select no, title, content, writer, hit, DATE_FORMAT(moddate, "%Y/%m/%d %T") as moddate, DATE_FORMAT(regdate, "%Y/%m/%d %T") as regdate from board1 where no=?', [no], function(err,rows){
                    if(err){
                        /*이 쿼리에서 에러 나면 쿼리문 취소하고 롤백*/
                        console.log(err);
                        conn.rollback(function(){
                            console.error('rollback error2');
                        })
                    }
                    else{
                        conn.commit(function(err){
                            if(err) console.log(err);
                            console.log("row :" + rows[4]);
                            //console.log("title : " +  rows[0].title);
                            res.render('read', {read: rows[0].title, read :rows[0]});
                        })
                    }
                    
                })
            })
        })
     });
    })
}