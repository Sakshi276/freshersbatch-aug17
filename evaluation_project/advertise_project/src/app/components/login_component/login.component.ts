import { Component } from '@angular/core';
import { LoginService } from '../../services/login_service/login.service';
import { Router } from "@angular/router";
 

@Component({
  selector: 'login',
  templateUrl: `./login.html`,
  
})
export class LoginComponent
{
  authToken: any;
  successfullLog: any;
  storeLog: any;
constructor(private loginService:LoginService,private router:Router)
{

}

checkLogin(uName:string , pwd:string ):void{
            this.storeLog = 
                {userName:uName , 
                password:pwd };
                console.log("console")
                 this.loginService.login(this.storeLog).subscribe((data:any)=> { 
                                this.successfullLog=data;
                                console.log('Login: ', this.successfullLog);
                                this.authToken =  this.successfullLog.data['auth-token'];
                       if(this.authToken == null){
                        this.successfullLog = false;
                        alert("Invalid Username or Password!");
                }else{
                    this.successfullLog = true;
                                     alert("Successful Login!");
                                     this.router.navigate(['/loginHome/:authtoken/:username']);

                }  
                this.loginService.setToken(this.authToken);        
                });
               
    }
goBack()
    {
        window.history.back();
    }
}

