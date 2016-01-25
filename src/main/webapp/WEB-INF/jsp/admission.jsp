<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${msg}</h1>
        
        
        <form:errors path="student.*"/>
        <form action="/SPringTest/SubmitAdmissionForm" method="post" >
            <p>
                Student Name <input type="text" name="studentname"/> 
            
            </p>
             <p>
                Student Hobby <input type="text" name="studenthobby"/> 
            </p>
             <p>
                Student Phone <input type="text" name="phone"/> 
            </p>
             <p>
                Student DOB <input type="text" name="dob"/> 
            </p>
             <p>
                Student State <input type="text" name="studentadress.state"/> 
            
                Student City <input type="text" name="studentadress.city"/> 
            
                Student Street <input type="text" name="studentadress.street"/> 
            
                Student Pincode <input type="text" name="studentadress.pincode"/> 
            </p>
            
             <p>
                 Student Skills 
                 <select name="studentskills" multiple>
                     <option value="java">Java</option>
                     <option value="c">C</option>
                     <option value="php">PHP</option>
                     <option value="php1">PHP1</option>
                     <option value="php1">PHP2</option>
                 </select>
            </p>
            
            
            <input type="submit" value="CLick here to submit form"/>
            
            
            
        </form>
    </body>
</html>
