package HospitalCare;

import java.util.Date;

public class AltaMedica {
	private Medico medico;
	private Entrada entrada;
	
	private Date data_hora;
	
	public AltaMedica(Medico medico,Entrada entrada,Date data_hora)
	{		
		this.medico=medico;
		this.entrada = entrada;
		this.data_hora=data_hora;
	}
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}


	
}
