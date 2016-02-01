<%-- 
    Document   : admissionsucess
    Created on : Jan 21, 2016, 9:24:41 PM
    Author     : mukesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${msg}</h1>
        <h3>Form submiited</h3>
        <h2>Details submited by you</h2>


        <table>
            <tr>
                <td>Student Name </td>
                <td>${student.studentname}</td>
            </tr>
            <tr>
                <td>Student Hobby</td>
                <td>${student.studenthobby}</td>
            </tr>
            <tr>
                <td>Student Phone</td>
                <td>${student.phone}</td>
            </tr>
            <tr>
                <td>Student DOB</td>
                <td>${student.dob}</td>
            </tr>
            <tr>
                <td>Student Skills</td>
                <td>${student.studentskills}</td>
            </tr>
          
            <tr>  <td>Student Address</td>
                <td>State :${student.studentadress.state}</td>
                <td>City:${student.studentadress.city}</td>
                <td>Street:${student.studentadress.street}</td>
                <td>Zip:${student.studentadress.pincode}</td>
            </tr>
        </table>


    </body>
</html>
