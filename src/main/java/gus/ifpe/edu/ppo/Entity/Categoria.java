package gus.ifpe.edu.ppo.Entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Categoria {

	ESTUDANTE("Passe estudantil"), NORMAL("Passe comum");

	private String tipo;

	private Categoria(String string) {
		this.tipo = string;

	}

	@JsonValue
	public String getTipo() {
		return tipo;
	}

}
