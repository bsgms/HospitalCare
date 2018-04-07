package HospitalCare;

import java.util.Date;

public class PreparacaoMedicacao {
	private Enfermeiro enfermeiro;
	private HorarioToma horariotoma;
	
	private Date data_hora;

	public PreparacaoMedicacao(Enfermeiro enfermeiro, HorarioToma horariotoma, Date data_hora) {
		this.enfermeiro=enfermeiro;
		this.horariotoma=horariotoma;
		this.data_hora=data_hora;
	}
	
	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}

	public HorarioToma getHorariotoma() {
		return horariotoma;
	}

	public void setHorariotoma(HorarioToma horariotoma) {
		this.horariotoma = horariotoma;
	}
	
	
}
