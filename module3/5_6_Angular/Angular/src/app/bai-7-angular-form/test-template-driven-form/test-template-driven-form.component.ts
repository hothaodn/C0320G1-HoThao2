import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test-template-driven-form',
  templateUrl: './test-template-driven-form.component.html',
  styleUrls: ['./test-template-driven-form.component.scss']
})
export class TestTemplateDrivenFormComponent implements OnInit {

  profile = {
    username: 'Bob',
    email: 'abc@deg.com',
    facebook: 'facebook.com',
    twitter: 'twitter.com',
    website: 'example.com',
    tel: '1234-5678-90'
  };
  constructor() { }

  ngOnInit() {
  }

  onSubmit(profileForm) {
    console.log(profileForm);
    // unhandle exception
    // throw new Error('Something went wrong');
  }

}
