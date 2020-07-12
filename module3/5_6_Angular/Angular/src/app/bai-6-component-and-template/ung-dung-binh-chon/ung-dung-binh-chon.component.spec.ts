import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UngDungBinhChonComponent } from './ung-dung-binh-chon.component';

describe('UngDungBinhChonComponent', () => {
  let component: UngDungBinhChonComponent;
  let fixture: ComponentFixture<UngDungBinhChonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UngDungBinhChonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UngDungBinhChonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
