import {Injectable} from '@angular/core';
import {Http,Response,RequestOptions,Headers} from '@angular/http';


import 'rxjs/add/operator/map';

@Injectable()

export class RegisterService
{


    
    constructor(private _http:Http)
    {

    }
 
 
 registerUser(newUser: any) {

        let url = "http://192.168.3.144:9000/register";
        let jsonReq = newUser;
        
        let Regobject = this._http.post(url, jsonReq).
            map((response: Response) => response.json());
        Regobject.subscribe((data) => console.log("Registered User is:", data));

    }
}