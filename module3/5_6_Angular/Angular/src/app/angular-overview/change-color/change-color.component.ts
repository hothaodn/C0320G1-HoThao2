import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-change-color',
  templateUrl: './change-color.component.html',
  styleUrls: ['./change-color.component.scss']
})
export class ChangeColorComponent implements OnInit {
  colorIndex = "#47cdda";

  onChange(value) {
    console.log(value);
    this.colorIndex = value;
  }

  constructor() { }

  ngOnInit() {
  }

}
