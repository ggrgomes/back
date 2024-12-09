package gus.ifpe.edu.ppo.Entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Linha")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Linha {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique=true)
	private String nome;
	
	@NotBlank
	private String origem;
	
	@NotBlank
	private String destino;
	
	@OneToMany(mappedBy = "horario", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Horario> horarios = new ArrayList<>();
}
