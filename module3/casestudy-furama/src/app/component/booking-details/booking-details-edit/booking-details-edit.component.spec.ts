import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingDetailsEditComponent } from './booking-details-edit.component';

describe('BookingDetailsEditComponent', () => {
  let component: BookingDetailsEditComponent;
  let fixture: ComponentFixture<BookingDetailsEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookingDetailsEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookingDetailsEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
