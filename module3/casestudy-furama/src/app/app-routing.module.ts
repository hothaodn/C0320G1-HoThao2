import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomepageComponent} from './component/homepage/homepage.component';
import {CustomerListComponent} from './component/customer/customer-list/customer-list.component';
import {ServiceListComponent} from './component/hotel-service/service-list/service-list.component';
import {EmployeeListComponent} from './component/employee/employee-list/employee-list.component';
import {AccompaniedServiceComponent} from './component/accompanied-service-list/accompanied-service.component';
import {BookingListComponent} from './component/booking/booking-list/booking-list.component';
import {CustomerEditComponent} from './component/customer/customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './component/customer/customer-create/customer-create.component';
import {EmployeeEditComponent} from './component/employee/employee-edit/employee-edit.component';
import {EmployeeCreateComponent} from './component/employee/employee-create/employee-create.component';
import {ServiceCreateComponent} from './component/hotel-service/service-create/service-create.component';
import {ServiceEditComponent} from './component/hotel-service/service-edit/service-edit.component';
import {BookingCreateComponent} from "./component/booking/booking-create/booking-create.component";
import {BookingEditComponent} from "./component/booking/booking-edit/booking-edit.component";

const routes: Routes = [
  {
    path: '', component: HomepageComponent
  },
  {
    path: 'admin/customer/view-all',
    component: CustomerListComponent
  },
  {
    path: 'admin/customer/edit/:id',
    component: CustomerEditComponent
  },
  {
    path: 'admin/customer/create',
    component: CustomerCreateComponent
  },
  {
    path: 'admin/employee/view-all',
    component: EmployeeListComponent
  },
  {
    path: 'admin/employee/edit/:id',
    component: EmployeeEditComponent
  },
  {
    path: 'admin/employee/create',
    component: EmployeeCreateComponent
  },
  {
    path: 'admin/service/view-all-hotel-services',
    component: ServiceListComponent
  },
  {
    path: 'admin/service/create',
    component: ServiceCreateComponent
  },
  {
    path: 'admin/service/edit/:id',
    component: ServiceEditComponent
  },
  {
    path: 'admin/service/view-all-accompanies-services',
    component: AccompaniedServiceComponent
  },
  {
    path: 'admin/booking/view-all',
    component: BookingListComponent
  },
  {
    path: 'admin/booking/create',
    component: BookingCreateComponent
  },
  {
    path: 'admin/booking/edit/:id',
    component: BookingEditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
