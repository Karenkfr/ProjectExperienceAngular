import { Component, OnInit } from '@angular/core';
import { Cliente } from '../clientes';
import { ClientesService } from 'src/app/clientes.service';

@Component({
  selector: 'app-clientes-form',
  templateUrl: './clientes-form.component.html',
  styleUrls: ['./clientes-form.component.css']
})
export class ClientesFormComponent implements OnInit {

  cliente: Cliente;

  constructor( private service: ClientesService ) {
    this.cliente = service.getCliente();
   }

  ngOnInit() {
  }

  onSubmit(){
    console.log(this.cliente);
  }

}
