import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { CustomerService } from 'src/app/ng-service/customer.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  customerForm : FormGroup ;
  id : number ;

  constructor(private customerService: CustomerService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder,
              private router: Router) { 
                this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
                this.id = +paramMap.get('id');
                const customer = this.customerService.findById(this.id);
                
                this.customerForm = this.fb.group({
                   id : customer.id ,
                   hoTen : customer.hoTen,
                   ngaySinh : customer.ngaySinh,
                   gioiTinh : customer.gioiTinh,
                   soCMND : customer.soCMND,
                    soDienThoai : customer.soDienThoai,
                    email : customer.email,
                    loaiKhach : customer.loaiKhach,
                    diaChi : customer.diaChi,
                 })
               });
              }

  ngOnInit(): void {
  }

  updateCustomer(id: number) {
    const customer = this.customerForm.value;
    this.customerService.updateCustomer(id, customer);
    this.router.navigate(['customer/list']);
    alert('Cập nhật thành công');
  }
}
