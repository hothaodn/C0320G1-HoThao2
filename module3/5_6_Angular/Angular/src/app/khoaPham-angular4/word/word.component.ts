import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-word',
  templateUrl: './word.component.html',
  styleUrls: ['./word.component.scss']
})
export class WordComponent implements OnInit {

  en = 'Hello';
  vn = 'Xin chao';
  imageUrl = 'https://viblo.asia/uploads/dfbd5235-6342-4a1d-9672-f78c941338c1.png';
  forgot = false;

  toggleForgot() {
    this.forgot = !this.forgot;
  }

  constructor() { }

  ngOnInit() {
  }

}
