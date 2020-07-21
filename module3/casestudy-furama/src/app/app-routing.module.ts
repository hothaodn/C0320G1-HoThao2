import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomepageComponent} from './component/homepage/homepage.component';
import {CustomerListComponent} from './component/customer/customer-list/customer-list.component';
import {ServiceListComponent} from './component/hotel-service/service-list/service-list.component';
import {EmployeeListComponent} from './component/employee/employee-list/employee-list.component';
import {AccompaniedServiceComponent} from './component/accompanied-service-list/accompanied-service.component';
import {BookingListComponent} from './component/booking/booking-list/booking-list.component';

const routes: Routes = [
  {
    path: '', component: HomepageComponent
  },
  {
    path: 'admin/customer/view-all',
    component: CustomerListComponent
  },
  {
    path: 'admin/service/view-all-hotel-services',
    component: ServiceListComponent
  },
  {
    path: 'admin/service/view-all-accompanies-services',
    component: AccompaniedServiceComponent
  },
  {
    path: 'admin/employee/view-all',
    component: EmployeeListComponent
  },
  {
    path: 'admin/booking/view-all',
    component: BookingListComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
