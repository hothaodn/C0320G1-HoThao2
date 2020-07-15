import { Component, OnInit } from '@angular/core';
import {PETS} from '../PetDao';
import {IPet} from '../IPet';

@Component({
  selector: 'app-pet-list',
  templateUrl: './pet-list.component.html',
  styleUrls: ['./pet-list.component.scss']
})
export class PetListComponent implements OnInit {
  petList = PETS;
  petDetail: IPet;

  constructor() { }

  ngOnInit() {
  }

  showPetDetail(pet: IPet) {
    this.petDetail = pet;
    console.log(pet);
  }
}
