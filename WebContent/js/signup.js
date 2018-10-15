/**
 * 
 */

function checkValue(){
	var form = document.userInfo;
	
	if(!form.idDuplication.value != "idCheck"){
		alert("아이디 중복체크를 해주세요.");
		return false;
	}
	/*비밀번호와 비밀번호 확인에 입력된 값이 동일한지 확인*/
	if(form.pw.value != form.pwcheck.value){
		alert("비밀번호를 동일하게 입력하세요.");
		return false;
	}
	if(isNAN(form.birth.value)){
		alert("생일은 숫자만 입력가능합니다.\n EX)930602");
		return false;
	}
	
}
/*아이디 중복체크 화면 Open*/
function openIdChk(){
	window.name ="parentForm";
	window.open("IdCheckForm.jsp",
			"chkForm",
			"width=500, height=300, resizeable = no, scrollbars =no");
}
function inputIdChk(){
	document.userInfo.idDuplication.value ="idUncheck";
}

