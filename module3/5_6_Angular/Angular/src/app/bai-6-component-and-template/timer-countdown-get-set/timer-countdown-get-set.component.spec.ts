import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimerCountdownGetSetComponent } from './timer-countdown-get-set.component';

describe('TimerCountdownGetSetComponent', () => {
  let component: TimerCountdownGetSetComponent;
  let fixture: ComponentFixture<TimerCountdownGetSetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimerCountdownGetSetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimerCountdownGetSetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
