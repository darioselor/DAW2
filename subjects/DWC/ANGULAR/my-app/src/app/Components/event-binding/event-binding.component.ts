import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-event-binding',
  imports: [FormsModule],
  templateUrl: './event-binding.component.html',
  styleUrl: './event-binding.component.css'
})
export class EventBindingComponent {
  nombre:String=""
  onSave(){
    alert("Has guardado algo ns");
  }

  cambiarValor(){
    let nuevoNombre:String | null = prompt("Nuevo valor")
    this.nombre = nuevoNombre==null ? this.nombre : nuevoNombre
  }
}
