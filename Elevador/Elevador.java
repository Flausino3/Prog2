import java.util.*;

/**
    A classe Elevador representa um elevador que pode se mover entre diferentes pisos.
 */
public class Elevador {  
    public Piso pisoAtual;  
    public Piso pisoTerreo;  
    public String direcao = new String();  // Direção do movimento do elevador
    public boolean portaFechada;  // Estado da porta
    public int ultimoAndar; 
    
    /**
     * Construtor para objetos da classe Elevador.
     */
    public Elevador(Piso piso) {
        
        pisoAtual = piso;
        portaFechada = true;
        direcao = "Subindo";
    }
    
    public void abrirPorta() {
        System.out.println("Abrindo a porta");
        portaFechada = false;
    }
    
    public void fecharPorta() {
        System.out.println("Fechando a porta");
        portaFechada = true;
    }
    
    /**
     * Método que verifica se a porta do elevador está aberta.
     */
    public void isPortaAberta() {
        if (portaFechada == false) {
            System.out.println("A porta está aberta");    
        } else {
            System.out.println("A porta está fechada");
        }
    }
    
    /**
     * Método que verifica se o elevador está subindo.
     */
    public void isSubindo() {
        if (direcao.equals("Subindo")) {
            System.out.println("Elevador subindo");
        } else {
            System.out.println("O elevador não está subindo");
        }
    }
    
    /**
     * Método que verifica se o elevador está descendo.
     */
    public void isDescendo() {
        if (direcao.equals("Descendo")) {
            System.out.println("Elevador descendo");
        } else {
            System.out.println("O elevador não está descendo");
        }
    }
    
    /**
     * Método que retorna o número do piso atual do elevador.
     */
    public int getPisoAtual() {
        return pisoAtual.getAndar();
    }
    
    /**
     * Método que para o elevador em um piso específico.
     */
    public void pararNoPiso(Piso piso) {
        System.out.println("Parar no piso " + piso.getAndar());
        piso.solicitarParada();
    }
    
    /**
     * Método que mostra o painel do elevador.
     */
    public void mostrarPainel(Piso terreo) {
        // Método para exibir o painel do elevador
        pisoTerreo = terreo;
        pisoAtual = terreo;
        
        System.out.println("** Painel do Elevador **");
        // Imprime o título do painel
    
        while (pisoAtual != null) {
            // Loop que itera através de cada andar do prédio
            
            if (pisoAtual.getAndar() == pisoAtual.getAndar() && pisoAtual.paradaSolicitada == true) {
                System.out.print("*" + pisoAtual.getAndar() + "*");   
            } else {
                System.out.print(" " + pisoAtual.getAndar() + " ");
            }
            pisoAtual = pisoAtual.getPróximoPiso();
        }
    }
}
