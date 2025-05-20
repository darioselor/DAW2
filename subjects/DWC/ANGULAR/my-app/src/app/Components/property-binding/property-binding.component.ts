import { Component } from '@angular/core';
import { EventBindingComponent } from '../event-binding/event-binding.component';

@Component({
  selector: 'app-property-binding',
  imports: [EventBindingComponent],
  templateUrl: './property-binding.component.html',
  styleUrl: './property-binding.component.css'
})
export class PropertyBindingComponent {

  titulo:String = "Data Binding"
  imagen:String = "imgs/370z.jpeg"
  desactivado:boolean = false

  ngOnInit(){
    setTimeout(() => {
      console.log("Desactivamos el boton...");
      this.desactivado = true}, 5000)
  }
}
