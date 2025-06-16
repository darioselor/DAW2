import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ArticleComponent } from './Component/article/article.component';
import { ArticleTableComponent } from "./Component/article-table/article-table.component";

@Component({
  selector: 'app-root',
  imports: [ArticleComponent, ArticleTableComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'directivas';
}
