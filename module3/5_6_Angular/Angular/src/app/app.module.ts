import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeFontSizeComponent } from './angular-overview/change-font-size/change-font-size.component';
import { DisplayPetInfoComponent } from './angular-overview/display-pet-info/display-pet-info.component';
import { CalculatorComponent } from './angular-overview/calculator/calculator.component';
import { ChangeColorComponent } from './angular-overview/change-color/change-color.component';
import { NameCardComponent } from './bai-6-component-and-template/name-card/name-card.component';
import { ProgressBarComponent } from './bai-6-component-and-template/progress-bar/progress-bar.component';
import { UngDungBinhChonComponent } from './bai-6-component-and-template/ung-dung-binh-chon/ung-dung-binh-chon.component';
import { TimerCountdownGetSetComponent } from './bai-6-component-and-template/timer-countdown-get-set/timer-countdown-get-set.component';
import {TimerCountdownComponent} from './bai-6-component-and-template/timer-countdown/timer-countdown.component';
import {TimerCountdownOnchangesComponent} from './bai-6-component-and-template/timer-countdown-onchanges/timer-countdown-onchanges.component';
import { WordComponent } from './khoaPham-angular4/word/word.component';
import { UserFormComponent } from './khoaPham-angular4/user-form/user-form.component';
import { PetDetailsComponent } from './recode-demo-input-output-jul-14/pet-details/pet-details.component';
import { PetListComponent } from './recode-demo-input-output-jul-14/pet-list/pet-list.component';
import { UngDungTodoComponent } from './bai-7-angular-form/ung-dung-todo/ung-dung-todo.component';
import { BaiTapRegisterFormComponent } from './bai-7-angular-form/bai-tap-register-form/bai-tap-register-form.component';
import { BaiTapLoginFormComponent } from './bai-7-angular-form/bai-tap-login-form/bai-tap-login-form.component';
import { TestTemplateDrivenFormComponent } from './bai-7-angular-form/test-template-driven-form/test-template-driven-form.component';
import { ThucHanhTimelinesComponent } from './bai-8-service-and-router/thuc-hanh-timelines/thuc-hanh-timelines.component';
import { ThucHanhUngDungNgheNhacComponent } from './bai-8-service-and-service/thuc-hanh-ung-dung-nghe-nhac/thuc-hanh-ung-dung-nghe-nhac.component';
import { YoutubePlaylistComponent } from './bai-8-service-and-router/youtube-playlist/youtube-playlist.component';
import { YoutubePlayerComponent } from './bai-8-service-and-router/youtube-player/youtube-player.component';

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
    TimerCountdownComponent,
    TimerCountdownGetSetComponent,
    TimerCountdownOnchangesComponent,
    WordComponent,
    UserFormComponent,
    PetDetailsComponent,
    PetListComponent,
    UngDungTodoComponent,
    BaiTapRegisterFormComponent,
    BaiTapLoginFormComponent,
    TestTemplateDrivenFormComponent,
    ThucHanhTimelinesComponent,
    ThucHanhUngDungNgheNhacComponent,
    YoutubePlaylistComponent,
    YoutubePlayerComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
