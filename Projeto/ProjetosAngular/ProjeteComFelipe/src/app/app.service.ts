import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  mapasUrl = 'http://localhost:8888/api/produtos';

  constructor(private http: HttpClient) { }

listar(){
    console.log('Service');
  return this.http.get<any[]>(`${this.mapasUrl}`);
  }
  gato(){
    console.log('Service');
    return 'gato'
};
}
