import { Component, OnInit } from '@angular/core';
import { MapasService } from '../mapas.service';

@Component({
  selector: 'app-mapas-listagem',
  templateUrl: './mapas-listagem.component.html',
  styleUrls: ['./mapas-listagem.component.css']
})
export class MapasListagemComponent implements OnInit {

  mapas:Array<any>;

  constructor(private mapasService : MapasService) { }

  ngOnInit() {
    this.listar();
  }
  
  listar(){
    this.mapasService.listar().subscribe(dados => this.mapas = dados);
  }
}
