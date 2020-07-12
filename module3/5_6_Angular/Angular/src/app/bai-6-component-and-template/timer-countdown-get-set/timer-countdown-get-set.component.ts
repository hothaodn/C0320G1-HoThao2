import {Component, Input, OnInit,OnDestroy} from '@angular/core';

@Component({
  selector: 'app-timer-countdown-get-set',
  templateUrl: './timer-countdown-get-set.component.html',
  styleUrls: ['./timer-countdown-get-set.component.scss']
})
export class TimerCountdownGetSetComponent implements OnInit {

  private intervalId = 0;
  message = '';
  remainingTime: number;

  private _seconds = 11;
  @Input()
  get seconds(): number {
    return this._seconds;
  }
  set seconds(v) {
    const vFixed = Number(v);
    this._seconds = Number.isNaN(vFixed) ? 11 : vFixed;
  }

  clearTimer() {
    clearInterval(this.intervalId);
  }

  ngOnInit() {
    this.reset();
    this.start();
  }
  ngOnDestroy() {
    this.clearTimer();
  }

  start() {
    this.countDown();
    if (this.remainingTime <= 0) {
      this.remainingTime = this.seconds;
    }
  }
  stop() {
    this.clearTimer();
    this.message = `Holding at T-${this.remainingTime} seconds`;
  }
  reset() {
    this.clearTimer();
    this.remainingTime = this.seconds;
    this.message = `Click start button to start the Countdown`;
  }

  private countDown() {
    this.clearTimer();
    this.intervalId = window.setInterval(() => {
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.message = 'Blast off!';
        this.clearTimer();
      } else {
        this.message = `T-${this.remainingTime} seconds and counting`;
      }
    }, 1000);
  }

}
