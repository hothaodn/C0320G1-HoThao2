import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapRegisterFormComponent } from './bai-tap-register-form.component';

describe('BaiTapRegisterFormComponent', () => {
  let component: BaiTapRegisterFormComponent;
  let fixture: ComponentFixture<BaiTapRegisterFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapRegisterFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapRegisterFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
