package org.aplicacao;

import java.io.IOException;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;



public class Main {

	public static void main(String[] args, String cep ) throws IOException, InterruptedException {
		
			ApiServico apiServico = new ApiServico();
			cep = "03107040";
			try {
				EnderecoDto enderecoDto = apiServico.getEndereco(cep);
				System.out.println(enderecoDto.getlogradouro());
				
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
					
	}
	

}
