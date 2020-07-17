import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BaiTapLoginFormComponent } from './bai-tap-login-form.component';

describe('BaiTapLoginFormComponent', () => {
  let component: BaiTapLoginFormComponent;
  let fixture: ComponentFixture<BaiTapLoginFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BaiTapLoginFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BaiTapLoginFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
