import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router'; 

@Component({
  selector: 'loggedinuser',
  templateUrl: `./loggedinuser.html`,
})
export class LoggedInUserComponent
{
Username:any;
Authtoken:any;
constructor(private activatedRoute: ActivatedRoute) {}

ngOnInit() 
{ 
    this.Username = this.activatedRoute.snapshot.params['username']; 
    this.Authtoken = this.activatedRoute.snapshot.params['authtoken'];
    console.log("username: ",this.Authtoken) ;
}

}