<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="/SPringTest?siteLanguage=en">English</a>
        <a href="/SPringTest?siteLanguage=fr">French</a>
        <h1>${msg}</h1>
        
        
        <form:errors path="student.*"/>
        <form action="/SPringTest/SubmitAdmissionForm" method="post" >
            <p>
           <spring:message code="label1.StudentName"/><input type="text" name="studentname"/> 
            
            </p>
             <p>
               <spring:message code="label1.StudentHobby"/> <input type="text" name="studenthobby"/> 
            </p>
             <p>
               <spring:message code="label1.StudentPhone"/> <input type="text" name="phone"/> 
            </p>
             <p>
                <spring:message code="label1.Studentdob"/> <input type="text" name="dob"/> 
            </p>
             <p>
                <spring:message code="label1.StudentState"/> <input type="text" name="studentadress.state"/> 
            
               <spring:message code="label1.StudentCity"/><input type="text" name="studentadress.city"/> 
            
                <spring:message code="label1.StudentStreet"/> <input type="text" name="studentadress.street"/> 
            
                <spring:message code="label1.StudentPincode"/> <input type="text" name="studentadress.pincode"/> 
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
            </p>
            
            
            <input type="submit" value="Click here to submit form"/>
            
            
            
        </form>
    </body>
</html>
