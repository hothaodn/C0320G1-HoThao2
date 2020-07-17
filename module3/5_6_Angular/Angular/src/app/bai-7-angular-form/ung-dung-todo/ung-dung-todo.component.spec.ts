import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UngDungTodoComponent } from './ung-dung-todo.component';

describe('UngDungTodoComponent', () => {
  let component: UngDungTodoComponent;
  let fixture: ComponentFixture<UngDungTodoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UngDungTodoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UngDungTodoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
