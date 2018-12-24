import { Component } from '@angular/core';
import { NgModule } from '@angular/core';
import { App, NavController } from '@ionic/angular';


@Component({
  selector: 'app-about',
  templateUrl: 'about.page.html',
  styleUrls: ['about.page.scss']
})
export class AboutPage {
  btnName: string ='History';
 testArray: any= [
  {
    "doctor": "Mahesh",
    "insurance_id": "Chathurangi",
    "diagnosis": "fever",
    "start_date": "10/11/18",
    "end_date": "10/11/18",
    "status": "cured",
    "action": "edit /delete/ view"
  },
  {
    "doctor": "Mahesh",
    "insurance_id": "Chathurangi",
    "diagnosis": "fever",
    "start_date": "10/11/18",
    "end_date": "10/11/18",
    "status": "cured",
    "action": "edit /delete/ view"
  }
 ];
  
  /**
   * getHistory()  is responsible for getting all the history of the 
   * user
   * @param event 
   */
  getHistory(event) { 
    alert("getHistoryButton  is clicked.."+event);
    
    console.log(event);
 }
 
/**
 * 
 * @param event 
 */
 getMail(event){
  alert("getMail  is clicked.."+event);
  console.log(event);
 }

 /**
  * 
  * @param event 
  */
 getSchedule(event){
  alert("getSchedule  is clicked.."+event);
 }
 ngOnInit(){
   
 }
}
