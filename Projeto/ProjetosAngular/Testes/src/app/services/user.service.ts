import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Mapa} from '../models/user.model';


@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private http: HttpClient) {
  }

  public getMapaByName(numeroMapa: string) {
    return this.http.get<Mapa[]>('http://localhost:8888/api/mapas/numeroMapa/' + numeroMapa);
  }

  public getMapaByParan(mapa: Mapa) {

    return this.http.post<Mapa[]>('http://localhost:8888/api/mapas/parans', mapa);
  }
}
