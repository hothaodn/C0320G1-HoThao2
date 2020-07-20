import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccompaniedServiceComponent } from './accompanied-service.component';

describe('AccompaniedServiceComponent', () => {
  let component: AccompaniedServiceComponent;
  let fixture: ComponentFixture<AccompaniedServiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AccompaniedServiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccompaniedServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
