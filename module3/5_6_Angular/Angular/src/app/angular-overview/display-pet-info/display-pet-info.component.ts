import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-display-pet-info',
  templateUrl: './display-pet-info.component.html',
  styleUrls: ['./display-pet-info.component.scss']
})
export class DisplayPetInfoComponent implements OnInit {

  petName = 'Shironeko';
  petImage = 'https://img01.vietnhat.tv/usr/nhatban/10341493_319258378199345_9114432466486138575_n.jpg';
  constructor() { }

  updateName(name) {
    this.petName = name;
  }

  updateImage(image) {
    this.petImage = image;
  }

  ngOnInit() {
  }

}
