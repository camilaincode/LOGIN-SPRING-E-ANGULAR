import { Component } from '@angular/core';
import { LoginFormComponent } from "../login-form/login-form.component";
import { AxiosService } from '../axios.service';

@Component({
  selector: 'app-content',
  standalone: true,
  imports: [ LoginFormComponent],
  templateUrl: './content.component.html',
  styleUrl: './content.component.css'
})
export class ContentComponent {

  constructor(private axiosService: AxiosService) { }

  onLogin(input:any):void{
    this.axiosService.request("POST","/login",{login:input.login,password:input.password})
  }

}
