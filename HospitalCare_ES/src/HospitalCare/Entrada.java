package HospitalCare;

import java.util.Date;

public class Entrada {
	private FuncionarioAdministrativo administrativo;
	private Doente doente;
	
	private Date data_hora;
	
	public Entrada(FuncionarioAdministrativo administrativo,Doente doente, Date data_hora) {
		super();
		this.administrativo = administrativo;
		this.doente=doente;
		this.data_hora = data_hora;
	}
	
	public FuncionarioAdministrativo getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(FuncionarioAdministrativo administrativo) {
		this.administrativo = administrativo;
	}

	public Doente getDoente() {
		return doente;
	}

	public void setDoente(Doente doente) {
		this.doente = doente;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}


}
