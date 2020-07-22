import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
// import {SERVICES} from '../../../model/DAO/hotelServiceDao';

@Component({
  selector: 'app-service-create',
  templateUrl: './service-create.component.html',
  styleUrls: ['./service-create.component.css']
})
export class ServiceCreateComponent implements OnInit {

  createForm: FormGroup;
  // serviceList = SERVICES;
  message = '';

  constructor() {
    this.createForm = new FormGroup({
      idService: new FormControl('', [Validators.required, Validators.pattern('^(DV)-[0-9]{4}$')]),
      nameService: new FormControl('', Validators.required),
      areaUsing: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      rentalFee: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      maxOccupancies: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      rentalType: new FormControl('', Validators.required),
      roomStandard: new FormControl(''),
      facilities: new FormControl(''),
      numberOfFloor: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      areaSwimmingPool: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      freeService: new FormControl(''),
    });
  }

  onSubmit() {
    console.log(this.createForm.value);
    // this.serviceList.push(this.createForm.value);
    this.message = 'Saved successfully!';
  }

  ngOnInit() {
  }

}
