module.exports = function(){
    var express = require('express');
    var app = express();
    var route = express.Router();
    route.get('/board', function(req, res){
        console.log('/process/board 라우터 함수를 호출');
     pool.getConnection(function(err, conn){
        if(err){
            if(conn){
                conn.release();
            }
            callback(err, null);
            return;
        }
    console.log('데이터베이스 연결 스레드 아이디 :' + conn.threadId);
    fs.readFile('board.ejs','utf-8',(error, data) =>{
        if (err){
                console.log('ejs오류' + error);  //null값 리턴
                return;
            }
       
        conn.query('select no, title, writer, hit, DATE_FORMAT(moddate, "%Y/%m/%d %T") as moddate from board1 order by no desc', function(err, rows){
            conn.release();
            if (err){
                console.log('페이징 에러'+ err);
                //callback(err, null);  //null값 리턴
                return;
            }
            
            console.log(rows);
            console.log(rows[0].title);
             res.render('board', {rows: rows }); // view 디렉토리에 있는 list 파일로 이동합니다.
            //res.send(ejs.render(data, {data:rows}));
            
        });
    });
     });
    });
};
