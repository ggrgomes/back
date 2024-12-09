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
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="Debito")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Debito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private float valor;
	
	@NotNull
	private float desconto;
	
	@NotNull
	private float valor_final;
	
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "id_passe", nullable = false)
	@JsonBackReference
	private Passe passe;

}
