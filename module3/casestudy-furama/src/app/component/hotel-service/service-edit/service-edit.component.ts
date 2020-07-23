import {Component, Input, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {DatePipe} from '@angular/common';
import {ActivatedRoute, Router} from '@angular/router';
import {IHotelService} from '../../../model/hotelService.model';
import {HotelServiceService} from '../../../services/hotel-service/hotel-service.service';

@Component({
  selector: 'app-service-edit',
  templateUrl: './service-edit.component.html',
  styleUrls: ['./service-edit.component.css']
})
export class ServiceEditComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  private datepipe: DatePipe;
  public idService;

  @Input()
  serviceDetail: IHotelService;

  constructor(
    public hotelServiceService: HotelServiceService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) { }

  ngOnInit() {
    this.createForm = new FormGroup({
      codeService: new FormControl('', [Validators.required, Validators.pattern('^(DV)-[0-9]{4}$')]),
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

    this.activatedRoute.params.subscribe(data => {
      this.idService = data.id;
      this.hotelServiceService.getHotelServiceById(this.idService).subscribe(customerToEdit => {
        this.createForm.patchValue(customerToEdit);
      });
    });
  }

  onSubmit() {
    console.log(this.createForm.value);
    this.hotelServiceService.editHotelService(this.createForm.value, this.idService).subscribe(data => {
      this.router.navigateByUrl('admin/service/view-all-hotel-services');
    });
  }

}
