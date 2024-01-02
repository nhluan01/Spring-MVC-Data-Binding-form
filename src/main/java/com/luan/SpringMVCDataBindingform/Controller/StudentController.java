package com.luan.SpringMVCDataBindingform.Controller;

import com.luan.SpringMVCDataBindingform.modal.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    // show form
    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("student",new Student());
        return "form";
    }
    @PostMapping("/show_form")
    public String conform(@ModelAttribute("student") Student theStudent){
        System.out.println("first name: " + theStudent.getFirstName()+ " last name: " + theStudent.getLastName());
        return "show_form";
    }
}
