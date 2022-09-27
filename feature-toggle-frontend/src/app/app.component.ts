import {Component, OnInit} from '@angular/core';
import {HelloWorld, HelloworldService} from "./service/helloworld.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  private helloWorld?: HelloWorld;
  private name: string = '';

  constructor(private readonly helloWorldService: HelloworldService) {
  }

  public ngOnInit() {
    this.helloWorldService.getHelloWorld().subscribe(value => this.helloWorld = value);
  }

  public onInput(event: Event) {
    this.name = (event.target as HTMLSdxInputElement).value
  }

  public get text(): string {
    return `${this.helloWorld?.name} ${this.name}`
  }
}
