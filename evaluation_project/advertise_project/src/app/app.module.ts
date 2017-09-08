import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent }  from './app.component';
import {HomeComponent} from './components/home_component/home.component'
import {LoginComponent} from './components/login_component/login.component'
import {SignupComponent} from './components/register_component/register.component'
import {PostAdComponent} from './components/postad_component/postad.component'
import { RouterModule } from '@angular/router'; 
import { FormsModule}  from '@angular/forms';
import { HttpModule } from '@angular/http'; 
import {LoggedInUserComponent} from './components/loggedinuser_component/loggedinuser.component'



@NgModule({
  imports:      [ BrowserModule,FormsModule, HttpModule ,
                  RouterModule.forRoot([ {path: '', component: HomeComponent}, {path: 'login', component: LoginComponent},
                  {path: 'loginHome/:authtoken/:username', component: LoggedInUserComponent},
                  {path: 'register', component: SignupComponent},
                  {path: 'postad', component: PostAdComponent},
                  {path: 'home', component: HomeComponent} ])
                 ],
  declarations: [ AppComponent,HomeComponent,LoginComponent,SignupComponent,PostAdComponent,LoggedInUserComponent,
                  ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
