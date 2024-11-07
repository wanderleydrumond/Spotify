import {Component, inject, OnInit} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FaIconLibrary, FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {RouterOutlet} from '@angular/router';
import {fontAwesomeIcons} from "./shared/font-awesome-icons";
import {faPlayCircle} from "@fortawesome/free-solid-svg-icons";

@Component({
    selector: 'app-root',
    standalone: true,
    imports: [CommonModule, RouterOutlet, FontAwesomeModule],
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
    title = 'frontend';
    private faIconLibrary = inject(FaIconLibrary);

    ngOnInit(): void {
        this.initFontAwesome();
    }

    private initFontAwesome() {
        this.faIconLibrary.addIcons(...fontAwesomeIcons);
    }

    protected readonly faPlayCircle = faPlayCircle;
}
