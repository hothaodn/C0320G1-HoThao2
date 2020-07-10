import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayPetInfoComponent } from './display-pet-info.component';

describe('DisplayPetInfoComponent', () => {
  let component: DisplayPetInfoComponent;
  let fixture: ComponentFixture<DisplayPetInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayPetInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayPetInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
