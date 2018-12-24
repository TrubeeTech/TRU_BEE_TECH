import { Component } from '@angular/core';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-contact',
  templateUrl: 'contact.page.html',
  styleUrls: ['contact.page.scss']
})
export class ContactPage {
  public buttonClicked: boolean = false;

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
  this.buttonClicked = !this.buttonClicked; 
 }

/**
 * 
 * 
 */
getDocList(event){
 
 }

}
