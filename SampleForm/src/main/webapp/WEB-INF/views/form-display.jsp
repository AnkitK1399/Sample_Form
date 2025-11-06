<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Here all the info will be displayed</h2>

    <p><strong>Name of Applicant:</strong> ${UserInfo.applicantname}</p>
    <p><strong>Mobile Number:</strong> ${UserInfo.applicantmobile}</p>
    <p><strong>Email Address:</strong> ${UserInfo.applicantemail}</p>
    <p><strong>Age:</strong> ${UserInfo.applicantage}</p>
</body>
</html>