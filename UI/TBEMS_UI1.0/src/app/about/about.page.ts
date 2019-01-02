import { Component } from '@angular/core';
import {Observable} from 'rxjs';
import 'rxjs/Rx';
import 'rxjs/add/operator/map';

import { Http, Response, RequestOptions, Headers } from "@angular/http";

@Component({
  selector: 'app-about',
  templateUrl: 'about.page.html',
  styleUrls: ['about.page.scss']
})
export class AboutPage {

    constructor(private http: Http) {
    }
  
    getItems() {
        this.http.get('http://localhost:8080/tbpms/employee/list');
        // .pipe(any(data => {})).subscribe(result => {
        // //  console.log(result);
        // });
    }

    
   /**
   * minimize()  is responsible for getting all the history of the 
   * user maximize
   * @param event 
   */
  minimize(event) {
    alert("minimize  is clicked.."+event);
    //this.buttonClicked = !this.buttonClicked; 
    alert("minimize  event ends.."+event);
    console.log(event);
 }
 getHistory(event){
 
 }
    /**
   * minimize()  is responsible for getting all the history of the 
   * user 
   * @param event 
   */
  maximize(event) { 
    alert("maximize  is clicked.."+event);
    alert(this);
    console.log(event);
 }

 /**
  * 
  */
 toggleChatSpace(event){
  //this.buttonClicked = !this.buttonClicked; 
 }

/**
 * 
 * 
 */
getDocList(event){
 
 }
  
}
