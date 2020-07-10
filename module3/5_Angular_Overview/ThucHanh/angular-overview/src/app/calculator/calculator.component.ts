import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.scss']
})
export class CalculatorComponent implements OnInit {

  result : any;

  calculate(firstNum,secondNum,action){
    if(Number.isNaN(firstNum) == false && Number.isNaN(secondNum) == false){
      switch (action) {
        case "+":
          this.result = parseFloat(firstNum) + parseFloat(secondNum);
          break;
        case "-":
          this.result = parseFloat(firstNum) - parseFloat(secondNum);
          break;
        case "*":
          this.result = parseFloat(firstNum) * parseFloat(secondNum);
          break;
        case "/":
          if(secondNum != 0){
            this.result = parseFloat(firstNum) / parseFloat(secondNum);
            break;
          } else {
            this.result = "Number 2 must be not ZERO";
          }
          break;
      }
    } else{
      this.result = "Please input a NUMBER";
    }
  }

  constructor() { }

  ngOnInit() {
  }

}
