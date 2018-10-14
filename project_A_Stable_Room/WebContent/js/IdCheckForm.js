/**
 * 
 */

var httpRequest = null;

//httpRequest 객체 생성
function getXMLHttpRequest(){
	var httpRequest = null;
	
	if(window.ActiveXObject){
		try{
			httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
		} catch(e){
			try{
				httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
			}catch(e2){httpRequest = null; }
		}
	}
	else if(window.XMLHttpRequest){
		httpRequest = new window.XMLHttpRequest();
	}
	return httpRequest;
}

/*중복체크 창 열리면 가장 먼서 실행되며 부모창에 입력된 id값이 자식창으로 날린다.*/
function pValue(){
	document.getElementById("userId").value = opener.document.getElementById("id").value;
}

//부모창 접근은 opener 사용
function idCheck(){
	var id =document.getElementById("userId").value;
	if(!id){
		alert("아이디를 입력하지 않았습니다.");
		return false;
	}
	else if((id < "0" || id >"9") && (id <"A" || id >"Z") && (id <"a" || id >"z")){
		alert("한글 및 특수문자는 아이디로 사용할 수 없습니다.");
		return false;
	}
	else if(id !="admin"){
		alert("admin으로 입력하세요");
		return false;
	}
	else{
			var xhttp = new XMLHttpRequest(); //요청객체 생성
			xhttp.onreadystatechange = function() {
				
				if (this.readyState == 4 && this.status == 200) { //status는 제공하는 속성이다.
					//innerHTML -js에서 html tag를 화면에 출력할 때 사용되는 속성
					//주의사항: div와 p와 tag에 반영되는 속성
					var resultText = this.responseText;
					if(resultText ==1){
						alert("중복되는 아이디가 존재합니다.");
						document.getElementById("cancleBtn").style.visibility='visible';
						document.getElementById("useBtn").style.visibility='hidden';
						document.getElementById("msg").innerHTML ="";
					}
					else if(resultText ==0){
						document.getElementById("cancleBtn").style.visibility='hidden';
						document.getElementById("useBtn").style.visibility='visible';
						document.getElementById("msg").innerHTML="사용가능한 아이디입니다."
					}
				}
			};
			xhttp.open("GET", "../MemberIdCheckAction?id="+id, true);
			xhttp.send();
	}
}


//사용하기 누르면 부모창으로 아이디값 전달
function sendCheckValue(){
	//중복체크 결과인 idCheck 값을 부모창에 전달한다.
	opener.document.getElementById("idDuplication").value ="idCheck";
	//회원가입 화면(부모창)의 ID입력란에 값을 전달한다.
	opener.document.getElementById("id").value = document.getElementById("userId").value;
	
	if(opener != null){
		opener.chkForm = null;
		self.close();
	}
}