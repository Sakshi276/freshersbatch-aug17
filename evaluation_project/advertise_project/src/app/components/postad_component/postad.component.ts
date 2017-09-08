import { Component } from '@angular/core';
import { CategoriesService } from '../../services/categories_service/categories.service';
import {LoginService} from '../../services/login_service/login.service'

@Component({
  selector: 'postad',
  templateUrl: `./postad.html`,
})
export class PostAdComponent
{

  
  authToken:any=this.loginService.getToken();
  advertise:any;
  id:any;
  categories:Array<any>=[{}];
  constructor(private myAdService:CategoriesService,private loginService:LoginService)
     {
      myAdService.getCategories().subscribe((data)=> { this.categories=data.data.itemList;
           //this.categories.push(data);
           console.log('Received products: ', this.categories) });
          
     }

   tryPost(title:any,name:any,describe:any,category:any)
  {
      console.log("try post is called")
      let ad_details=
      {
        title:title,
        name:name,
        category:category,
        description:describe

      }
      console.log("token is",this.authToken);
     
      this.loginService.postAdvertisement(ad_details,this.authToken).subscribe((data:any)=> { 
                                this.advertise=data;
                                this.id =  this.advertise.data['id'];
                             console.log('Received products: ', this.advertise); 
                            if(this.id==null){

                            }else{
                              alert("Post Successfully");
                              
                            }
                });

  }

goBack()
    {
        window.history.back();
    }
}