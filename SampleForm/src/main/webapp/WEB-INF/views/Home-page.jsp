<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Job Application Form</title>
</head>
<body>

    <h2 align="center">Job Application Form</h2>

    <form:form action="register" method="get" modelAttribute="UserInfo">
        <div align="center">

            <p>
                <label for="name">Full Name:</label><br>
                <form:input path="Applicantname" id="name" />
            </p>

            <p>
                <label for="mobile">Mobile Number:</label><br>
                <form:input path="Applicantmobile" id="mobile" />
            </p>

            <p>
                <label for="email">Email Address:</label><br>
                <form:input path="Applicantemail" id="email" />
            </p>

            <p>
                <label for="age">Age:</label><br>
                <form:input path="Applicantage" id="age" />
            </p>

            <input type="submit" value="Submit Application" />

        </div>
    </form:form>
  

</body>
</html>
