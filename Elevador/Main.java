/**
 * Programa de exemplo demonstra o uso das classes Elevador e Piso.
 * O programa cria instâncias dessas classes para demonstrar alguns dos seus funcionamentos.
 */

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Piso
        Piso terreo = new Piso(0);
        Piso primeiroAndar = new Piso(1);
        Piso segundoAndar = new Piso(2);
        
        // Criando instância de Elevador
        Elevador elevador = new Elevador(terreo);
        
        // Conectando os pisos
        terreo.setPróximoPiso(primeiroAndar);
        primeiroAndar.setPróximoPiso(segundoAndar);

        // Testando operações
        // Chamando elevador para subir no primeiro andar
        primeiroAndar.queroSubir();
        primeiroAndar.isQueroSubir();

        // Movendo o elevador
        terreo.mover(elevador);

        // Abrindo a porta
        elevador.abrirPorta();

        // Solicitando parada no primeiro andar
        elevador.pararNoPiso(primeiroAndar);

        // Mostrando o painel do elevador
        elevador.mostrarPainel(terreo);

        // Fechando a porta e encerrando os testes
        elevador.fecharPorta();
    }
}
