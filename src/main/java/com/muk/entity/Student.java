package com.muk.entity;

import com.muk.controller.IsHobyValid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import jdk.nashorn.internal.runtime.regexp.RegExp;


public class Student {

    @Pattern(regexp="[^0-9]*")
    private String studentname;
    @Size(min=2,max=30) @IsHobyValid(ListofValidHobbies="Music|Cricket|Hockey|Coding")
    private String studenthobby;
    @Max(2222)
    private Long phone;
    @Past
    private Date dob;
    @NotNull 
    private List<String> studentskills = new ArrayList();
    @NotNull 
    private Address studentadress;

    public Address getStudentadress() {
        return studentadress;
    }

    public void setStudentadress(Address studentadress) {
        this.studentadress = studentadress;
    }

   

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
  

    public List<String> getStudentskills() {
        return studentskills;
    }

    public void setStudentskills(List<String> studentskills) {
        this.studentskills = studentskills;
    }
  

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudenthobby() {
        return studenthobby;
    }

    public void setStudenthobby(String studenthobby) {
        this.studenthobby = studenthobby;
    }

}
