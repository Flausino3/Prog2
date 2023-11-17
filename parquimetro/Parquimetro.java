public class Parquimetro {

    // Atributos
    private int preçoUnitario;      // Armazena quanto custa cada unidade de tempo solicitada.
    private int tempoSolicitado;    // Armazena o tempo total sendo solicitado.
    private int balanço;             // Quantidade de dinheiro já inserida pelo cliente.
    private int total;               // Quantidade total de dinheiro acumulado por este parquímetro.
    private int troco;               // Quantidade total de troco.
    private int area;                // Código de área, sendo "1" para áreas normais e "2" para áreas turísticas.
    private int tempoMaximo;         // Tempo máximo do ticket do parquímetro.
    private int totalAPagar;         // Preço total a ser pago de acordo com o tempo solicitado.

    /**
     * Constrói um novo objeto Parquimetro com o preço unitário configurado.
     * @param ticketMaximo Tempo máximo do ticket do parquímetro.
     */
    public Parquimetro(int preçoDaFração, int codigoArea, int ticketMaximo) {
        preçoUnitario = preçoDaFração;
        area = codigoArea;

        // Configuração do tempo inicial e preço total a ser pago de acordo com a área.
        if (area == 1) {
            tempoSolicitado = 15;
            totalAPagar = 50;
        } else if (area == 2) {
            tempoSolicitado = 60;
            totalAPagar = 150;
        } else {
            System.out.println("Código de área inválido, insira 1 para áreas normais e 2 para áreas turísticas ");
        }

        tempoMaximo = ticketMaximo; 
        balanço = 0;
        total = 0;
        troco = 0;
    }

    /**
     * Insere a quantia especificada de dinheiro no parquímetro.
     */
    public void inserirDinheiro(int quantia) {
        balanço = balanço + quantia;
    }

    /**
     * Aumenta o tempo solicitado em incrementos específicos e atualiza o preço total a ser pago.
     */
    public void aumentarTempo() {
        // Lógica para aumentar o tempo de estacionamento em incrementos específicos.
        // Atualiza também o preço total a ser pago.
    }

    /**
     * Imprime um ticket de estacionamento com informações sobre o início e o fim do tempo de estacionamento.
     * @param horaAtual A hora atual.
     * @param minutoAtual Os minutos atuais.
     */
    public void imprimirTicket(int horaAtual, int minutoAtual) {
        // Cria um objeto Horario para calcular o horário final.
        Horario horarioFinal = new Horario(horaAtual, minutoAtual);
        horarioFinal.adiarHorario(tempoSolicitado);

        // Lógica para imprimir o ticket com informações sobre o tempo de estacionamento.
        // Atualiza também o total, o tempo solicitado e o troco, se aplicável.
    }

    // Métodos Getters
    // ...

    /**
     * Devolve o troco ao cliente e ajusta o balanço.
     * @return O troco a ser devolvido.
     */
    public int devolverTroco() {
        balanço = balanço - troco;
        return troco;
    }

    /**
     * Esvazia o parquímetro, resetando o balanço e retornando o total acumulado.
     * @return O total acumulado no parquímetro.
     */
    public int esvaziar() {
        balanço = 0;
        return total;
    }
}