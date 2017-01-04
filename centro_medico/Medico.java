/*Instituto Federal de Ciencia e Tecnologia – IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.º: Francisco Petronio Alencar de Medeiros
Disciplina: Programação Orientada a Objeto
Curso: Redes de Computadores
Turno: Manhã                                 Período: 3º

                                          EXERCICIO - 40 % DA 1ª NOTA. 
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
	//MÉTODOS
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
