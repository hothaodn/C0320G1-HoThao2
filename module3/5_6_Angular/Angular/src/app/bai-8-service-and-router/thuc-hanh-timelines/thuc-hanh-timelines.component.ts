import { Component, OnInit } from '@angular/core';
import {DateUtilService} from "./date-util.service";

@Component({
  selector: 'app-thuc-hanh-timelines',
  templateUrl: './thuc-hanh-timelines.component.html',
  styleUrls: ['./thuc-hanh-timelines.component.scss']
})

export class ThucHanhTimelinesComponent implements OnInit {

  output = '';
  constructor(private dateUtilService: DateUtilService) { }

  ngOnInit() {
  }

  onChange(value) {
    this.output = this.dateUtilService.getDiffToNow(value);
  }

}
