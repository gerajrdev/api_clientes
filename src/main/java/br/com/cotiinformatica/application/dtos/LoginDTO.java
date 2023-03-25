package br.com.cotiinformatica.application.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class LoginDTO {
	
	@NotBlank(message = "CPF do cliente é campo obrigatório")
	@Pattern(regexp = "^[0-9]{11}$", message="O nome do cliente deve conter 11 caracteres numericos")
	private String cpf;
	
	@NotBlank(message = "CPF do cliente é campo obrigatório")
	private String senha;
	

}
