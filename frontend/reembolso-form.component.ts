// 3. Frontend - Angular (frontend/src/app/components/reembolso-form/reembolso-form.component.ts)

@Component({
  selector: 'app-reembolso-form',
  templateUrl: './reembolso-form.component.html'
})
export class ReembolsoFormComponent {
  reembolso: any = {};

  constructor(private http: HttpClient) {}

  enviar() {
    this.http.post('/api/reembolsos', this.reembolso)
      .subscribe(resp => alert('Processo iniciado: ' + resp));
  }
}
