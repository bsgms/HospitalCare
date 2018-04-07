package HospitalCare;

import java.util.ArrayList;
import java.util.Date;

public class Prescricao {
	private Medico medico;
	private Doente doente;
	private Medicamento medicamento;
	private ArrayList<HorarioToma> horarioToma;
	
	private Date data;
	
	public Prescricao() {
		horarioToma = new ArrayList<HorarioToma>();
	}
	public Prescricao(Medico medico, Doente doente, Medicamento medicamento, ArrayList<HorarioToma> horarioToma,Date data ) {
		this.medico=medico;
		this.doente=doente;
		this.medicamento=medicamento;
		this.horarioToma= horarioToma;
		this.data=data;
	}
	

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Doente getDoente() {
		return doente;
	}

	public void setDoente(Doente doente) {
		this.doente = doente;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public ArrayList<HorarioToma> getHorariotoma() {
		return horarioToma;
	}

	public void setHorariotoma(ArrayList<HorarioToma> horariotoma) {
		this.horarioToma = horariotoma;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
