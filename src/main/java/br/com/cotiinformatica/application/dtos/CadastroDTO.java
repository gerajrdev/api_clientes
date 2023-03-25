package br.com.cotiinformatica.application.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CadastroDTO {
	
	@NotBlank(message = "O nome do cliente é obrigatório")
	@Size(min=8, max=150, message="O nome do cliente deve conter de 8 à 150 caracteres")
	private String nome;
	
	@NotBlank(message = "O telefone do cliente é obrigatório")
	@Pattern(regexp = "^[0-9]{11}$", message="O nome do cliente deve conter 11 caracteres numericos")
	private String telefone;
	
	@NotBlank(message = "Email do cliente é obrigatório")
	@Email(message = "Email do cliente está em um formato inválido" )
	private String email;
	
	@NotBlank(message = "Cpf do cliente é obrigatório")
	@Size(min=11, max=11, message="O nome do cliente deve conter 11 caracteres")
	private String cpf;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,}$",
			message = "A senha deve ter pelo menos 8 caracteres, uma letra maiúscula, uma letra minúscula, um número e um caractere especial")
	@NotBlank(message = "Senha do usuário é obrigatória.")
	private String senha;


}
