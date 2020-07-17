import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {

  playlist = [
    {id: 'W82msO2iYbM', song: 'Bongo Cat - Believer - Imagine Dragons'},
    {id: 'ncN8JeG-dZ0', song: 'Bongo Cat - ‘뚜두뚜두 (DDU-DU DDU-DU)’ - BLACKPINK (K-POP)'},
    {id: 'J2LBttJgCTk', song: 'Tones and I - Dance Monkey'},
    {id: 'uelHwf8o7_U', song: 'Eminem - Love The Way You Lie ft. Rihanna'},
    {id: 'WpYeekQkAdc', song: 'The Black Eyed Peas - Where Is The Love?'}
  ];
  constructor() { }

  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
