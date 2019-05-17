import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent, } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { UsertableComponent } from './components/usertable/usertable.component';


import { HttpClientModule } from '@angular/common/http';
import{ MatInputModule,MatProgressSpinnerModule,MatSortModule,
MatPaginatorModule,MatTableModule }from '@angular/material';
import { DialogContentExampleDialog } from './components/usertable/DialogContentExampleDialog';

import { UserService } from './services/user.service';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatDialogModule} from '@angular/material/dialog';
import {FormsModule} from '@angular/forms';




@NgModule({
  declarations: [
    AppComponent,
    UsertableComponent,
    DialogContentExampleDialog
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatTableModule,
    HttpClientModule,
    MatPaginatorModule,
    MatInputModule,
    MatProgressSpinnerModule,
    MatSortModule,
    MatFormFieldModule,
    MatSelectModule,
    MatButtonModule,
    MatToolbarModule,
    MatDialogModule,
    FormsModule
  ],
  providers: [UserService],
  entryComponents:[DialogContentExampleDialog],
  bootstrap: [AppComponent]
})
export class AppModule { }
