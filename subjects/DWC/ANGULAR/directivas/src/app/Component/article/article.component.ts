import { Component } from '@angular/core';
import { ARTICULOS } from '../../Modules/articulo/articulo';

@Component({
  selector: 'app-article',
  imports: [],
  templateUrl: './article.component.html',
  styleUrl: './article.component.css'
})
export class ArticleComponent {
  Articulos = ARTICULOS;
}
