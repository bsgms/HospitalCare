package HospitalCare;

public class EstadoDoente {
	private Entrada entrada;
	private Enfermeiro enfermeiro;
	private Medico medico;
	
	private String estado;

	public EstadoDoente(Entrada entrada,Medico medico ,String estado)
	{
		this.entrada = entrada;
		this.medico=medico;
		this.estado=estado;
	}
	
	
	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}
