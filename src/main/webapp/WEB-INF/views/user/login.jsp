<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" action="/user/login">
    <input type="text" name="id" placeholder="아이디를 입력해주세요" value="${id}"><br>
    <input type="text" name="password" placeholder="비밀번호를 입력해주세요"><br>
    <a href="/user/idfind">아이디·비밀번호 찾기</a><br>
    <input type="submit" value="로그인"><br>
</form>

<a href="/user/signup">회원가입</a>

<p>사업자이신가요?<a href="/user/brvsignup">사업자 회원 가입하기 ></a></p>
</body>
</html>