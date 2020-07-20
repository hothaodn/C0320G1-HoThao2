import { Component, OnInit } from '@angular/core';
import {ACCOMSERVICES} from '../../model/DAO/accompaniedServiceDao';

@Component({
  selector: 'app-accompanied-service',
  templateUrl: './accompanied-service.component.html',
  styleUrls: ['./accompanied-service.component.css']
})
export class AccompaniedServiceComponent implements OnInit {

  accServiceList = ACCOMSERVICES;

  constructor() { }

  ngOnInit() {
  }

}
