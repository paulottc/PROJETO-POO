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


public class ColecaoConsultas {
 List<Consulta> colecao_consultas = new ArrayList<Consulta>();

 public boolean cadastrar_consulta(Paciente paciente, Medico medico, String data, String hora){
		if((paciente != null && medico != null) && (data != null && hora != null)){

			colecao_consultas.add(new Consulta(paciente,medico,data,hora));
			System.out.println("\n");
			System.out.println("Consulta adicionada com sucesso!");
			return true;
	      }
	      return false;
	}
 public void quantidade_de_consultas_por_data(String data){
	 int x=0;
	 for (int cont = 0; cont < colecao_consultas.size(); cont++){
		 Consulta c = colecao_consultas.get(cont);
		 if(c.getData().equals(data)){
			 x = x +1;
		 }
	 }
	 System.out.print("\n");
	 System.out.print("O número de cosultas marcadas para o dia: "+data);
	 System.out.print("\n");
     System.out.print(x);
 }
 public void exibir_consultas(){
	 for(int cont= 0; cont < colecao_consultas.size(); cont++){
		 Consulta c = colecao_consultas.get(cont);
		 System.out.print ("\n");
		 System.out.println("Nome do paciente:"+c.getPaciente().getNome());
		 System.out.println("Nome do medico:"+c.getMedico().getNome());
		 System.out.println("Data:"+c.getData());
		 System.out.println("Hora:"+c.getHora());
		 System.out.print ("\n");
	 }
 }
 public void quantidade_de_consultas_por_Medico(String nome_medico){
	 int x=0;
	 for (int cont = 0; cont < colecao_consultas.size(); cont++){
		 Consulta c = colecao_consultas.get(cont);
		 if(c.getMedico().getNome().equals(nome_medico)){
			 x = x +1;
		 }
	 }
	 System.out.print("\n");
	 System.out.print("O número de cosultas marcadas para o médico: "+nome_medico);
	 System.out.print("\n");
     System.out.print(x);
 }

 public void quantidade_de_consultas_por_paciente(String nome_paciente){
	 int z=0;
	 for (int cont = 0; cont < colecao_consultas.size(); cont++){
		 Consulta c = colecao_consultas.get(cont);
		 if(c.getPaciente().getNome().equals(nome_paciente)){
			 z = z +1;
		 }
	 }
	 System.out.print("\n");
	 System.out.print("O número de cosultas marcadas para o paciente: "+nome_paciente);
	 System.out.print("\n");
	 System.out.print(z);
 }
 
}
