package com.muk.controller;

import com.muk.dao.StudentDaoImpl;
import com.muk.entity.Student;
import com.muk.validator.StudentNameEditor;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.hibernate.Query;
import org.hibernate.Session;
import org.muk.hibernate.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmission {

    private Student sStudent;
    private StudentDaoImpl dao;

    public StudentAdmission() {
          dao = StudentDaoImpl.getInstance();
    }
    

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //  binder.setDisallowedFields(new String[]{"phone"});
        binder.registerCustomEditor(String.class, "studentname", new StudentNameEditor());
  

    }

    @ModelAttribute
    public void CommonMethod(Model model) {
        model.addAttribute("msg", sStudent);
    }

    @RequestMapping(value = "/")
    public ModelAndView getAdmissionForm(Map<String, Object> model) {
        ModelAndView mav = new ModelAndView("admission");
        Student user = new Student();
        model.put("student", user);
        sStudent= dao.getStudent(5);
         return mav;
   }

    @RequestMapping(value = "/SubmitAdmissionForm", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {

        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView("admission");
            return mav;
        } else {

            dao.addStudent(student);
            ModelAndView mav = new ModelAndView("admissionsucess");
            return mav;
        }

    }

}
