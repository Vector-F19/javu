import {Component, OnInit, ViewChild} from '@angular/core';
import {MatDialog, MatDialogConfig, MatPaginator, MatTableDataSource} from '@angular/material';
import {UserService} from '../../services/user.service';
import {Mapa} from '../../models/user.model';
import {DialogContentExampleDialog} from './DialogContentExampleDialog';


@Component({
  // tslint:disable-next-line:component-selector
  selector: 'usertable',
  templateUrl: './usertable.component.html',
  styleUrls: ['./usertable.component.css']
})

export class UsertableComponent implements OnInit {

  dialogResult: string = '';

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

  openDialog(mapa: Mapa) {


    const dialogConfig = new MatDialogConfig();

    dialogConfig.disableClose = true;
    dialogConfig.autoFocus = true;


    dialogConfig.data = {
      modal: mapa,
    };
    console.log(dialogConfig);
    const dialogRef = this.dialog.open(DialogContentExampleDialog, dialogConfig);

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }


  sample(mapa: string) {
    this.userService.getMapaByName(mapa)
      .subscribe(dados => {
          if (dados != null) {
            console.log(dados);
            this.dataSource2 = new MatTableDataSource(dados);
            this.dataSource2.paginator = this.paginator;
            console.log(this.dataSource2);
          }
        }
      );
  }

  executaAi(mapa: Mapa) {

    console.log('sdasdsa');
    this.userService.getMapaByParan(mapa)
      .subscribe(dados => {
          console.log(dados);
          if (dados != null) {
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

