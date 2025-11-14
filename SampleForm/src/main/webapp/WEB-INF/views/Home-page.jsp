<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Job Application Form</title>

<style>

    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
    }

    h2 {
        text-align: center;
        margin-top: 20px;
    }

    /* Form container */
    .form-box {
        width: 350px;
        margin: auto;
        background: white;
        padding: 20px 25px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.2);
        margin-top: 20px;
    }

    label {
        font-weight: bold;
    }

    input {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        margin-bottom: 5px;
        border: 1px solid #aaa;
        border-radius: 4px;
    }

    /* Error styling */
    .error {
        color: red;
        font-size: 13px;
        margin-top: -3px;
        margin-bottom: 8px;
        display: block;
    }

    input.error-field {
        border: 2px solid red;
        background-color: #ffecec;
    }

    /* Submit Button */
    .btn {
        padding: 10px 15px;
        width: 100%;
        background: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 15px;
    }

    .btn:hover {
        background: #45a049;
    }

</style>

</head>
<body>

<h2>Job Application Form</h2>

<div class="form-box">

    <form:form action="register" method="get" modelAttribute="UserInfo">

        <label for="name">Full Name:</label>
        <form:input path="Applicantname" id="name" cssErrorClass="error-field"/>
        <form:errors path="Applicantname" cssClass="error"/>

        <label for="mobile">Mobile Number:</label>
        <form:input path="Applicantmobile" id="mobile" cssErrorClass="error-field"/>
        <form:errors path="Applicantmobile" cssClass="error"/>

        <label for="email">Email Address:</label>
        <form:input path="Applicantemail" id="email" cssErrorClass="error-field"/>
        <form:errors path="Applicantemail" cssClass="error"/>

        <label for="age">Age:</label>
        <form:input path="Applicantage" id="age" cssErrorClass="error-field"/>
        <form:errors path="Applicantage" cssClass="error"/>

        <button type="submit" class="btn">Submit Application</button>

    </form:form>
</div>

</body>
</html>
