import { HttpClientModule } from '@angular/common/http'
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MapasListagemComponent } from './mapas-listagem/mapas-listagem.component';
import {MapasService } from './mapas.service';


@NgModule({
  declarations: [
    AppComponent,
    MapasListagemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [MapasService],
  bootstrap: [AppComponent]
})
export class AppModule { }
