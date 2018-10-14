/**
 * 
 */

//년./월/일 달력 만들기
$(document).ready(function(){
	var time = new Date();
	var $output=$("#output");
	var day=["일","월","화","수","목","금","토"];
	$output.text(time.getFullYear()+" 년 "+ (time.getMonth()+1)+ " 월 " +time.getDate()+"일 " + day[time.getDay()]+"요일");
})

//전자시계 만들기
var $clock =null;
$(document).ready(function(){
	$clock=$("#clock");
	clock();
})
 function clock(){
	 var hour =null;
	 var minutes=null;
	 var seconds=null;
	 var date =null;
	 var ampm = null;
	 setInterval(function(){
	 		date = new Date();
	 		hour = date.getHours();
	 		minutes=date.getMinutes();
	 		seconds=date.getSeconds();
	 		if(hour>12){
	 			hour -=12;
	 			ampm = "오후";
	 		}else{
	 			ampm ="오전";
	 		}
	 		$clock.text(ampm +"   "+hour+" 시 " + minutes+" 분 " + seconds + "  초");},500);
	 		
	 	
 }//clock