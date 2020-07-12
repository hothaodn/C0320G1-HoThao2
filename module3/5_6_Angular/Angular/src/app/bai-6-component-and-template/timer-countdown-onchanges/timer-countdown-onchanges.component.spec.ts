import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TimerCountdownOnchangesComponent } from './timer-countdown-onchanges.component';

describe('TimerCountdownOnchangesComponent', () => {
  let component: TimerCountdownOnchangesComponent;
  let fixture: ComponentFixture<TimerCountdownOnchangesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TimerCountdownOnchangesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TimerCountdownOnchangesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
