package gus.ifpe.edu.ppo.Entity;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="Horario")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Horario {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Temporal(TemporalType.TIME)
	private LocalTime horario;
	
	@NotBlank
	@Enumerated(EnumType.STRING)
	private DiaTipo dia;
	
	@NotBlank
	@Enumerated(EnumType.STRING)
	private TrajetoTipo trajeto;
	
	@ManyToOne
	@JoinColumn(name = "id_linha", nullable = false)
	@JsonBackReference
	private Linha linha;
}
