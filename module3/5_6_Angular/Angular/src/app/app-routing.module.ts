import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ThucHanhTimelinesComponent} from '../app/bai-8-service-and-router/thuc-hanh-timelines/thuc-hanh-timelines.component'
import {YoutubePlaylistComponent} from "./bai-8-service-and-router/youtube-playlist/youtube-playlist.component";
import {YoutubePlayerComponent} from "./bai-8-service-and-router/youtube-player/youtube-player.component";

const routes: Routes = [
  {
    path: 'timelines',
    component: ThucHanhTimelinesComponent
  },
  {
    path: 'youtube',
    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
