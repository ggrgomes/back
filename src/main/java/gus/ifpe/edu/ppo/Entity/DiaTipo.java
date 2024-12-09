package gus.ifpe.edu.ppo.Entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DiaTipo {

	DIAS_UTEIS("Dias úteis"), SABADOS("Sábados"), DOMINGOS_E_FERIADOS("Domingos e feriados");

	private String dia;

	private DiaTipo(String string) {
		this.dia = string;
	}

	@JsonValue
	public String getDia() {
		return dia;
	}

}
