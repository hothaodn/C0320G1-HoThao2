import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhUngDungNgheNhacComponent } from './thuc-hanh-ung-dung-nghe-nhac.component';

describe('ThucHanhUngDungNgheNhacComponent', () => {
  let component: ThucHanhUngDungNgheNhacComponent;
  let fixture: ComponentFixture<ThucHanhUngDungNgheNhacComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhUngDungNgheNhacComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhUngDungNgheNhacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
