import { Injectable } from '@angular/core';
import { Http, Response,RequestOptions,Headers } from '@angular/http'; 
import 'rxjs/add/operator/map';


@Injectable() 

export class CategoriesService 
{ 
  constructor(private _http: Http)
   {

   } 

  getCategories() 
  { 
    return this._http.get("http://192.168.3.144:9000/categories"). map((response: Response)=>response.json());  
  }

  getAllAdvertises()
  {
    let url = "http://192.168.3.144:9000/posts/search";   
        let headers = new Headers();
       
        headers.append('Content-Type', 'application/json');
        let options = new RequestOptions({headers:headers});
        return this._http.get(url, options).
            map((response: Response) => response.json());
  }
  
  
}
