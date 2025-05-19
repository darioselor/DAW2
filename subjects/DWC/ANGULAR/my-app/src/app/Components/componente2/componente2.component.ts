import { Component } from '@angular/core';

@Component({
  selector: 'app-componente2',
  imports: [],
  templateUrl: './componente2.component.html',
  styleUrl: './componente2.component.css'
})
export class Componente2Component {
  constructor(){
    console.log("Se ejecuta el constructor");
  }
  ngOnInit(){
    console.log("Se ejecuta ngOnInit");
  }
}
