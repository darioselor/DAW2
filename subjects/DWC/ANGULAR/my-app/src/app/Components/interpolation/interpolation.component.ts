import { Component } from '@angular/core';
import { PropertyBindingComponent } from '../property-binding/property-binding.component';

@Component({
  selector: 'app-interpolation',
  imports: [PropertyBindingComponent],
  templateUrl: './interpolation.component.html',
  styleUrl: './interpolation.component.css'
})
export class InterpolationComponent {

  titulo:String="Data Binding"
}
