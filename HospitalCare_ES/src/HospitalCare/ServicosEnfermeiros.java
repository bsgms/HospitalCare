package HospitalCare;

import java.util.Date;

public class ServicosEnfermeiros {
	private Enfermeiro enfermeiro;
	private FuncionarioAdministrativo administrativo;
	
	private Date data_hora_inicio;
	private Date data_hora_fim;
	
	public ServicosEnfermeiros(Enfermeiro enfermeiro, FuncionarioAdministrativo administrativo, Date data_hora_inicio, Date data_hora_fim ) {
		this.enfermeiro=enfermeiro;
		this.administrativo=administrativo;
		this.data_hora_inicio=data_hora_inicio;
		this.data_hora_fim=data_hora_fim;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public FuncionarioAdministrativo getAdministrativo() {
		return administrativo;
	}

	public void setAdministrativo(FuncionarioAdministrativo administrativo) {
		this.administrativo = administrativo;
	}

	public Date getData_hora_inicio() {
		return data_hora_inicio;
	}

	public void setData_hora_inicio(Date data_hora_inicio) {
		this.data_hora_inicio = data_hora_inicio;
	}

	public Date getData_hora_fim() {
		return data_hora_fim;
	}

	public void setData_hora_fim(Date data_hora_fim) {
		this.data_hora_fim = data_hora_fim;
	}


	
}
