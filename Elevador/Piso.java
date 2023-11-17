import java.util.*;

/**
 * A classe Piso representa um andar no prédio com funcionalidades associadas.
 */
public class Piso {
    // Atributos
    public int andar;  // Número do andar
    public boolean subir = false;  // Indica se alguém chamou o elevador para subir
    public boolean descer = false;  // Indica se alguém chamou o elevador para descer
    public boolean paradaSolicitada;  // Indica se uma parada foi solicitada neste piso
    private Piso pisoAcima;  // Referência ao próximo piso acima
    private Piso pisoAnterior;  // Referência ao piso anterior
    
    /**
     * Construtor para objetos da classe Piso.
     */
    public Piso(int numeroAndar) {
        
        andar = numeroAndar;
    }

    public int getAndar() {
        return andar;
    }

    /**
     * Método que indica se alguém chamou o elevador para subir.
     */
    public void queroSubir() {
        subir = true;
        System.out.println("Chamando elevador para subir");
    }
    
    /**
     * Método que verifica se alguém no piso quer subir.
     */
    public void isQueroSubir() {
        if (subir == true) {
            System.out.println("Pessoas no piso querem subir");
        } else {
            System.out.println("Ninguém no piso quer subir");
        }
    }

    /**
     * Método que indica se alguém chamou o elevador para descer.
     */
    public void queroDescer() {
        descer = true;
        System.out.println("Chamando elevador para descer");
    }
    
    /**
     * Método que verifica se alguém no piso quer descer.
     */
    public void isQueroDescer() {
        if (descer == true) {
            System.out.println("Pessoas no piso querem descer");
        } else {
            System.out.println("Ninguém no piso quer descer");
        }
    }

    /**
     * Método que imprime a situação atual do piso.
     */
    public void situaçãoAtual() {
        if (subir == false && descer == false) {
            System.out.printf(" %d△▽", andar);
        } else if (subir == true && descer == false) {
            System.out.printf(" %d▲▽", andar);
        } else if (subir == false && descer == true) {
            System.out.printf(" %d ⃤ ▼", andar);
        } else if (subir == true && descer == true) {
            System.out.printf(" %d▲▼", andar);
        }
    }

    /**
     * Método que define o próximo piso e conecta o piso atual ao próximo.
     */
    public void setPróximoPiso(Piso proximoPiso) {
        this.pisoAcima = proximoPiso; // Define o próximo piso como pisoAcima do piso atual
        if (proximoPiso != null) {
            proximoPiso.pisoAnterior = this; // Conecta o piso atual como pisoAnterior do próximo piso
        }
    }

    public Piso getPróximoPiso() {
        return pisoAcima;
    }

    public Piso getPisoAnterior() {
        return pisoAnterior;
    }

    public void solicitarParada() {
        System.out.println("Parada solicitada");
        paradaSolicitada = true;
    }

    /**
     * Método que verifica se uma parada foi solicitada neste piso.
     */
    public void isParadaSolicitada() {
        if (paradaSolicitada == true) {
            System.out.println("Uma parada foi solicitada neste piso");
        } else {
            System.out.println("Sem parada solicitada neste piso");
        }
    }

    public void mover(Elevador elevador) {
        
    }

    public void receberElevador(Elevador elevador) {
        
    }
}
