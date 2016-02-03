package com.muk.entity;

import com.muk.controller.IsHobyValid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Student {

    @Id @GeneratedValue
    private Long student_id;

    @Pattern(regexp = "[^0-9]*")
    @NotEmpty(message = "Studentname cannot be empty")
    private String studentname;
    @Size(min = 2, max = 30)
    @IsHobyValid(ListofValidHobbies = "Music|Cricket|Hockey|Coding")
    private String studenthobby;
    @Max(2222)
    private Long phone;
    @Past
    private Date dob;
   
    @Valid
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

    @ElementCollection
    @Column(name = "student_skills")
    @NotEmpty(message = "Skills must not be null")
    private List<String> studentskills = new ArrayList();

    @Override
    public String toString() {
        return "Student{" + "student_id=" + student_id + ", studentname=" + studentname + ", studenthobby=" + studenthobby + ", phone=" + phone + ", dob=" + dob + ", studentadress=" + studentadress + ", studentskills=" + studentskills + '}';
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

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }


}
