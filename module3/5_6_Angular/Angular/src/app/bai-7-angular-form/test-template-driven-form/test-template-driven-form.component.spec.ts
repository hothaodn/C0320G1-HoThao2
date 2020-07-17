import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestTemplateDrivenFormComponent } from './test-template-driven-form.component';

describe('TestTemplateDrivenFormComponent', () => {
  let component: TestTemplateDrivenFormComponent;
  let fixture: ComponentFixture<TestTemplateDrivenFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestTemplateDrivenFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestTemplateDrivenFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
