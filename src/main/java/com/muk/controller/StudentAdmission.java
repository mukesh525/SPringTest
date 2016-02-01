package com.muk.controller;

import com.muk.entity.Student;
import java.util.Map;
import javax.validation.Valid;
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

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //  binder.setDisallowedFields(new String[]{"phone"});
        binder.registerCustomEditor(String.class, "studentname", new StudentNameEditor());

    }

    @ModelAttribute
    public void CommonMethod(Model model) {
        model.addAttribute("msg", "Engeenring college in India");
    }

    @RequestMapping(value = "/")
    public ModelAndView getAdmissionForm(Map<String, Object> model) {
        ModelAndView mav = new ModelAndView("admission");
        Student user = new Student();
        model.put("student", user);
        return mav;

    }

    @RequestMapping(value = "/SubmitAdmissionForm", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {

        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView("admission");
            return mav;
        } else {

            ModelAndView mav = new ModelAndView("admissionsucess");
            return mav;
        }

    }

}
