<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <script type="text/javascript">
//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
var idck = 0;
$(function() {
    //idck 버튼을 클릭했을 때 
    $("#idck").click(function() {
        
        //userid 를 param.
        var id =  $("#id").val(); 
        
        $.ajax({
            async: true,
            type : 'POST',
            data : userid,
            url : "idcheck.do",
            dataType : "json",
            contentType: "application/json; charset=UTF-8",
            success : function(data) {
                if (data.cnt > 0) {
                    
                    alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-error")
                    $("#divInputId").removeClass("has-success")
                    $("#userid").focus();
                    
                
                } else {
                    alert("사용가능한 아이디입니다.");
                    //아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
                    $("#divInputId").addClass("has-success")
                    $("#divInputId").removeClass("has-error")
                    $("#userpwd").focus();
                    //아이디가 중복하지 않으면  idck = 1 
                    idck = 1;
                    
                }
            },
            error : function(error) {
                
                alert("error : " + error);
            }
        });
    });
});
 
 
</script>

</body>
</html>