import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookingCreateComponent } from './component/booking/booking-create/booking-create.component';
import { CustomerCreateComponent } from './component/customer/customer-create/customer-create.component';
import { EmployeeCreateComponent } from './component/employee/employee-create/employee-create.component';
import { BookingListComponent } from './component/booking/booking-list/booking-list.component';
import { BookingEditComponent } from './component/booking/booking-edit/booking-edit.component';
import { BookingDeleteComponent } from './component/booking/booking-delete/booking-delete.component';
import { CustomerListComponent } from './component/customer/customer-list/customer-list.component';
import { CustomerEditComponent } from './component/customer/customer-edit/customer-edit.component';
import { CustomerDeleteComponent } from './component/customer/customer-delete/customer-delete.component';
import { EmployeeListComponent } from './component/employee/employee-list/employee-list.component';
import { EmployeeDeleteComponent } from './component/employee/employee-delete/employee-delete.component';
import { EmployeeEditComponent } from './component/employee/employee-edit/employee-edit.component';
import { ServiceCreateComponent } from './component/hotel-service/service-create/service-create.component';
import { ServiceEditComponent } from './component/hotel-service/service-edit/service-edit.component';
import { ServiceDeleteComponent } from './component/hotel-service/service-delete/service-delete.component';
import { ServiceListComponent } from './component/hotel-service/service-list/service-list.component';
import { HomepageComponent } from './component/homepage/homepage.component';
import { AccompaniedServiceComponent } from './component/accompanied-service/accompanied-service.component';

@NgModule({
  declarations: [
    AppComponent,
    BookingCreateComponent,
    CustomerCreateComponent,
    EmployeeCreateComponent,
    BookingListComponent,
    BookingEditComponent,
    BookingDeleteComponent,
    CustomerListComponent,
    CustomerEditComponent,
    CustomerDeleteComponent,
    EmployeeListComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    ServiceCreateComponent,
    ServiceEditComponent,
    ServiceDeleteComponent,
    ServiceListComponent,
    HomepageComponent,
    AccompaniedServiceComponent,
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        Ng2SearchPipeModule,
        NgxPaginationModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
