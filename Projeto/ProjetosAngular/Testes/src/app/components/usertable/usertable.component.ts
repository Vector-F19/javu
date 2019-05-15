import {Component, OnInit, ViewChild} from '@angular/core';
import {MatDialog, MatPaginator, MatTableDataSource} from '@angular/material';
import {UserService} from '../../services/user.service';
import {Mapa} from '../../models/user.model';


@Component({
  // tslint:disable-next-line:component-selector
  selector: 'usertable',
  templateUrl: './usertable.component.html',
  styleUrls: ['./usertable.component.css']
})

export class UsertableComponent implements OnInit {


  @ViewChild(MatPaginator) paginator: MatPaginator;

  displayedColumns: string[] = ['mapa', 'fluxo', 'produto', 'entrada', 'saida', 'modal'];
  dataSource = new MatTableDataSource();
  dataSource2 = new MatTableDataSource();


  value;

  fluxo1;
  produto2;
  entrada3;
  saida4;

  mapaPreenchido = new Mapa();

  ngOnInit() {
    this.executaAi(this.mapaPreenchido);
  }

  /*________________________________________________*/

  constructor(private userService: UserService, public dialog: MatDialog) {
  }

  openDialog(modal: string) {
    const dialogRef = this.userService.getModal(modal);

    dialogRef.subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }
  /*________________________________________________*/

  sample(mapa: string) {
    this.userService.getMapaByName(mapa)
      .subscribe(dados => {
          if (dados != null) {
            console.log(dados);
            this.dataSource2 = new MatTableDataSource(dados);
            this.dataSource2.paginator = this.paginator;
          }
        }
      );
  }

  executaAi(mapa: Mapa) {
    this.userService.getMapaByParan(mapa)
      .subscribe(dados => {
          if (dados != null) {
            console.log(dados);
            this.dataSource = new MatTableDataSource(dados);
            this.dataSource.paginator = this.paginator;
          }
        }
      );
  }

  buscaPorParans(mapa: Mapa) {

    mapa.fluxo = this.fluxo1;
    mapa.produto = this.produto2;
    mapa.bancoEntrada = this.entrada3;
    mapa.bancoSaida = this.saida4;

    this.executaAi(mapa);

  }

}
