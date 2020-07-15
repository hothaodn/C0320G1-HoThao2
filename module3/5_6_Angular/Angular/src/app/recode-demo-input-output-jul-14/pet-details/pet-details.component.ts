import {Component, Input, OnInit} from '@angular/core';
import {IPet} from '../IPet';

@Component({
  selector: 'app-pet-details',
  templateUrl: './pet-details.component.html',
  styleUrls: ['./pet-details.component.scss']
})
export class PetDetailsComponent implements OnInit {
  @Input()
  petDetail: IPet;

  setHealthStatus(value: string){
    this.petDetail.healthStatus = value;
  }

  constructor() { }

  ngOnInit() {
  }

}
