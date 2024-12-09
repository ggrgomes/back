package gus.ifpe.edu.ppo.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Recarga")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Recarga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private float valor;

	@Temporal(TemporalType.DATE)
	@NotBlank
	private Date data;

	@NotBlank
	private String tipo;

	@ManyToOne
	@JoinColumn(name = "id_passe", nullable = false)
	@JsonBackReference
	private Passe passe;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	@JsonBackReference
	private Usuario usuario;
}
