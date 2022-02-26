package com.example.demo.resource;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.validation.CustomerDtoValidatior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/customer")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerDtoValidatior customerDtoValidatior;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.findAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/search/{keyword}")
    public ResponseEntity<List<Customer>> searchCustomer(@PathVariable("keyword") String keyword){
        System.out.println(keyword);

        if (keyword.equals("")) {
            List<Customer> customers = customerService.findAllCustomers();
            return new ResponseEntity<>(customers, HttpStatus.OK);
        } else {
            List<Customer> customerList = customerService.findByKeyWord(keyword);
            return new ResponseEntity<>(customerList,HttpStatus.OK);
        }
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Integer id) {
        Customer customer = customerService.findCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

//    @PostMapping("/add")
//    public ResponseEntity<Customer> addCustomer( @RequestBody Customer customer) {
//        Customer newCustomer = customerService.addCustomer(customer);
//        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
//    }

    @PostMapping("/add")
    public ResponseEntity<?> addCustomer(@Valid @RequestBody CustomerDto customerDto,BindingResult bindingResult)
    {
        customerDtoValidatior.validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.NOT_MODIFIED);
        } else {
            Customer customer = new Customer();
            customer.setHoTen(customerDto.getHoTen());
            customer.setMaKh(customerDto.getMaKh());
            customer.setNgaySinh(customerDto.getNgaySinh());
            customer.setGioiTinh(customerDto.getGioiTinh());
            customer.setSoCMND(customerDto.getSoCMND());
            customer.setSoDienThoai(customerDto.getSoDienThoai());
            customer.setEmail(customerDto.getEmail());
            customer.setLoaiKhach(customerDto.getLoaiKhach());
            customer.setDiaChi(customerDto.getDiaChi());
            Customer newCustomer = customerService.addCustomer(customer);
            return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCustomer(@Valid @RequestBody CustomerDto customerDto, BindingResult bindingResult, @PathVariable int id) {

        Customer customer = customerService.findCustomerById(id);
        customerDtoValidatior.validate(customerDto, bindingResult);

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.NOT_MODIFIED);
        }

        if (customer == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            customer.setId(id);
            customer.setHoTen(customerDto.getHoTen());
            customer.setMaKh(customerDto.getMaKh());
            customer.setNgaySinh(customerDto.getNgaySinh());
            customer.setGioiTinh(customerDto.getGioiTinh());
            customer.setSoCMND(customerDto.getSoCMND());
            customer.setSoDienThoai(customerDto.getSoDienThoai());
            customer.setEmail(customerDto.getEmail());
            customer.setLoaiKhach(customerDto.getLoaiKhach());
            customer.setDiaChi(customerDto.getDiaChi());
            customerService.updateCustomer(customer);
            return new ResponseEntity<>(HttpStatus.OK);

        }
//        Customer updateCustomer = customerService.updateCustomer(customer);
//        return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") Integer id) {
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
