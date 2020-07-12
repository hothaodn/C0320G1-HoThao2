import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeFontSizeComponent } from './angular-overview/change-font-size/change-font-size.component';
import { DisplayPetInfoComponent } from './angular-overview/display-pet-info/display-pet-info.component';
import { CalculatorComponent } from './angular-overview/calculator/calculator.component';
import { ChangeColorComponent } from './angular-overview/change-color/change-color.component';
import { NameCardComponent } from './bai-6-component-and-template/name-card/name-card.component';
import { ProgressBarComponent } from './bai-6-component-and-template/progress-bar/progress-bar.component';
import { UngDungBinhChonComponent } from './bai-6-component-and-template/ung-dung-binh-chon/ung-dung-binh-chon.component';
import { TimerCountdownComponent } from './bai-6-component-and-template/timer-countdown/timer-countdown.component';


@NgModule({
  declarations: [
    AppComponent,
    ChangeFontSizeComponent,
    DisplayPetInfoComponent,
    CalculatorComponent,
    ChangeColorComponent,
    NameCardComponent,
    ProgressBarComponent,
    UngDungBinhChonComponent,
    TimerCountdownComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
