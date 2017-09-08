import { Injectable } from '@angular/core';
import { Http, Response,RequestOptions,Headers } from '@angular/http'; 
import 'rxjs/add/operator/map';

@Injectable() 

export class LoginService 
{ 
  
  loginURL:any="http://192.168.3.144:9000/login"
  authtoken:any;
  username:string;

  constructor(private _http: Http)
   {

   } 
   login(credentials:any){
        let header = new Headers({'content-type':'application/json'});
        let option = new RequestOptions({headers:header});
        return this._http.post(this.loginURL,credentials, option).map((response:Response)=>response.json());
    }
    setToken(Token:any)
    {
        this.authtoken=Token;
        console.log("token in setToken is",this.authtoken);
    }

    getToken()
    {
        return this.authtoken;
    }
    postAdvertisement(credentials:any,tkn:any){
          console.log("tkn ",tkn);
        this.loginURL='http://192.168.3.144:9000/postAd';
        let headers = new Headers(); 
             headers.append('auth-token',tkn);
                headers.append('Content-Type', 'application/json');
        let options = new RequestOptions({ headers: headers }); 
           

        return this._http.post(this.loginURL, JSON.stringify(credentials), options) .map((response: Response)=>response.json());

    }
   
    

    



}