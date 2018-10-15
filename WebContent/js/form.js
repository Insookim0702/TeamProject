/**
 * 
 */

/* ======================register 등록 현황 DB에서 전체 불러오기======================*/  
function ajaxReq() {
	var xhttp = new XMLHttpRequest(); //요청객체 생성
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) { //status는 제공하는 속성이다.
			//innerHTML -js에서 html tag를 화면에 출력할 때 사용되는 속성
			//주의사항: div와 p와 tag에 반영되는 속성
			document.getElementById("dataView").innerHTML //  innerHTML을 사용해서 div의 아이디를 가지는 dataView 영역에 삽입한다.//innerTEXT
			= this.responseText;
		}
	};
	//            key
	xhttp.open("GET", "Allcontroller?command=all", true);
	xhttp.send();
}
$(function(){
	/* =================윈도우 크기에 맞춰 topMenuBox 크기 조절===================== */
		$('#topMenuBox').css('width',$(window).width());
		imgResize();
		$(window).on('resize',function(){
			imgResize();
		})
		
		function imgResize(){
			//브라우저 창의 가로 세로 비율에 맞춰 너비 조절하기
			$('#topMenuBox').css('width', $(window).width());
			//이미지의 가로 세로 비율에 맞춰높이 구하기
			$('#topMenuBox').css('height','80px');
		}
		
		
	
			
	/* =================상단 메뉴창 hover달기===================== */
		$('#login').on('mouseover',function(){
			$(this).attr('src','image/로그인호버.png');
			$('#logintd').attr('background-color','white');
		})
		.on('mouseout', function(){
			$(this).attr('src', 'image/로그인.png');
		})
		$('#logout').on('mouseover',function(){
			$(this).attr('src','image/로그아웃호버.png');
			$('#logintd').attr('background-color','white');
		})
		.on('mouseout', function(){
			$(this).attr('src', 'image/로그아웃.png');
		})
		$('#signup').on('mouseover',function(){
			$(this).attr('src','image/회원가입호버.png');
			$('#logintd').attr('background-color','white');
		})
		.on('mouseout', function(){
			$(this).attr('src', 'image/회원가입.png');
		})
		$('#surround').on('mouseover',function(){
			$(this).attr('src','image/둘러보기호버.png');
			$('#logintd').attr('background-color','white');
		})
		.on('mouseout', function(){
			$(this).attr('src', 'image/둘러보기.png');
		})
		$('#proposal').on('mouseover',function(){
			$(this).attr('src','image/건의하기호버.png');
			$('#logintd').attr('background-color','white');
		})
		.on('mouseout', function(){
			$(this).attr('src', 'image/건의하기.png');
		})
		
		/*===================================퇴실 침대 hover로 퇴실 버튼 나오게 하기================================*/
		$('#usingbed1').on('mouseover', function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout', function(){
			$(this).attr('src', 'image/bed1.png');
		})
		$('#usingbed2').on('mouseover', function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src', 'image/bed2.png');
		})
		$('#usingbed3').on('mouseover',function(){
			$(this).attr('src' ,'image/퇴실.png')
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed3.png');
		})
		$('#usingbed4').on('mouseover',function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed4.png');
		})
		$('#usingbed5').on('mouseover',function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed5.png');
		})
		$('#usingbed6').on('mouseover',function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed6.png');
		})
		$('#usingbed7').on('mouseover',function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed7.png');
		})
		$('#usingbed8').on('mouseover',function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed8.png');
		})
		$('#usingbed9').on('mouseover',function(){
			$(this).attr('src','image/퇴실.png');
		})
		.on('mouseout',function(){
			$(this).attr('src','image/bed9.png');
		})
		
	});