import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-change-font-size',
  templateUrl: './change-font-size.component.html',
  styleUrls: ['./change-font-size.component.scss']
})
export class ChangeFontSizeComponent implements OnInit {
  // fontSize = 5;
  //
  // onChange(value) {
  //   this.fontSize = value;
  // }

  width = 100;

  onClick(value) {

    this.width = value;
  }
  constructor() { }

  ngOnInit() {
  }

}
