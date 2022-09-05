import {Component, OnInit} from '@angular/core';
import {HelloWorld, HelloworldService} from "./service/helloworld.service";
import {Observable} from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public helloWorld$?: Observable<HelloWorld>;

  constructor(private readonly helloworldService: HelloworldService) {
  }

  ngOnInit() {
    this.helloWorld$ = this.helloworldService.getHelloWorld()
  }
}
