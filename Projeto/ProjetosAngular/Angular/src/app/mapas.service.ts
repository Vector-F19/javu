import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MapasService {

  mapasUrl = 'http://localhost:8888/api/produtos';

  constructor(private http: HttpClient) { }

listar(){
  return this.http.get<any[]>(`${this.mapasUrl}`);
  }
}
