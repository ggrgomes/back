package gus.ifpe.edu.ppo.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Carteira")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class CarteiraDeEstudante {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(unique=true)
	@NotBlank
	private String matricula;
	
	@NotNull
	private int ano;
	
    @NotBlank
	private String instituicao;
    
    @OneToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id", nullable = false)
    @JsonBackReference 
	private Usuario usuario;
	
	
}
