import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MapasListagemComponent } from './mapas-listagem.component';

describe('MapasListagemComponent', () => {
  let component: MapasListagemComponent;
  let fixture: ComponentFixture<MapasListagemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MapasListagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MapasListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
