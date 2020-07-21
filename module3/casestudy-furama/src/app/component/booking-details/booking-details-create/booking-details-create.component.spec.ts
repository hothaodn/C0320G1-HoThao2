import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingDetailsCreateComponent } from './booking-details-create.component';

describe('BookingDetailsCreateComponent', () => {
  let component: BookingDetailsCreateComponent;
  let fixture: ComponentFixture<BookingDetailsCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookingDetailsCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookingDetailsCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
