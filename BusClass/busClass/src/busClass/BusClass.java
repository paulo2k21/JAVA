package busClass;

import java.util.Date;
import java.util.List;

public class BusClass {

    // Classe base que contém informações comuns a Motoristas, Cobradores e Passageiros.
    class Pessoa {
        private int id;
        private String nome;
        private String cpf;

        

        // Define o ID da pessoa.
        public void setId(int id) {
            
        }

        // Obtém o ID da pessoa.
        public int getId() {
            
            return 0;
        }

        // Define o nome da pessoa.
       
        public void setNome(String nome) {
           
        }

        // Obtém o nome da pessoa.
       
        public String getNome() {
            
            return null;
        }

        // Define o CPF da pessoa.
        
        public void setCpf(String cpf) {
            
        }

        // Obtém o CPF da pessoa.
        
        public String getCpf() {
            
            return null;
        }
    }

    // Classe que representa um Motorista, herdando de Pessoa.
    class Motorista extends Pessoa {
       
    	private String numeroCNH;

       

        // Define o número da CNH do motorista.
        public void setNumeroCNH(String numeroCNH) {
          
        	
        }

        // Obtém o número da CNH do motorista.
        public String getNumeroCNH() {


            return null;
        }
    }

    // Classe que representa um Cobrador, herdando de Pessoa.
    
    class Cobrador extends Pessoa {
        
    }

    // Classe que representa um Passageiro, herdando de Pessoa.
    
    class Passageiro extends Pessoa {
        private String tipoCartao;

        

        // Define o tipo de cartão do passageiro.
        public void setTipoCartao(String tipoCartao) {
            
        	
        }

        // Obtém o tipo de cartão do passageiro.
        public String getTipoCartao() {


            return null;
        }
    }

    // Classe que representa os ônibus da empresa.
    class Veiculo {
        private int idVeiculo;
        private String placa;
        private String modelo;
        private int capacidade;

        
        // Define o ID do veículo.
        public void setIdVeiculo(int idVeiculo) {
         
        	
        }

        // Obtém o ID do veículo.
        public int getIdVeiculo() {
         
        	
            return 0;
        }

        // Define a placa do veículo.
        public void setPlaca(String placa) {
         
        	
        	
        }

        // Obtém a placa do veículo.
        public String getPlaca() {
          
        	
            return null;
        }

        // Define o modelo do veículo.
        public void setModelo(String modelo) {
           
        	
        }

        // Obtém o modelo do veículo.
        public String getModelo() {
           
        	
            return null;
        }

        // Define a capacidade do veículo.
        public void setCapacidade(int capacidade) {
            
        	
        }

        // Obtém a capacidade do veículo.
        public int getCapacidade() {
           
        	
            return 0;
        }
    }

    // Classe que representa os locais de embarque e desembarque.
    class PontoDeParada {
        private int idPontoParada;
        private String nome;
        private String localizacao;

       

        // Define o ID do ponto de parada.
        public void setIdPontoParada(int idPontoParada) {
            
        	
        }

        // Obtém o ID do ponto de parada.
        public int getIdPontoParada() {
           
        	
            return 0;
        }

        // Define o nome do ponto de parada.
        public void setNome(String nome) {
            
        	
        }

        // Obtém o nome do ponto de parada.
        public String getNome() {
           
        	
            return null;
        }

        // Define a localização do ponto de parada.
        public void setLocalizacao(String localizacao) {
            
        	
        }

        // Obtém a localização do ponto de parada.
        public String getLocalizacao() {
           
        	
            return null;
        }
    }

    // Classe que representa a ligação entre dois Pontos de Parada.
    class Trecho {
        private int idTrecho;
        private PontoDeParada pontoOrigem;
        private PontoDeParada pontoDestino;
        private int intervaloEstimado;

       

        // Define o ID do trecho.
        public void setIdTrecho(int idTrecho) {
            // Implementar
        }

        // Obtém o ID do trecho.
        public int getIdTrecho() {
            
        	
            return 0;
        }

        // Define o ponto de origem do trecho.
        public void setPontoOrigem(PontoDeParada pontoOrigem) {
            // Implementar
        }

        // Obtém o ponto de origem do trecho.
        public PontoDeParada getPontoOrigem() {
            
        	
            return null;
        }

        // Define o ponto de destino do trecho.
        public void setPontoDestino(PontoDeParada pontoDestino) {
            
        	
        }

        // Obtém o ponto de destino do trecho.
        public PontoDeParada getPontoDestino() {
            
        	
            return null;
        }

        // Define o intervalo estimado do trecho.
        public void setIntervaloEstimado(int intervaloEstimado) {
            
        	
        }

        // Obtém o intervalo estimado do trecho.
        public int getIntervaloEstimado() {
           
        	
            return 0;
        }
    }

    // Classe que representa a concatenação de Trechos.
    class Trajeto {
        
    	private int idTrajeto;

    	private String nome;
       
    	private List<Trecho> trechos;

        

        // Define o ID do trajeto.
        public void setIdTrajeto(int idTrajeto) {
           
        	
        }

        // Obtém o ID do trajeto.
        public int getIdTrajeto() {
            
        	
            return 0;
        }

        // Define o nome do trajeto.
        public void setNome(String nome) {
            
        	
        }

        // Obtém o nome do trajeto.
        public String getNome() {
            
        	
            return null;
        }

        // Define a lista de trechos do trajeto.
        public void setTrechos(List<Trecho> trechos) {
            
        	
        }

        // Obtém a lista de trechos do trajeto.
        public List<Trecho> getTrechos() {


            return null;
        }
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

       

        // Define o ID da jornada.
        public void setIdJornada(int idJornada) {
          
         
        }

        // Obtém o ID da jornada.
        public int getIdJornada() {
            
        	
            return 0;
        }

        // Define o motorista da jornada.
        public void setMotorista(Motorista motorista) {
            
        	
        }

        // Obtém o motorista da jornada.
        public Motorista getMotorista() {
            
        	
            return null;
        }

        // Define o cobrador da jornada.
        public void setCobrador(Cobrador cobrador) {
            
        	
        }

        // Obtém o cobrador da jornada.
        public Cobrador getCobrador() {
            
        	
            return null;
        }

        // Define o veículo da jornada.
        public void setVeiculo(Veiculo veiculo) {
            
        	
        }

        // Obtém o veículo da jornada.
        public Veiculo getVeiculo() {
           
        	
            return null;
        }

        // Define o trajeto da jornada.
        public void setTrajeto(Trajeto trajeto) {
            
        	
        }

        // Obtém o trajeto da jornada.
        public Trajeto getTrajeto() {
            
        	
            return null;
        }

        // Define a data de início da jornada.
        public void setDataInicio(Date dataInicio) {
            
        	
        }

        // Obtém a data de início da jornada.
        public Date getDataInicio() {
            
        	
            return null;
        }

        // Define a data de fim da jornada.
        public void setDataFim(Date dataFim) {
            
        	
        }

        // Obtém a data de fim da jornada.
        public Date getDataFim() {
            
        	
            return null;
        }
    }

    // Classe que registra o embarque de Passageiros em um Ponto de Parada.
    class PassageiroEmbarque {
        private int idEmbarque;
        private Jornada jornada;
        private Passageiro passageiro;
        private PontoDeParada pontoOrigem;
        private String cartao;
        private Date horaEmbarque;

        

        // Define o ID do embarque.
        public void setIdEmbarque(int idEmbarque) {
            
        	
        }

        // Obtém o ID do embarque.
        public int getIdEmbarque() {
           
        	
            return 0;
        }

        // Define a jornada do embarque.
        public void setJornada(Jornada jornada) {
           
        	
        }

        // Obtém a jornada do embarque.
        public Jornada getJornada() {
            
        	
            return null;
        }

        // Define o passageiro do embarque.
        public void setPassageiro(Passageiro passageiro) {
            
        	
        }

        // Obtém o passageiro do embarque.
        public Passageiro getPassageiro() {
            
        	
            return null;
        }

        // Define o ponto de origem do embarque.
        public void setPontoOrigem(PontoDeParada pontoOrigem) {
            
        	
        }

        // Obtém o ponto de origem do embarque.
        public PontoDeParada getPontoOrigem() {
          
        	
            return null;
        }

        // Define o cartão do passageiro.
        public void setCartao(String cartao) {
            
        	
        }

        // Obtém o cartão do passageiro.
        public String getCartao() {
            
        	
            return null;
        }

        // Define a hora do embarque.
        public void setHoraEmbarque(Date horaEmbarque) {


        }

        // Obtém a hora do embarque.
        public Date getHoraEmbarque() {


            return null;
        }
    }

    // Classe que representa as paradas especiais em um Trajeto.
    class Checkpoint {
        private int idCheckpoint;
        private Trecho trecho;
        private PontoDeParada pontoParada;
        private Date horaChegada;




        // Define o ID do checkpoint.
        public void setIdCheckpoint(int idCheckpoint) {


        }

        // Obtém o ID do checkpoint.
        public int getIdCheckpoint() {


            return 0;
        }

        // Define o trecho do checkpoint.
        public void setTrecho(Trecho trecho) {


        }

        // Obtém o trecho do checkpoint.
        public Trecho getTrecho() {


            return null;
        }

        // Define o ponto de parada do checkpoint.
        public void setPontoParada(PontoDeParada pontoParada) {


        }

        // Obtém o ponto de parada do checkpoint.
        public PontoDeParada getPontoParada() {


            return null;
        }

        // Define a hora de chegada do checkpoint.
        public void setHoraChegada(Date horaChegada) {


        }

        // Obtém a hora de chegada do checkpoint.
        public Date getHoraChegada() {


            return null;
        }
    }
}
