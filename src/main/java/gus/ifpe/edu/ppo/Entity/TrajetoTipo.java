package gus.ifpe.edu.ppo.Entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TrajetoTipo {
	
	BAIRRO_CENTRO("Bairro para o centro"),
	CENTRO_BAIRRO("Centro para o bairro");
	
	private String descricao;

	private TrajetoTipo(String string) {
		this.descricao = string;
	}

	@JsonValue
	public String getDescricao() {
		return descricao;
	}

}
