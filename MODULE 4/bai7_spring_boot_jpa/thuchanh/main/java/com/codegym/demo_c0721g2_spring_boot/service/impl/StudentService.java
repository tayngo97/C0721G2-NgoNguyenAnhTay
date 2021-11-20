package com.codegym.demo_c0721g2_spring_boot.service.impl;

import com.codegym.demo_c0721g2_spring_boot.bean.Student;
import com.codegym.demo_c0721g2_spring_boot.repository.IStudentRepository;
import com.codegym.demo_c0721g2_spring_boot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService")
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public List<Student> findAll() {
        return this.iStudentRepository.findAll();
    }

    @Override
    public Student findById(int idStudent) {
        //orElse sẽ trả về null nếu không tìm thấy đối tượng Student có idStudent.
        return this.iStudentRepository.findById(idStudent).orElse(null);
    }

    @Override
    public void save(Student student) {
        //Save được dùng cho cập nhật và thêm mới
        //Khi có id trong student -> cập nhật
        // id = null hoặc không có trong database -> thêm mới.
        this.iStudentRepository.save(student);
    }

    @Override
    public List<Student> searchByName(String name) {
        return iStudentRepository.searchByName("%"+name+"%");
    }


    @Override
    public Page<Student> findAll(Pageable pageable) {
        return this.iStudentRepository.findAll(pageable);
    }
}
