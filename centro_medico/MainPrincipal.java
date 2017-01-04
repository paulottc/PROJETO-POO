/*Instituto Federal de Ciencia e Tecnologia – IFPB
Aluno: Paulo de Tarso Teixeira da Costa
Prof.º: Francisco Petronio Alencar de Medeiros
Disciplina: Programação Orientada a Objeto
Curso: Redes de Computadores
Turno: Manhã                                 Período: 3º

                                          EXERCICIO - 40 % DA 1ª NOTA. 
*/


import java.util.Scanner;



public class MainPrincipal {
	
	public static void main(String[] args) {
		ColecaoPacientes colecao = new 	ColecaoPacientes(); 
		ColecaoConsultas colecao_c = new ColecaoConsultas();
		ColecaoMedico ColecMedico = new ColecaoMedico();
		
		Scanner opcao = new Scanner(System.in);
		
		int op = 0;
		while (op != 4){
		    System.out.println("\n");
			System.out.println("=============== MENU ================");
			System.out.println("\n");
			System.out.println("1 - PACIENTES");
			System.out.println("2 - MEDICOS");
			System.out.println("3 - CONSULTAS");
			System.out.println("4 - EXIT");
			op = opcao.nextInt();
			
			switch (op)
			{
			case 1:{
				int opi = 0;
				
				while (opi != 6){
				    System.out.println("\n");
					System.out.println("=========== MENU PACIENTE ============");
					System.out.println("\n");
					System.out.println("1 - ADICIONAR UM PACIENTE");
					System.out.println("2 - PESQUISAR UM PACIENTE PELA CPF");
					System.out.println("3 - QUANTIADE DE PACIENTES POR SEXO");
					System.out.println("4 - EXIBIR O CADASTRO DE TODOS OS PACIENTES");
					System.out.println("5 - REMOVER PELO CPF");
					System.out.println("6 - PACIENTES COM MAIS DE 60 ANOS");
					System.out.println("7 - VOLTAR");
					opi = opcao.nextInt();
					
					switch (opi)
					{
					case 1:{
						String nome, cpf, sexo, nascimento;
						String cep, rua, bairro, complemento;
						
						
						System.out.println("Digite o nome:");
						nome = opcao.nextLine();
						nome = opcao.nextLine();
						System.out.println("Digite numero do cpf:");
						cpf = opcao.nextLine();
				
						System.out.println("Digite uma das opções para o Sexo:");
						System.out.println("MASCULINO ou masculino");
						System.out.println("FEMININO ou feminino");
						sexo = opcao.next();
						
						System.out.println("Digite a data do seu nascimento:");
						nascimento = opcao.nextLine();
						nascimento = opcao.nextLine();
						
						System.out.println("Digite o cep");
						cep = opcao.nextLine();
						
						System.out.println("Digite a rua");
						rua = opcao.nextLine();
						System.out.println("Digite o bairro");
						bairro = opcao.next();
						System.out.println("Digite o complemento");
						complemento = opcao.nextLine();
						complemento = opcao.nextLine();
						
						
						Endereco endereco = new Endereco(cep,rua,bairro,complemento);
						colecao.cadastrarpaciente(nome, cpf, sexo, endereco, nascimento);
						break;
					}//case 1
					case 2:{
						String cpf; 
						System.out.println("Digite numero do cpf:");
						cpf = opcao.next();
						colecao.pesquisa_por_cpf(cpf);			
						break;
					}//case 2
					case 3:{
						System.out.println("\n");
						System.out.println("Número de pacientes do sexo feminino:");
						colecao.quantidade_paciente_sexo_feminino();
						System.out.println("Número de pacientes do sexo masculino:");
						colecao.quantidade_paciente_sexo_masculino();
						break;
					}//case 3
					case 4:{
						System.out.println("\n");
						colecao.exibir_colecao();
						break;
					}//case 4
					case 5:{
						String cpf; 
						System.out.println("\n");
						System.out.println("Digite numero do cpf:");
						cpf = opcao.next();
						colecao.remover_pelo_documento(cpf);
						break;
					}//case 5
					case 6:{
						System.out.println("\n");
						colecao.maior_de_60();
						break;
					}//case 6
					}//switch
				}//while
				break;
			}//case 1
			case 2:{
				int opi = 0;
				
				
				while (opi != 4){
			    System.out.println("\n");
				System.out.println("=========== MENU MEDICO ============");
				System.out.println("\n");
				System.out.println("1 - ADICIONAR UM MEDICO");
				System.out.println("2 - PESQUISAR PELO CRM");
				System.out.println("3 - EXIBIR O CADASTRO DE TODOS OS MEDICOS");
				System.out.println("4 - VOLTAR");
				opi = opcao.nextInt();
				
				switch (opi)
				{
				case 1:{
					String nome, crm, especialidade;
					
					System.out.println("Digite o nome:");
					nome = opcao.nextLine();
					nome = opcao.nextLine();

					System.out.println("Digite o crm:");
					crm = opcao.next();
					System.out.println("Digite a especialidade:");
					especialidade = opcao.next();
								
					ColecMedico.cadastrarmedico(nome, crm, especialidade);
					break;
				}//case 1
				case 2:{
					String crm; 
					System.out.println("Digite o crm:");
					crm = opcao.next();
					ColecMedico.pesquisa_por_crm(crm);			
					break;
				}//case 2
				case 3:{
					ColecMedico.exibir_colecao_medico();
					break;
				}//case 3
				}//switch
				}//while
				
				break;
			}//case 2
			case 3:{
				int opi = 0;
				
				
				while (opi != 6){
			    System.out.println("\n");
				System.out.println("============ MENU CONSULTAS =============");
				System.out.println("\n");
				System.out.println("1 - ADICIONAR UMA CONSULTA");
				System.out.println("2 - QUANTIDADE DE CONSULTAS POR DATA");
				System.out.println("3 - QUANTIDADE DE CONSULTAS POR MEDICO");
				System.out.println("4 - QUANTIDADE DE CONSULTAS POR PACIENTE");
				System.out.println("5 - LISTAR TODAS AS CONSULTAS");
				System.out.println("6 - VOLTAR");
				opi = opcao.nextInt();
				
					switch (opi)
					{
					case 1:{
					String cpf_p, crm_m;
					String data, hora;
				 
					System.out.println("\n Digite o cpf do paciente:");
					cpf_p = opcao.nextLine();
					cpf_p = opcao.nextLine();
					
					System.out.println("Digite o crm do medico:");
					crm_m = opcao.nextLine(); 
					
						if (colecao.pesquisa_por_cpf_paciente(cpf_p) == null && ColecMedico.pesquisa_por_crm_m(crm_m) != null){							
							String nome, cpf, sexo, nascimento;
							String cep, rua, bairro, complemento;
							
							System.out.println("\n Paciente não cadastrado!");
							System.out.println("\n Por favor cadastre um novo paciente!");
							
							System.out.println("\nDigite o nome do novo paciente:");
							nome = opcao.nextLine();
							
							System.out.println("Digite numero do cpf:");
							cpf = opcao.nextLine();
					
							System.out.println("Digite uma das opções para o Sexo:");
							System.out.println("MASCULINO ou masculino");
							System.out.println("FEMININO ou feminino");
							sexo = opcao.next();
							

							System.out.println("Digite a data do seu nascimento:");
							nascimento = opcao.nextLine();
							nascimento = opcao.nextLine();
							
							System.out.println("Digite o cep");
							cep = opcao.nextLine();
							cep = opcao.nextLine();
							System.out.println("Digite a rua");
							rua = opcao.nextLine();
							System.out.println("Digite o bairro");
							bairro = opcao.next();
							System.out.println("Digite o complemento");
							complemento = opcao.nextLine();
							complemento = opcao.nextLine();
							
							Endereco endereco = new Endereco(cep,rua,bairro,complemento);
							colecao.cadastrarpaciente(nome, cpf, sexo, endereco, nascimento);
							Paciente x = new Paciente(nome, cpf, sexo, endereco, nascimento);
							
							System.out.println("\nDigite a data:");
							data = opcao.next();
							System.out.println("Digite hora:");
							hora = opcao.next();
							
							Medico medico = ColecMedico.pesquisa_por_crm_m(crm_m);
							colecao_c.cadastrar_consulta(x, medico, data, hora);
					    break;
						}
						
						if (ColecMedico.pesquisa_por_crm_m(crm_m) == null && colecao.pesquisa_por_cpf_paciente(cpf_p) != null  ){
							String nome, crm, especialidade;
							
							System.out.println("\n Medico não cadastrado!");
							System.out.println("\n Por favor cadastre um novo medico!");
							
							System.out.println("\nDigite o nome do novo medico:");
							nome = opcao.nextLine();
	

							System.out.println("Digite o crm:");
							crm = opcao.next();
							System.out.println("Digite a especialidade:");
							especialidade = opcao.next();
							
							System.out.println("\nDigite a data:");
							data = opcao.next();
							System.out.println("Digite hora:");
							hora = opcao.next();
							
							Paciente paciente = colecao.pesquisa_por_cpf_paciente(cpf_p);
							ColecMedico.cadastrarmedico(nome, crm, especialidade);
							Medico x = new Medico(nome, crm, especialidade);
							colecao_c.cadastrar_consulta(paciente, x, data, hora);
						break;
				    	}
				 
						 if (colecao.pesquisa_por_cpf_paciente(cpf_p) == null && ColecMedico.pesquisa_por_crm_m(crm_m) == null){
							    String nome_paciente, cpf, sexo, nascimento;
								String cep, rua, bairro, complemento;
								
								String nome_medico, crm, especialidade;
								
								
								System.out.println("\n Paciente não cadastrado, por favor cadastre um novo paciente!");
								
								System.out.println("\nDigite o nome do novo paciente:");
								nome_paciente = opcao.nextLine();
								
								System.out.println("Digite numero do cpf:");
								cpf = opcao.nextLine();
						
								System.out.println("Digite uma das opções para o Sexo:");
								System.out.println("MASCULINO ou masculino");
								System.out.println("FEMININO ou feminino");
								sexo = opcao.next();
								
								System.out.println("Digite a data do seu nascimento:");
								nascimento = opcao.nextLine();
								nascimento = opcao.nextLine();
								
								System.out.println("Digite o cep");
								cep = opcao.nextLine();
								cep = opcao.nextLine();
								System.out.println("Digite a rua");
								rua = opcao.nextLine();
								System.out.println("Digite o bairro");
								bairro = opcao.next();
								System.out.println("Digite o complemento");
								complemento = opcao.nextLine();
								complemento = opcao.nextLine();
								
								Endereco endereco = new Endereco(cep,rua,bairro,complemento);
								colecao.cadastrarpaciente(nome_paciente, cpf, sexo, endereco, nascimento);
								Paciente x = new Paciente(nome_paciente, cpf, sexo, endereco, nascimento);
								
								System.out.println("\n Medico não cadastrado, por favor cadastre um novo medico!");
								
								System.out.println("\nDigite o nome do novo medico:");
								nome_medico = opcao.nextLine();
								

								System.out.println("Digite o crm:");
								crm = opcao.next();
								
								System.out.println("Digite a especialidade:");
								especialidade = opcao.next();
								
								ColecMedico.cadastrarmedico(nome_medico, crm, especialidade);
								Medico y = new Medico(nome_medico, crm, especialidade);
								
								System.out.println("\nDigite a data:");
								data = opcao.next();
								System.out.println("Digite hora:");
								hora = opcao.next();
								
								colecao_c.cadastrar_consulta(x, y, data, hora);
							 break;
						 }
						
				    if (colecao.pesquisa_por_cpf_paciente(cpf_p) != null && ColecMedico.pesquisa_por_crm_m(crm_m) != null){
					System.out.println("Digite a data:");
					data = opcao.next();
					System.out.println("Digite hora:");
					hora = opcao.next();
					
					Paciente paciente = colecao.pesquisa_por_cpf_paciente(cpf_p);
					Medico medico = ColecMedico.pesquisa_por_crm_m(crm_m);
					colecao_c.cadastrar_consulta(paciente, medico, data, hora);
					break;
				    }
					}//case 1
				
					case 2:{
					String data;
					System.out.println("Digite a data:");
					data = opcao.next();
					colecao_c.quantidade_de_consultas_por_data(data);
					break;
					}//case 2
					
					case 3:{
					String nome_m;
					System.out.println("Digite o nome:");
					nome_m = opcao.next();
					colecao_c.quantidade_de_consultas_por_Medico(nome_m);	
					break;
					}//case 3
					
					case 4:{
					String nome_p;
					System.out.println("Digite o nome:");
					nome_p = opcao.next();
					colecao_c.quantidade_de_consultas_por_paciente(nome_p);
					break;
				    }//case 4
					
					case 5:{
					colecao_c.exibir_consultas();
					break;
							}//case 5
						}//switch
					}//while		
				}//case 3
			}//switch		
		}//while
	}//main
}//MainPrincipal

