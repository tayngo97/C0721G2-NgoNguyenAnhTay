import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { CustomerDeleteComponent } from './customer-delete/customer-delete.component';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { CustomerListComponent } from './customer-list/customer-list.component';


const routes: Routes = [
  {
    path:'list', 
    component: CustomerListComponent
  },
  {
    path:'delete/:id', 
    component: CustomerDeleteComponent
  },
  {
    path:'edit/:id', 
    component: CustomerEditComponent
  },
  {
    path:'create',
    component: CustomerCreateComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule { }
