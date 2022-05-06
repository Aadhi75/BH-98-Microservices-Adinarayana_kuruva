import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from 'src/model/student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private studentsUrl : string;

  constructor(private http: HttpClient) {
    this.studentsUrl = 'http://localhost:8080/allstudents'
   }
   
   public findAll():Observable<Student[]>{
	return this.http.get<Student[]>(this.studentsUrl);
}
}
