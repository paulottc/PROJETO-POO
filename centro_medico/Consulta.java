/*Instituto Federal de Ciencia e Tecnologia – IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.º: Francisco Petronio Alencar de Medeiros
Disciplina: Programação Orientada a Objeto
Curso: Redes de Computadores
Turno: Manhã                                 Período: 3º

                                          EXERCICIO - 40 % DA 1ª NOTA. 
*/

public class Consulta {
	private Paciente PACIENTE;
	private Medico MEDICO;
	private String DATA;
	private String HORA;
	

	//CONSTRUTORES
	
	public Consulta (Paciente paciente, Medico medico, String data, String hora){
		this.PACIENTE = paciente;
		this.MEDICO = medico;
		this.DATA = data;
		this.HORA = hora;
		
	}
	//MÉTODOS
	
		public Paciente getPaciente(){
		return PACIENTE;
		}
		public Medico getMedico(){
		return MEDICO;	
		}
		public String getData(){
		return DATA;
		}
		public String getHora(){
		return HORA;
		}
		
			public void setPaciente(Paciente paciente){
			this.PACIENTE = paciente;
			}
			public void setMedico(Medico medico){
			this.MEDICO = medico;	
			}
			public void setData(String data){
			this.DATA = data;
			}
			public void setHora(String hora){
			this.HORA = hora;
			}
			
			public String toString(){
				return ("PACIENTE" +getPaciente()+ "MEDICO: " +getMedico()+ ",DATA" +getData()+ ",Hora" +getHora());	
				}
}
