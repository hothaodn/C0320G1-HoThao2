import {Component, Input, OnInit} from '@angular/core';
import {IPet} from '../IPet';

@Component({
  selector: 'app-pet-details',
  templateUrl: './pet-details.component.html',
  styleUrls: ['./pet-details.component.scss']
})
export class PetDetailsComponent implements OnInit {
  @Input('pet')
  petDetail: IPet;

  setHealthStatus(event: any)  {
    console.log(event.target.value);
    this.petDetail.healthStatus = event.target.value;
  }

  constructor() { }

  ngOnInit() {
  }

}
