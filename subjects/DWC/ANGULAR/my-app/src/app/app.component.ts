import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Componente1Component } from './Components/componente1/componente1.component';
import { Componente2Component } from './Components/componente2/componente2.component';
import { InterpolationComponent } from './Components/interpolation/interpolation.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Componente1Component, Componente2Component, InterpolationComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-app';
}
