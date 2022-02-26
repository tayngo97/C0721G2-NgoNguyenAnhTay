import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {CustomerService} from 'src/app/service/customer.service';
import {CustomerType} from '../../model/customer-type';
import {CustomerTypeService} from '../../service/customer-type.service';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {

  customerForm: FormGroup;
  customerType: CustomerType[];
  id: number;

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute,
              private fb: FormBuilder,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.getCustomer(this.id);
    });

    this.customerTypeService.getAllCustomerType().subscribe(c => {
      this.customerType = c;
    }, error => {
      console.log(error);
    });
  }

  ngOnInit(): void {
  }

  getCustomer(id: number) {
    return this.customerService.findById(id).subscribe(customer => {
      this.customerForm = this.fb.group({
        id: customer.id,
        hoTen: customer.hoTen,
        maKh: customer.maKh,
        ngaySinh: customer.ngaySinh,
        gioiTinh: customer.gioiTinh,
        soCMND: customer.soCMND,
        soDienThoai: customer.soDienThoai,
        email: customer.email,
        loaiKhach: customer.loaiKhach,
        diaChi: customer.diaChi
      });
    });
  }

  updateCustomer() {
    // const customer = this.customerForm.value;
    this.customerService.updateCustomer(this.customerForm.value, this.customerForm.value.id).subscribe(() => {
      alert('Cập nhật thành công');
      this.router.navigate(['customer/list']);
    }, e => {
      console.log(e);
      alert('Lỗi')
    });
  }
}
