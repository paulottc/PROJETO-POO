/*Instituto Federal de Ciencia e Tecnologia � IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.�: Francisco Petronio Alencar de Medeiros
Disciplina: Programa��o Orientada a Objeto
Curso: Redes de Computadores
Turno: Manh�                                 Per�odo: 3�

                                          EXERCICIO - 40 % DA 1� NOTA. 
*/

public class Medico {
	private String CRM;
	private String NOME;
	private String ESPECIALIDADE;

	//CONSTRUTORES
	
	public Medico (String nome, String crm, String especialidade){
		this.NOME = nome;
		this.CRM = crm;
		this.ESPECIALIDADE = especialidade;
		
	}
	//M�TODOS
		public String getNome(){
		return NOME;
		}
		public String getCrm(){
		return CRM;	
		}
		public String getEspecialidade(){
		return ESPECIALIDADE;
		}
		
			public void setNome(String nome){
			this.NOME = nome;
			}
			public void setCrm(String crm){
			this.CRM = crm;	
			}
			public void setEspecialidade(String especialidade){
			this.ESPECIALIDADE = especialidade;
			}
			
			public String toString(){
				return ("NOME: " +getNome()+ ",CRM: " +getCrm()+ ",ESPECIALIDADE" +getEspecialidade());	
				}
}
