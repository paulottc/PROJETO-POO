/*Instituto Federal de Ciencia e Tecnologia – IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.º: Francisco Petronio Alencar de Medeiros
Disciplina: Programação Orientada a Objeto
Curso: Redes de Computadores
Turno: Manhã                                 Período: 3º

                                          EXERCICIO - 40 % DA 1ª NOTA. 
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;




public class ColecaoPacientes {
	
   
	List<Paciente> colecao_paciente = new ArrayList<Paciente>();
    
   
	public boolean cadastrarpaciente (String nome, String documento, String sexo, Endereco endereço, String nascimento){
		if((nome != null && documento != null) && (sexo != null && endereço != null) && nascimento != null){

			colecao_paciente.add(new Paciente(nome,documento,sexo,endereço,nascimento));
			 System.out.println("\n");
			 System.out.println("Paciente adicionado com sucesso!");
			return true;
	      }
		
	      return false;
	}
	
	public boolean pesquisa_por_cpf(String Documento){
		for (int i = 0; i <colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
	         if (p.getDocumento().equals(Documento)) {
	        	    System.out.println("NOME: " +p.getNome());
		 			System.out.println("CPF: "+p.getDocumento());
		 			System.out.println("SEXO: "+p.getSexo());
		 			System.out.println("DATA DE NASCIMENTO:: "+p.getNascimento());
		 			System.out.println("RUA: "+p.getEndereco().getRua());
		 			System.out.println("CEP: "+p.getEndereco().getCep());
		 			System.out.println("BAIRRO: "+p.getEndereco().getBairro());
		 			System.out.println("COMPLEMENTO: "+p.getEndereco().getComplemento());
	        	 return true;
	         }
		}
		System.out.println("\n");
		System.out.println("Paciente não encontrado!");
		return false;
	}
	public void quantidade_paciente_sexo_masculino(){
		int cont = 0;
		for (int i = 0; i <colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
			if ((p.getSexo().equals("MASCULINO")) || (p.getSexo().equals("masculino"))) {
	        	 cont = cont +1;
	         }
		}	
		System.out.println(cont);
	}
	public void quantidade_paciente_sexo_feminino(){
		int cont = 0;
		for (int i = 0; i <colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
	         if ((p.getSexo().equals("FEMININO")) || (p.getSexo().equals("feminino"))) {
	        	cont = cont +1;
	         }
		}
		System.out.println(cont);
	}
	public void remover_pelo_documento(String documto){
		for (int i = 0; i <colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
	         if (p.getDocumento().equals(documto)) {
	        	 colecao_paciente.remove(p);
	        	 System.out.println("\n");
	        	 System.out.println("Paciente removido com sucesso!");
	         }
		}
	}
	public void exibir_colecao(){
		for (int i = 0; i < colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
			System.out.println("\n");
			System.out.println("NOME: " +p.getNome());
			System.out.println("CPF: "+p.getDocumento());
			System.out.println("SEXO: "+p.getSexo());
			System.out.println("DATA DE NASCIMENTO: "+p.getNascimento());
			System.out.println("RUA: "+p.getEndereco().getRua());
			System.out.println("CEP: "+p.getEndereco().getCep());
			System.out.println("BAIRRO: "+p.getEndereco().getBairro());
			System.out.println("COMPLEMENTO: "+p.getEndereco().getComplemento());
			System.out.println("\n");
		  }
	}
	public Paciente pesquisa_por_cpf_paciente(String documento){
		for (int i = 0; i <colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
	         if (p.getDocumento().equals(documento)) {
	        	   String nome_p =  p.getNome();
	        	   String cpf =p.getDocumento();
	        	   String sexo =p.getSexo();
	        	   String nascimento =p.getNascimento();
		 			String rua =p.getEndereco().getRua();
		 			String cep =p.getEndereco().getCep();
		 			String bairro = p.getEndereco().getBairro();
		 			String complemento = p.getEndereco().getComplemento();
		 			Endereco y = new Endereco(cep,rua,bairro,complemento);
		 	        Paciente x =  new Paciente(nome_p,cpf,sexo,y,nascimento);
		 			return (x);
	         }
		}
		return null;
	}
	public void maior_de_60(){
			for (int i = 0; i < colecao_paciente.size(); i++) {
			Paciente p = colecao_paciente.get(i);
			String data = p.getNascimento();
			int idade = p.idade(data);
			if ( idade > 60){
			System.out.println("\n");
			System.out.println("NOME: " +p.getNome());
			System.out.println("CPF: "+p.getDocumento());
			System.out.println("SEXO: "+p.getSexo());
			System.out.println("DATA DE NASCIMENTO: "+p.getNascimento());
			System.out.println("RUA: "+p.getEndereco().getRua());
			System.out.println("CEP: "+p.getEndereco().getCep());
			System.out.println("BAIRRO: "+p.getEndereco().getBairro());
			System.out.println("COMPLEMENTO: "+p.getEndereco().getComplemento());
			System.out.println("\n");
			}
		  }
	}
}
	


