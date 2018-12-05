import { Component, OnInit } from '@angular/core';
import { Quiz } from '../quiz';
import { QUIZZES } from '../mock-quizzes';

@Component({
  selector: 'app-quizzes',
  templateUrl: './quizzes.component.html',
  styleUrls: ['./quizzes.component.css']
})
export class QuizzesComponent implements OnInit {
  selectedQuiz: Quiz;

  quizzes = QUIZZES;

  constructor() { }

  ngOnInit() {
  }

  onSelect(quiz: Quiz): void {
    this.selectedQuiz = quiz;
  }
}
