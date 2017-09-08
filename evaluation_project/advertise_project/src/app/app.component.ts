import { Component } from '@angular/core';
import { CategoriesService } from './services/categories_service/categories.service';
import { LoginService } from './services/login_service/login.service';
import {RegisterService} from './services/register_service/register.service'
import {PostAdService} from './services/post_service/post.service'
import {LogOutService} from './services/logout_service/logout.service'

@Component({
  selector: 'my-app',
  template: `<router-outlet></router-outlet>`,
  providers: [CategoriesService,LoginService,RegisterService,PostAdService,LogOutService]
})
export class AppComponent  { 

 }
