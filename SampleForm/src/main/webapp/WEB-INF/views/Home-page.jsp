<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Job Application Form</h2>
    <form action="register" method="get">
        <label for="name">Full Name:</label><br>
        <input type="text" id="name" name="Applicantname" ><br><br>

        <label for="mobile">Mobile Number:</label><br>
        <input type="text" id="mobile" name="Applicantmobile" ><br><br>

        <label for="email">Email Address:</label><br>
        <input type="email" id="email" name="Applicantemail" ><br><br>

        <label for="age">Age:</label><br>
        <input type="number" id="age" name="Applicantage" ><br><br>

        <input type="submit" value="Submit Application">
    </form>
</body>

</html>