package br.com.cotiinformatica.application.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class RecuperarSenhaDTO {
	
	@NotBlank(message="O email do cliente é campo obrigatório.")
	@Email(message = "Email informado está em formato inválido")
	private String email;

}
