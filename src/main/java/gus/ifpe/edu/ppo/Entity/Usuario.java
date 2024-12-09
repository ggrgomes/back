package gus.ifpe.edu.ppo.Entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Usuario")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(unique = true)
	@NotNull
	private Long cpf;

	@NotBlank
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@Column(unique = true)
	@NotBlank
	private String email;

	@NotNull
	private int idade;

	@NotBlank
	private String endereco;

	@OneToOne(mappedBy = "usuario")
	@JsonManagedReference
	private Passe passe;

	@OneToOne(mappedBy = "usuario")
	@JsonManagedReference
	private CarteiraDeEstudante carteiraDeEstudante;

	@OneToOne(mappedBy = "usuario")
	@JsonManagedReference
	private Login login;

	@OneToMany(mappedBy = "usuario")
	@JsonIgnore
	private List<Recarga> recargas = new ArrayList<>();
	

}
