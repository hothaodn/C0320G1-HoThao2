import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhTimelinesComponent } from './thuc-hanh-timelines.component';

describe('ThucHanhTimelinesComponent', () => {
  let component: ThucHanhTimelinesComponent;
  let fixture: ComponentFixture<ThucHanhTimelinesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhTimelinesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhTimelinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
