import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EntitiesComponent } from './entities/entities.component';
import { EntitiesAddComponent } from './entities/entities-add/entities-add.component';
import { EntitiesListComponent } from './entities/entities-list/entities-list.component';

@NgModule({
  declarations: [
    AppComponent,
    EntitiesComponent,
    EntitiesAddComponent,
    EntitiesListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
