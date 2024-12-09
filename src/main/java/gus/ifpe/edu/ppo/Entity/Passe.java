package gus.ifpe.edu.ppo.Entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "Passe")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Passe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	@NotBlank
	private String codigo;

	@NotNull
	private float saldo;

	@Temporal(TemporalType.DATE)
	@NotNull
	private Date validade;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	@OneToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
	@JsonBackReference
	private Usuario usuario;

	@OneToMany(mappedBy = "passe", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Recarga> recargas = new ArrayList<>();
	
	@OneToMany(mappedBy = "passe", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Debito> debitos = new ArrayList<>();

}
