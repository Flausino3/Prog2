/**
 * Programa de exemplo demonstra o uso das classes Horario e Parquimetro.
 * O programa cria instâncias dessas classes para demonstrar alguns dos seus funcionamentos.
 */

public class Main {
    public static void main(String[] args) {

        // Criando um objeto Horario
        Horario horario = new Horario(10, 30);

        // Adiando o horário em 45 minutos
        horario.adiarHorario(45);

        // Mostrando o horário final
        System.out.println("Horário Final: " + horario.mostrarHorario());

        // Criando um objeto Parquimetro para área normal
        Parquimetro parquimetroNormal = new Parquimetro(5, 1, 120);

        // Inserindo dinheiro no parquímetro
        parquimetroNormal.inserirDinheiro(100);

        // Aumentando o tempo de estacionamento
        parquimetroNormal.aumentarTempo();

        // Imprimindo o ticket
        parquimetroNormal.imprimirTicket(12, 0);

        // Devolvendo troco, se houver
        int troco = parquimetroNormal.devolverTroco();
        System.out.println("Troco devolvido: " + troco + " centavos");

        // Esvaziando o parquímetro
        int totalAcumulado = parquimetroNormal.esvaziar();
        System.out.println("Total acumulado no parquímetro: " + totalAcumulado + " centavos");
    }
}
