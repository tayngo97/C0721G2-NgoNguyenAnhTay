package com.codegym.demo_c0721g2_spring_boot.controller;

import com.codegym.demo_c0721g2_spring_boot.bean.ClassRoom;
import com.codegym.demo_c0721g2_spring_boot.bean.Student;
import com.codegym.demo_c0721g2_spring_boot.service.IClassService;
import com.codegym.demo_c0721g2_spring_boot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller(value = "studentController2")
//Khai báo đường dẫn chung để trỏ đến controller
//@RequestMapping("student")
public class StudentController {
    //DI -> Tiêm cái lớp Implement vào interface.
    //DI -> setter
    //DI -> construstor
    @Qualifier("studentService")
    @Autowired
    private IStudentService iStudentService;

    @Autowired
    private IClassService iClassService;


//    @GetMapping(value = "")
//    public String getPageHello(Model model) {
//        model.addAttribute("name", "Chào mừng đến với lớp C0721G2");
//        return "hello";
//    }

    @GetMapping(value = "/list")
    public String getListStudent(Model model) {
        model.addAttribute("studentList", iStudentService.findAll());
        return "student/list";
    }
    //defaultValue sẽ giúp các bạn chọn ra giá trị mặc định nếu không có giá trị đó khi gửi lên server
    @GetMapping("/list-page")
    public String getListStudentPage(@RequestParam(value = "page", defaultValue = "0")int page, Model model) {
        Sort sort = Sort.by("name").ascending();//sắp xếp
        Page<Student> studentPage = iStudentService.findAll(PageRequest.of(page,5,sort));
        model.addAttribute("studentPage", studentPage);
        return "student/list_page";
    }

    @GetMapping(value = "/detail/{id}")
    public ModelAndView getDetailStudent(@PathVariable(value = "id")Integer idStudent) {
        return new ModelAndView("student/detail",
                "student",iStudentService.findById(idStudent));
    }

    @GetMapping(value = "/detail")
    public String getDetailStudentByHien(@RequestParam(value = "id",defaultValue = "2") int idStudent) {
        System.out.println(idStudent);
        return "student/detail";
    }

    @GetMapping(value = "/create")
    public String getPageCreateStudent(Model model) {
      List<ClassRoom> classRooms = iClassService.findAll();
        model.addAttribute("classRooms",classRooms);
        model.addAttribute("student", new Student());
        return "student/create";
    }

    @PostMapping(value = "/create")
    public String saveStudent(@ModelAttribute("student")Student student,
                              RedirectAttributes redirectAttributes) {

         iStudentService.save(student);
         redirectAttributes.addFlashAttribute("msg",
                 "Create student successfully!");
        return "redirect:/list";
    }
    @GetMapping(value = "/search")
    public String searchByName(@RequestParam("searchName")String name, Model model) {
            List<Student> students = iStudentService.searchByName(name);
            model.addAttribute("studentList", students);
            return "student/list";
    }
}
