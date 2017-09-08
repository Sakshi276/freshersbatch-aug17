import { Component} from '@angular/core';
import { RouterModule, Router } from '@angular/router';
import { RegisterService } from '../../services/register_service/register.service'
@Component({
    selector: 'register',
    templateUrl: './register.html'
    
})

export class SignupComponent
{
     constructor( private router: Router, private signloginservice:RegisterService  )
    {}
    insertSignupInfo(firstNameValue: any, lastNameValue: any, userNameValue:any,passwordValue:any,cpasswordValue: any, emailValue: any, phoneValue: any) 
    {
        let sendRegistDetails={
        firstName: firstNameValue,
        lastName: lastNameValue,
        userName: userNameValue,
        password: passwordValue,
    
        email: emailValue,
        phone: phoneValue
    }
    let confpassword=cpasswordValue;
     let password=passwordValue;
     if(password===confpassword) 
        { 
            this.signloginservice.registerUser(sendRegistDetails);
             alert("Registration Successful!");
             this.router.navigate(['/login']);
        }
        else{
            alert("Passwords don't match. Please enter again!");
        }

}

    goBack()
    {
        window.history.back();
    }
}