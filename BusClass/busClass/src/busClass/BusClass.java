package busClass;

import java.util.Date;
import java.util.List;

public class BusClass {


	// Classe base que contém informações comuns a Motoristas, Cobradores e Passageiros.
	class Pessoa {
		
	    private int id;
	    
	    private String nome;
	    
	    private String cpf;
	}

	// Classe que representa um Motorista, herdando de Pessoa.
	class Motorista extends Pessoa {
		
	    private String numeroCNH;
	    
	}

	// Classe que representa um Cobrador, herdando de Pessoa.
	class Cobrador extends Pessoa {
		
		
	}

	// Classe que representa um Passageiro, herdando de Pessoa.
	class Passageiro extends Pessoa {
		
	    private String tipoCartao;
	    
	}

	// Classe que representa os ônibus da empresa.
	class Veiculo {
		
	    private int idVeiculo;
	    
	    private String placa;
	    
	    private String modelo;
	    
	    private int capacidade;
	}

	// Classe que representa os locais de embarque e desembarque.
	class PontoDeParada {
		
	    private int idPontoParada;
	    
	    private String nome;
	    
	    private String localizacao;
	}

	// Classe que representa a ligação entre dois Pontos de Parada.
	class Trecho {
		
	    private int idTrecho;
	    
	    private PontoDeParada pontoOrigem;
	    
	    private PontoDeParada pontoDestino;
	    
	    private int intervaloEstimado;
	}

	// Classe que representa a concatenação de Trechos.
	class Trajeto {
		
	    private int idTrajeto;
	    
	    private String nome;
	    
	    private List<Trecho> trechos;
	}
	
	// Classe que associa Motorista, Cobrador e Veículo a um Trajeto.
		class Jornada {
		    private int idJornada;
		    private Motorista motorista;
		    private Cobrador cobrador;
		    private Veiculo veiculo;
		    private Trajeto trajeto;
		    private Date dataInicio;
		    private Date dataFim;
		}

		// Classe que registra o embarque de Passageiros em um Ponto de Parada.
		class PassageiroEmbarque {
		    private int idEmbarque;
		    private Jornada jornada;
		    private Passageiro passageiro;
		    private PontoDeParada pontoOrigem;
		    private String cartao;
		    private Date horaEmbarque;
		}

	// Classe que representa as paradas especiais em um Trajeto.
	class Checkpoint {
	    private int idCheckpoint;
	    private Trecho trecho;
	    private PontoDeParada pontoParada;
	    private Date horaChegada;
	}

	
}
