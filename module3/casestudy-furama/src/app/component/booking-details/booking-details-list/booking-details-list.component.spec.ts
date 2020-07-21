import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingDetailsListComponent } from './booking-details-list.component';

describe('BookingDetailsListComponent', () => {
  let component: BookingDetailsListComponent;
  let fixture: ComponentFixture<BookingDetailsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookingDetailsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookingDetailsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
