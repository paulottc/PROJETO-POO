/*Instituto Federal de Ciencia e Tecnologia – IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.º: Francisco Petronio Alencar de Medeiros
Disciplina: Programação Orientada a Objeto
Curso: Redes de Computadores
Turno: Manhã                                 Período: 3º

                                          EXERCICIO - 40 % DA 1ª NOTA. 
*/

public class Endereco {
	private String CEP;
	private String RUA;
	private String BAIRRO;
	private String COMPLEMENTO;

	//CONSTRUTORES

	public Endereco (String cep, String rua, String bairro,String complemento){
		this.CEP = cep;
		this.RUA = rua;
		this.BAIRRO = bairro;
		this.COMPLEMENTO = complemento;
	}

	//MÉTODOS

	public String getCep(){
		return CEP;
	}
	public String getRua(){
		return RUA;
	}
	public String getBairro(){
		return BAIRRO;
	}
	public String getComplemento(){
		return COMPLEMENTO;
	}

	public void setCep(String cep){
	this.CEP = cep;
	}
	public void setRua(String rua){
	this.RUA = rua;	
	}
	public void setBairro(String bairro){
	this.BAIRRO = bairro;
	}
	public void setComplemento(String complemento){
	this.COMPLEMENTO = complemento;
	}

	public String toString(){
	return("CEP: " + getCep() + ", RUA: " + getRua() + ", BAIRRO: " + getBairro() + ", COMPLEMENTO:" +getComplemento());
	}
}

