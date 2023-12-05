package cOELHO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Objects;

public class COELHO {
	
		public class Cliente {
		    private String nome;
		    private String cpf;

		    public Cliente(String nome, String cpf) {
		        this.nome = nome;
		        this.cpf = cpf;
		    }

		    public String getNome() {
		        return nome;
		    }

		    public String getCpf() {
		        return cpf;
		    }

		    @Override
		    public boolean equals(Object o) {
		        if (this == o) return true;
		        if (o == null || getClass() != o.getClass()) return false;
		        Cliente cliente = (Cliente) o;
		        return Objects.equals(cpf, cliente.cpf);
		    }

		    @Override
		    public int hashCode() {
		        return Objects.hash(cpf);
		    }

		    @Override
		    public String toString() {
		        return "Cliente{" +
		                "nome='" + nome + '\'' +
		                ", cpf='" + cpf + '\'' +
		                '}';
		    }
		}
	}
	

	public class Imovel {
	    private String matricula;

	    public Imovel(String matricula) {
	        this.matricula = matricula;
	    }

	    public String getMatricula() {
	        return matricula;
	    }
	}

	public class Fatura {
	    private Imovel imovel;
	    private double ultimaLeitura;
	    private double penultimaLeitura;
	    private Date dataEmissao;
	    private double valorCalculado;
	    private boolean quitada;

	    public Fatura(Imovel imovel, double ultimaLeitura, double penultimaLeitura) {
	        this.imovel = imovel;
	        this.ultimaLeitura = ultimaLeitura;
	        this.penultimaLeitura = penultimaLeitura;
	        this.dataEmissao = new Date();
	        this.valorCalculado = calcularValor();
	        this.quitada = false;
	    }

	    public Imovel getImovel() {
	        return imovel;
	    }

	    public double getUltimaLeitura() {
	        return ultimaLeitura;
	    }

	    public double getPenultimaLeitura() {
	        return penultimaLeitura;
	    }

	    public Date getDataEmissao() {
	        return dataEmissao;
	    }

	    public double getValorCalculado() {
	        return valorCalculado;
	    }

	    public boolean isQuitada() {
	        return quitada;
	    }

	    public void quitarFatura() {
	        quitada = true;
	    }

	    private double calcularValor() {
	       
	        double custoPorKWh = 10.0;
	        
	        
	        double diferencaLeitura = ultimaLeitura - penultimaLeitura;

	   
	        return custoPorKWh * diferencaLeitura;
	    }


	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Fatura fatura = (Fatura) o;
	        return Objects.equals(imovel, fatura.imovel) &&
	                Objects.equals(dataEmissao, fatura.dataEmissao);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(imovel, dataEmissao);
	    }

	    @Override
	    public String toString() {
	        return "Fatura{" +
	                "imovel=" + imovel +
	                ", ultimaLeitura=" + ultimaLeitura +
	                ", penultimaLeitura=" + penultimaLeitura +
	                ", dataEmissao=" + dataEmissao +
	                ", valorCalculado=" + valorCalculado +
	                ", quitada=" + quitada +
	                '}';
	    }
	}


	public class MenuFaturas {
	    private List<Imovel> imoveis;
	    private List<Fatura> faturas;

	    public MenuFaturas(List<Imovel> imoveis, List<Fatura> faturas) {
	        this.imoveis = imoveis;
	        this.faturas = faturas;
	    }

	    public void criarFatura(Scanner scanner) {
	        System.out.print("Digite a matrícula do imóvel: ");
	        String matricula = scanner.next();

	        Imovel imovel = buscarImovel(matricula);
	        if (imovel != null) {
	            System.out.print("Digite a leitura atual: ");
	            double leituraAtual = scanner.nextDouble();

	            Fatura fatura = new Fatura(imovel, leituraAtual, imovel.getUltimaLeitura());
	            faturas.add(fatura);

	           
	            imovel.setUltimaLeitura(leituraAtual);

	            System.out.println("Fatura criada com sucesso!");
	        } else {
	            System.out.println("Imóvel não encontrado. Não é possível criar a fatura.");
	        }
	    }

	    public void listarFaturas(boolean apenasEmAberto) {
	        System.out.println("\nLista de Faturas:");
	        for (Fatura fatura : faturas) {
	            if (!apenasEmAberto || !fatura.isQuitada()) {
	                System.out.println(fatura);
	            }
	        }
	    }

	    private Imovel buscarImovel(String matricula) {
	        for (Imovel imovel : imoveis) {
	            if (imovel.getMatricula().equals(matricula)) {
	                return imovel;
	            }
	        }
	        return null;
	    }
	}


	public class Pagamento {
	    private Fatura fatura;
	    private double valor;
	    private Date dataPagamento;

	    public Pagamento(Fatura fatura, double valor) {
	        this.fatura = fatura;
	        this.valor = valor;
	        this.dataPagamento = new Date(); // Data atual do sistema
	    }

	    public Fatura getFatura() {
	        return fatura;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public Date getDataPagamento() {
	        return dataPagamento;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Pagamento pagamento = (Pagamento) o;
	        return Objects.equals(fatura, pagamento.fatura) &&
	                Objects.equals(dataPagamento, pagamento.dataPagamento);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(fatura, dataPagamento);
	    }

	    @Override
	    public String toString() {
	        return "Pagamento{" +
	                "fatura=" + fatura +
	                ", valor=" + valor +
	                ", dataPagamento=" + dataPagamento +
	                '}';
	    }
	}


	public class Reembolso {
	    private Pagamento pagamentoExcedente;
	    private double valorReembolsado;
	    private Date dataReembolso;

	    public Reembolso(Pagamento pagamentoExcedente, double valorReembolsado) {
	        this.pagamentoExcedente = pagamentoExcedente;
	        this.valorReembolsado = valorReembolsado;
	        this.dataReembolso = new Date(); 
	    }

	    public Pagamento getPagamentoExcedente() {
	        return pagamentoExcedente;
	    }

	    public double getValorReembolsado() {
	        return valorReembolsado;
	    }

	    public Date getDataReembolso() {
	        return dataReembolso;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Reembolso reembolso = (Reembolso) o;
	        return Objects.equals(pagamentoExcedente, reembolso.pagamentoExcedente) &&
	                Objects.equals(dataReembolso, reembolso.dataReembolso);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(pagamentoExcedente, dataReembolso);
	    }

	    @Override
	    public String toString() {
	        return "Reembolso{" +
	                "pagamentoExcedente=" + pagamentoExcedente +
	                ", valorReembolsado=" + valorReembolsado +
	                ", dataReembolso=" + dataReembolso +
	                '}';
	    }
	}


	public class MenuPagamentos {
	    private List<Pagamento> pagamentos;
	    private List<Reembolso> reembolsos;

	    public MenuPagamentos() {
	        this.pagamentos = new ArrayList<>();
	        this.reembolsos = new ArrayList<>();
	    }

	    public void incluirPagamento(Scanner scanner, List<Fatura> faturas) {
	        System.out.print("Digite a matrícula do imóvel associado à fatura: ");
	        String matricula = scanner.next();

	        Fatura fatura = buscarFatura(matricula, faturas);
	        if (fatura != null && !fatura.isQuitada()) {
	            System.out.print("Digite o valor do pagamento: ");
	            double valorPagamento = scanner.nextDouble();

	            Pagamento pagamento = new Pagamento(fatura, valorPagamento);
	            pagamentos.add(pagamento);

	            // Verifica se o pagamento quitou a fatura
	            if (calcularTotalPagamentos(fatura) >= fatura.getValorCalculado()) {
	                fatura.quitarFatura();
	            }

	            System.out.println("Pagamento registrado com sucesso!");
	        } else {
	            System.out.println("Fatura não encontrada ou já quitada. Não é possível registrar o pagamento.");
	        }
	    }

	    public void listarPagamentos() {
	        System.out.println("\nLista de Pagamentos:");
	        for (Pagamento pagamento : pagamentos) {
	            System.out.println(pagamento);
	        }
	    }

	    public void listarReembolsos() {
	        System.out.println("\nLista de Reembolsos:");
	        for (Reembolso reembolso : reembolsos) {
	            System.out.println(reembolso);
	        }
	    }

	    private Fatura buscarFatura(String matricula, List<Fatura> faturas) {
	        for (Fatura fatura : faturas) {
	            if (fatura.getImovel().getMatricula().equals(matricula)) {
	                return fatura;
	            }
	        }
	        return null;
	    }

	    private double calcularTotalPagamentos(Fatura fatura) {
	        double totalPagamentos = 0.0;
	        for (Pagamento pagamento : pagamentos) {
	            if (pagamento.getFatura().equals(fatura)) {
	                totalPagamentos += pagamento.getValor();
	            }
	        }
	        return totalPagamentos;
	    }
	}

	public class Falha {
	    private String tipo;  // Geração ou Distribuição
	    private Imovel imovel; // O imóvel associado à falha, pode ser nulo se não estiver associada a um imóvel
	    private Date dataRegistro; // Data em que a falha foi registrada

	    public Falha(String tipo, Imovel imovel) {
	        this.tipo = tipo;
	        this.imovel = imovel;
	        this.dataRegistro = new Date(); // Data atual do sistema
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public Imovel getImovel() {
	        return imovel;
	    }

	    public Date getDataRegistro() {
	        return dataRegistro;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Falha falha = (Falha) o;
	        return Objects.equals(tipo, falha.tipo) &&
	                Objects.equals(imovel, falha.imovel) &&
	                Objects.equals(dataRegistro, falha.dataRegistro);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(tipo, imovel, dataRegistro);
	    }

	    @Override
	    public String toString() {
	        return "Falha{" +
	                "tipo='" + tipo + '\'' +
	                ", imovel=" + imovel +
	                ", dataRegistro=" + dataRegistro +
	                '}';
	    }
	}

	public class Reparo {
	    private Falha falha; // A falha associada ao reparo
	    private String descricao; // Descrição da atividade de reparo
	    private Date dataInicio; // Data de início do reparo
	    private Date dataFim; // Data de fim do reparo
	    private boolean resolvido; // Indica se o reparo resolveu a falha

	    public Reparo(Falha falha, String descricao) {
	        this.falha = falha;
	        this.descricao = descricao;
	        this.dataInicio = new Date(); // Data atual do sistema
	        this.dataFim = null; // Inicialmente, a data de fim é nula
	        this.resolvido = false; // Inicialmente, o reparo não foi resolvido
	    }

	    public Falha getFalha() {
	        return falha;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public Date getDataInicio() {
	        return dataInicio;
	    }

	    public Date getDataFim() {
	        return dataFim;
	    }

	    public boolean isResolvido() {
	        return resolvido;
	    }

	    public void resolverReparo() {
	        this.resolvido = true;
	        this.dataFim = new Date(); // Define a data de fim como a data atual
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Reparo reparo = (Reparo) o;
	        return resolvido == reparo.resolvido &&
	                Objects.equals(falha, reparo.falha) &&
	                Objects.equals(descricao, reparo.descricao) &&
	                Objects.equals(dataInicio, reparo.dataInicio) &&
	                Objects.equals(dataFim, reparo.dataFim);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(falha, descricao, dataInicio, dataFim, resolvido);
	    }

	    @Override
	    public String toString() {
	        return "Reparo{" +
	                "falha=" + falha +
	                ", descricao='" + descricao + '\'' +
	                ", dataInicio=" + dataInicio +
	                ", dataFim=" + dataFim +
	                ", resolvido=" + resolvido +
	                '}';
	    }
	}


	public class MenuFalha {
	    public void incluirFalha(Imovel imovel, String tipo, List<Falha> falhas, List<Reparo> reparos) {
	        Falha falha = new Falha(tipo, imovel);

	        falhas.add(falha);

	        if ("distribuicao".equalsIgnoreCase(tipo)) {
	            // Se a falha é de distribuição, cria automaticamente um reparo
	            Reparo reparo = criarReparo(falha);
	            reparos.add(reparo);
	            System.out.println("Reparo associado criado automaticamente.");
	        }

	        System.out.println("Falha registrada com sucesso!");
	    }

	    private Reparo criarReparo(Falha falha) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a descrição do reparo: ");
	        String descricao = scanner.nextLine();

	        return new Reparo(falha, descricao);
	    }
	}


	public class MenuReparos {
	    public void listarReparosAbertos(List<Reparo> reparos) {
	        System.out.println("\nReparos em Aberto:");

	        boolean existemReparosAbertos = false;

	        for (Reparo reparo : reparos) {
	            if (!reparo.isResolvido()) {
	                System.out.println(reparo);
	                existemReparosAbertos = true;
	            }
	        }

	        if (!existemReparosAbertos) {
	            System.out.println("Não há reparos em aberto.");
	        }
	    }
	}


	public class MenuReparos {
	    public void encerrarReparo(List<Reparo> reparos) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o índice do reparo que deseja encerrar: ");
	        int indiceReparo = scanner.nextInt();

	        if (indiceReparo >= 0 && indiceReparo < reparos.size()) {
	            Reparo reparo = reparos.get(indiceReparo);

	            if (!reparo.isResolvido()) {
	                System.out.print("A falha foi resolvida? (s/n): ");
	                char resposta = scanner.next().charAt(0);

	                if (resposta == 's' || resposta == 'S') {
	                    reparo.resolverReparo();
	                    System.out.println("Reparo encerrado com sucesso.");
	                } else {
	                    System.out.println("O reparo não foi resolvido. Nenhuma alteração foi feita.");
	                }
	            } else {
	                System.out.println("Este reparo já foi encerrado anteriormente.");
	            }
	        } else {
	            System.out.println("Índice de reparo inválido.");
	        }
	    }
	}


	public class SistemaDistribuicaoEnergia {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Cliente> clientes = new ArrayList<>();
	        List<Imovel> imoveis = new ArrayList<>();
	        List<Falha> falhas = new ArrayList<>();
	        List<Reparo> reparos = new ArrayList<>();

	        MenuFaturas menuFaturas = new MenuFaturas(imoveis);
	        MenuPagamentos menuPagamentos = new MenuPagamentos();
	        MenuFalha menuFalha = new MenuFalha();
	        MenuReparos menuReparos = new MenuReparos();

	        int opcao;
	        do {
	            System.out.println("\nMenu Principal:");
	            System.out.println("1. Gestão de Clientes");
	            System.out.println("2. Gestão de Imóveis");
	            System.out.println("3. Gestão de Faturas");
	            System.out.println("4. Gestão de Pagamentos");
	            System.out.println("5. Gestão de Falhas");
	            System.out.println("6. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    menuClientes.executar(scanner);
	                    break;
	                case 2:
	                    menuImoveis.executar(scanner);
	                    break;
	                case 3:
	                    menuFaturas.executar(scanner);
	                    break;
	                case 4:
	                    menuPagamentos.executar(scanner);
	                    break;
	                case 5:
	                    menuFalhas.executar(scanner, menuReparos);
	                    break;
	                case 6:
	                    System.out.println("Saindo do programa. Até logo!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 6);
	    }

	    private static void menuFalhas(Scanner scanner, List<Imovel> imoveis, MenuFalha menuFalha, MenuReparos menuReparos, List<Falha> falhas) {
	        int opcao;
	        do {
	            System.out.println("\nMenu Gestão de Falhas:");
	            System.out.println("1. Incluir Falha (com matrícula)");
	            System.out.println("2. Incluir Falha (sem matrícula)");
	            System.out.println("3. Gestão de Reparos");
	            System.out.println("4. Voltar ao Menu Principal");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    menuFalhaComMatricula(scanner, imoveis, menuFalha, falhas, menuReparos);
	                    break;
	                case 2:
	                    menuFalhaSemMatricula(scanner, menuFalha, falhas, menuReparos);
	                    break;
	                case 3:
	                    menuReparos(scanner, menuReparos);
	                    break;
	                case 4:
	                    System.out.println("Retornando ao Menu Principal.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 4);
	    }

	    private static void menuFalhaComMatricula(Scanner scanner, List<Imovel> imoveis, MenuFalha menuFalha, List<Falha> falhas, MenuReparos menuReparos) {
	        System.out.print("Digite a matrícula do imóvel: ");
	        String matricula = scanner.next();

	        Imovel imovel = buscarImovel(matricula, imoveis);
	        if (imovel != null) {
	            System.out.print("Digite o tipo da falha (geracao/distribuicao): ");
	            String tipo = scanner.next().toLowerCase();

	            menuFalha.incluirFalha(imovel, tipo, falhas, menuReparos);
	        } else {
	            System.out.println("Imóvel não encontrado. Não é possível incluir a falha.");
	        }
	    }

	    private static void menuFalhaSemMatricula(Scanner scanner, MenuFalha menuFalha, List<Falha> falhas, MenuReparos menuReparos) {
	        System.out.print("Digite o tipo da falha (geracao/distribuicao): ");
	        String tipo = scanner.next().toLowerCase();

	        menuFalha.incluirFalha(null, tipo, falhas, menuReparos);
	    }

	    private static Imovel buscarImovel(String matricula, List<Imovel> imoveis) {
	        for (Imovel imovel : imoveis) {
	            if (imovel.getMatricula().equals(matricula)) {
	                return imovel;
	            }
	        }
	        return null;
	    }

	    private static void menuReparos(Scanner scanner, MenuReparos menuReparos) {
	        int opcao;
	        do {
	            System.out.println("\nMenu Gestão de Reparos:");
	            System.out.println("1. Listar Reparos em Aberto");
	            System.out.println("2. Encerrar Reparo");
	            System.out.println("3. Voltar ao Menu de Falhas");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    menuReparos.listarReparosAbertos(null); // Substitua o 'null' pelos reparos existentes
	                    break;
	                case 2:
	                    encerrarReparo(scanner, menuReparos); // Substitua o 'null' pelos reparos existentes
	                    break;
	                case 3:
	                    System.out.println("Retornando ao Menu de Falhas.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 3);
	    }

	    private static void encerrarReparo(Scanner scanner, MenuReparos menuReparos) {
	        menuReparos.listarReparosAbertos();

	        System.out.print("Digite o número do reparo que deseja encerrar: ");
	        int numeroReparo = scanner.nextInt();

	        Reparo reparo = menuReparos.encontrarReparo(numeroReparo);

	        if (reparo != null) {
	            if (!reparo.isResolvido()) {
	                System.out.print("A falha foi resolvida? (S/N): ");
	                char resposta = scanner.next().charAt(0);

	                if (Character.toUpperCase(resposta) == 'S') {
	                    reparo.resolverReparo();
	                    System.out.println("Reparo encerrado com sucesso.");
	                } else {
	                    System.out.println("O reparo não foi resolvido.");
	                }
	            } else {
	                System.out.println("Este reparo já foi encerrado anteriormente.");
	            }
	        } else {
	            System.out.println("Número de reparo inválido. Tente novamente.");
	        }
	    }
	}

