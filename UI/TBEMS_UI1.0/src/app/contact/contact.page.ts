import { Component  } from '@angular/core';
//import { HttpClient } from '@angular/common/http';
//import { Injectable } from '@angular/core';
//import { HttpClient } from '@angular/common/http';
//import { map } from 'rxjs/operators';

@Component({
  selector: 'app-contact',
  templateUrl: 'contact.page.html',
  styleUrls: ['contact.page.scss']
})
//export class ContactPage implements OnInit {
  export class ContactPage{
  public buttonClicked: boolean = false;
  title = 'app';
  restItems: any;
  restItemsUrl = 'http://localhost:8080/tbpms/employee/list';

  // constructor(private http: HttpClient) {

  // }

  // ngOnInit() {
  //   this.getRestItems();
  // }

  // Read all REST Items
  // getRestItems(): void {
  //   alert("getRestItems  is clicked..");
  //   this.restItemsServiceGetRestItems()
  //     .subscribe(
  //       restItems => {
  //         this.restItems = restItems;
  //         console.log(this.restItems);
  //       }
  //     )
  // } 
  
  // Rest Items Service: Read all REST Items
  // restItemsServiceGetRestItems() {
  //   return this.http
  //     .get<any[]>(this.restItemsUrl)
  //     .pipe(map(data => data));
  // }
   /**
   * minimize()  is responsible for getting all the history of the 
   * user maximize
   * @param event 
   */
  minimize(event) {
    alert("minimize  is clicked.."+event);
    //this.buttonClicked = !this.buttonClicked; 
    console.log(event);
   // this.getRestItems();
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

 /**
  * 
  */

    
//  getItems() {
//   this.http.get('http://localhost:8080/tbpms/employee/list');
//   // .pipe(any(data => {})).subscribe(result => {
//   // //  console.log(result);
//   // });
// }
}
