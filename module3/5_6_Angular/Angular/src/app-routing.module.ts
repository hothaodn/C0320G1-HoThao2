import {PreloadAllModules, RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {ThucHanhTimelinesComponent} from "./app/bai-8-service-and-router/thuc-hanh-timelines/thuc-hanh-timelines.component";

const routes: Routes = [
  {
    path: 'timelines',
    component: ThucHanhTimelinesComponent

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    preloadingStrategy: PreloadAllModules
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {}
