import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class HelloworldService {

  constructor(private httpClient: HttpClient) {

  }

  public getHelloWorld(): Observable<HelloWorld>{
    return this.httpClient.get<HelloWorld>("api/helloworld");
  }
}

export interface HelloWorld {
  id: string;
  name: string;
}
