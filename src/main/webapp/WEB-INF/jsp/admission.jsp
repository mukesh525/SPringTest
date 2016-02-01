<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .error {
            color: red; font-weight: bold;
        }
    </style>
    <body>
        <a href="/SPringTest/?siteLanguage=en">English</a>
        <a href="/SPringTest/?siteLanguage=fr">French</a>
        <h1>${msg}</h1>



        <form:form action="SubmitAdmissionForm" commandName="student">
            <p>
                <spring:message code="label1.StudentName"/> <form:input path="studentname" size="30"/>
                <form:errors path="studentname" cssClass="error"/>
            </p>
            <p>
                <spring:message code="label1.StudentHobby"/> <form:input path="studenthobby" size="30"/>
                <form:errors path="studenthobby" cssClass="error"/>
            </p>
            <p>
                <spring:message code="label1.StudentPhone"/> <form:input path="phone" size="30"/>
                <form:errors path="phone" cssClass="error"/>
            </p>
            <p>
                <spring:message code="label1.Studentdob"/>  <form:input path="dob" size="30"/>
                <form:errors path="dob" cssClass="error"/>
            </p>
            <p>
                <spring:message code="label1.StudentState"/> <form:input path="studentadress.state" size="30"/>
                <form:errors path="studentadress.state" cssClass="error"/>

                <spring:message code="label1.StudentCity"/> <form:input path="studentadress.city" size="30"/>
                <form:errors path="studentadress.city" cssClass="error"/>
                <br/>

                <spring:message code="label1.StudentStreet"/><form:input path="studentadress.street" size="30"/>
                <form:errors path="studentadress.street" cssClass="error"/>

                <spring:message code="label1.StudentPincode"/><form:input path="studentadress.pincode" size="30"/>
                <form:errors path="studentadress.pincode" cssClass="error"/>
            </p>

            <p>
                <spring:message code="label1.StudentSkills"/>
                <select name="studentskills" multiple>
                    <option value="java">Java</option>
                    <option value="c">C</option>
                    <option value="php">PHP</option>
                    <option value="php1">PHP1</option>
                    <option value="php1">PHP2</option>
                </select>
                <form:errors path="studentskills" cssClass="error"/>
            </p>


            <input type="submit" value="Click here to submit form"/>



        </form:form>
    </body>
</html>
