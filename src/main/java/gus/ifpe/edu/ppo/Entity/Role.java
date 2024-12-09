package gus.ifpe.edu.ppo.Entity;

public enum Role {
	
	ADMIN("administrador"),
	COMUM("usuário");
	
	private String descricao;

	Role(String string) {
		this.descricao = string;
	}

	public String getDescricao() {
		return descricao;
	}

}
