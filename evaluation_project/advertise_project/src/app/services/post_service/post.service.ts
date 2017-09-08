import {Injectable} from '@angular/core';
import {Http,Response,RequestOptions,Headers} from '@angular/http';


import 'rxjs/add/operator/map';

@Injectable()


export class PostAdService
{

url:any;
    
    constructor(private _http:Http)
    {

    }
    
}