import {Component, OnInit} from '@angular/core';
import {Customer} from 'src/app/model/customer';
import {CustomerService} from 'src/app/service/customer.service';
import {MatDialog} from '@angular/material/dialog';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';
import {CustomerTextComponent} from '../customer-text/customer-text.component';
import {CustomerTypeService} from '../../service/customer-type.service';
import {environment} from '../../../environments/environment';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})

export class CustomerListComponent implements OnInit {

  customers: Customer[] = [];
  keyword = '';

  constructor(private customerService: CustomerService,
              public dialog: MatDialog) {
  }

  search() {
    console.log(this.keyword);
    if (this.keyword === '') {
      this.getAll();
    } else {
      this.customerService.searchByKeyWord(this.keyword).subscribe(customers => {
        this.customers = customers;
      });
    }
  }

  ngOnInit(): void {
    this.getAll();

  }

  openDialog(customer: any) {
    this.dialog.open(CustomerTextComponent, {data: customer, width: '30%'}).afterClosed().subscribe((value => {
      if (value === 'delete') {
        this.getAll();
      }
    }));

    // dialogRef.afterClosed().subscribe(result => {
    //   console.log(`Dialog result: ${result}`);
    // });
  }

  getAll() {
    this.customerService.getAll().subscribe(customers => {
      this.customers = customers;
    });
  }


}
