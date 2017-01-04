import java.util.regex.Pattern;

/*Instituto Federal de Ciencia e Tecnologia – IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.º: Francisco Petronio Alencar de Medeiros
Disciplina: Programação Orientada a Objeto
Curso: Redes de Computadores
Turno: Manhã                                 Período: 3º

                                          EXERCICIO - 40 % DA 1ª NOTA. 
*/

public class Paciente {

	private String DOCUMENTO;
	private String NOME;
	private String SEXO;
	private Endereco ENDERECO;
	private String NASCIMENTO;
 

	//CONSTRUTORES
	
public Paciente (String nome, String documento, String sexo, Endereco endereco, String nascimento){
	this.DOCUMENTO = documento;
	this.SEXO = sexo;
	this.ENDERECO = endereco;
	this.NOME = nome;
	this.NASCIMENTO = nascimento;
}

//MÉTODOS

public String getDocumento(){
return DOCUMENTO;
}
public String getNome(){
return NOME;
}
public String getSexo(){
return SEXO;	
}
public Endereco getEndereco(){
return ENDERECO;
}
public String getNascimento(){
return NASCIMENTO;	
}

public void setNome(String nome){
this.NOME = nome;
}
public void setDocumento(String documento){
this.DOCUMENTO = documento;	
}
public void setSexo(String sexo){
this.SEXO = sexo;
}
public void setEndereco(Endereco endereco){
this.ENDERECO = endereco;
}
public void setNascimento(String nascimento){
this.DOCUMENTO = nascimento;	
}

public int idade(String nascimento){
	String a[] = nascimento.split(Pattern.quote(".")); //SEPARAR STRING
	int ano = Integer.parseInt(a[2]); //CONVERTER STRING EM INTEIRO
	int idade = 2016 - ano;
	return idade;
	}

public String toString(){
return ("NOME: " +getNome()+ ",DOCUMENTO: " +getDocumento()+ ",SEXO:" +getSexo()+ ",ENDERECO" +getEndereco()+ ",DATA DE NASCIMENTO" +getNascimento());	
}
}

