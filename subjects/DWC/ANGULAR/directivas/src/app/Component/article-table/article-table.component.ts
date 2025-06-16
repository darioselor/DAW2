import { Component, input } from '@angular/core';
import { Articulo, ARTICULOS } from '../../Modules/articulo/articulo';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-article-table',
  imports: [FormsModule],
  templateUrl: './article-table.component.html',
  styleUrl: './article-table.component.css'
})

export class ArticleTableComponent {
  
  articulos: Array<Articulo> = ARTICULOS;
  criterio: String = "todos";
    
  actualizarArticulos(){
    if (this.criterio === "todos") {
      this.articulos = ARTICULOS;
    } else {
      this.articulos = ARTICULOS.filter(a => a.categoria === this.criterio)
    }
  }
}
