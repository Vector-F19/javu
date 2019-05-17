import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material';

@Component({
  selector: 'dialog-content-example-dialog',
  templateUrl: 'dialog-content-example-dialog.html',
})
export class DialogContentExampleDialog implements OnInit {

  dadosModal;

  ngOnInit() {
  }


  constructor(private dialogRef: MatDialogRef<DialogContentExampleDialog>,
              @Inject(MAT_DIALOG_DATA) data) {

    this.dadosModal = data;

  }

  /*  onCloseConfirm() {
      this.thisDialogRef.close('Confirm');
    }

    onCloseCancel() {
      this.thisDialogRef.close('Cancel');
    }*/
}


