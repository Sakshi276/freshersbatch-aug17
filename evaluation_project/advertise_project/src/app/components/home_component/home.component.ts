import { Component } from '@angular/core';
import { CategoriesService } from '../../services/categories_service/categories.service';

@Component({
  selector: 'home',
  templateUrl: `./home.html`,
})
export class HomeComponent
{
  advertisements:Array<any>=[{}];
constructor(private myAdService:CategoriesService)
     {
      myAdService.getAllAdvertises().subscribe((response:any)=>{
      console.log(response);
     response.data.advertiseList.forEach((ad:any)=>{
      this.advertisements.push({"title":ad.title,"username":ad.name,"data":ad.createdDate,"category":ad.category,"description":ad.description});
  });
});
}

          
     }
