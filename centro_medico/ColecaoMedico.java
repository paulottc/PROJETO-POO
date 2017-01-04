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


public class ColecaoMedico {

	List<Medico> colecao_medico = new ArrayList<Medico>();
	
	public boolean cadastrarmedico (String nome, String crm, String especialiade){
		if((nome != null && crm != null) && (especialiade != null)){

			colecao_medico.add(new Medico(nome,crm,especialiade));
			System.out.println("\n");
			System.out.println("Medico adicionado com sucesso!");
			return true;
	      }
	      return false;
	}
	

	public boolean pesquisa_por_crm(String crm){
		for (int i = 0; i <colecao_medico.size(); i++) {
			Medico m  = colecao_medico.get(i);
	         if (m.getCrm().equals(crm)) {
	        	 System.out.println("\n");
	        	 System.out.println("Nome: "+m.getNome());
	        	 System.out.println("Crm: "+m.getCrm());
	        	 System.out.println("Crm: "+m.getEspecialidade());
	            return true;
	         }
		}
		System.out.println("\n");
		System.out.println("Medico não encontrado!");
		return false;
	}
	
	public Medico pesquisa_por_crm_m(String crm_m){
		for (int i = 0; i <colecao_medico.size(); i++) {
			Medico m = colecao_medico.get(i);
	         if (m.getCrm().equals(crm_m)) {
	        	   String nome_m =  m.getNome();
	        	   String crm = m.getCrm();
	        	   String especialidade = m.getEspecialidade();
		 			
	        	   Medico z = new Medico (nome_m,crm,especialidade);
		 			return (z);
	         }
		}
		return null;
	}
	public void exibir_colecao_medico(){
		for (int cont = 0; cont < colecao_medico.size(); cont++) {
			Medico m = colecao_medico.get(cont);
			System.out.println("\n");
			System.out.println("NOME: " +m.getNome());
			System.out.println("CRM: "+m.getCrm());
			System.out.println("ESPECIALIDADE: "+m.getEspecialidade());
			System.out.println("\n");
		  }
	}
}

