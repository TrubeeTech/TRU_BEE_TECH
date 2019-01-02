import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MydocsPage } from './mydocs.page';

describe('MydocsPage', () => {
  let component: MydocsPage;
  let fixture: ComponentFixture<MydocsPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MydocsPage ],
      schemas: [CUSTOM_ELEMENTS_SCHEMA],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MydocsPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
