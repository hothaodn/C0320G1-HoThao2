import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeFontSizeComponent } from './angular-overview/change-font-size/change-font-size.component';
import { DisplayPetInfoComponent } from './display-pet-info/display-pet-info.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ChangeColorComponent } from './change-color/change-color.component';


@NgModule({
  declarations: [
    AppComponent,
    ChangeFontSizeComponent,
    DisplayPetInfoComponent,
    CalculatorComponent,
    ChangeColorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
