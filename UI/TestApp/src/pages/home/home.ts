import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { RestProvider } from '../../providers/rest/rest';
import {LoginPage} from '../login/login';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  countries: string[];
  docList: string[];
  errorMessage: string;

  constructor(public navCtrl: NavController, public rest: RestProvider) {}

  ionViewDidLoad() {
    this.getCountries();
    this.getDoclist();
  }

  getCountries() {
    this.rest.getCountries()
       .subscribe(
         countries => this.countries = countries,
         error =>  this.errorMessage = <any>error);
  }

  /**
   * get the list of the docs
   */
  getDoclist() {
   // alert("-getDoclist-");
    this.rest.getDoclist()
       .subscribe(
        docList =>this.docList = docList,
       //docList=> JSON.stringify()
         error =>alert( error+ JSON.stringify(this.docList)));  //this.errorMessage = <any>error);

  }
  /**
   * Get the dash board page
   */
  getLoginPage(){
    this.navCtrl.push(LoginPage);
  }

  /**
   * get the search page
   */
  getCountry(event){

  }
}

