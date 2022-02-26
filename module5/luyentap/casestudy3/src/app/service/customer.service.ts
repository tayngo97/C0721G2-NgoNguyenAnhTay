import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {environment} from 'src/environments/environment';
import {Customer} from '../model/customer';

const API_URL = `${environment.apiUrl}`;


@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private urlApi = environment.apiUrl1;


  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(`${this.urlApi}/customer/all`);
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(`${this.urlApi}/customer/add`, customer);
  }

  findById(id: number): Observable<Customer> {
    return this.http.get<Customer>(`${this.urlApi}/customer/find/${id}`);
  }

  searchByKeyWord(keyword: string): Observable<Customer[]> {
    return this.http.get<Customer[]>(`${this.urlApi}/customer/search/${keyword}`);
  }

  deleteCustomer(id: number): Observable<Customer> {
    return this.http.delete<Customer>(`${this.urlApi}/customer/delete/${id}`);
  }

  updateCustomer(customer: Customer, id: number): Observable<Customer> {
    return this.http.put<Customer>(`${this.urlApi}/customer/update/${id}`, customer);
  }
}
