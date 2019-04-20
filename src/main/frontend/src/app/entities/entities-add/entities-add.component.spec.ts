import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EntitiesAddComponent } from './entities-add.component';

describe('EntitiesAddComponent', () => {
  let component: EntitiesAddComponent;
  let fixture: ComponentFixture<EntitiesAddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntitiesAddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntitiesAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
