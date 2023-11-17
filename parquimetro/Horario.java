
/**
 * Classe que representa um horário com horas e minutos.
 * Classe utilizada no método imprimirTicket da classe parquimetro.
 */
public class Horario{

    // Atributos
    private int horas;             // Armazena a parte da hora do horário.
    private int minutos;           // Armazena a parte dos minutos do horário.
    public String horarioFinal;    // Armazena o horário final como uma string.

    /**
     * Construtor da classe Horario.
     * @param horaAtual A hora inicial.
     * @param minutoAtual Os minutos iniciais.
     */
    public Horario(int horaAtual, int minutoAtual){
        horas = horaAtual;
        minutos = minutoAtual;          
    }            

    /**
     * Adia o horário em um número específico de minutos.
     */
    public void adiarHorario(int adiarMinutos){
        int totalEmMinutos = minutos + (horas * 60) + adiarMinutos;
        minutos = totalEmMinutos % 60;
        horas = totalEmMinutos / 60;
    }

    /**
     * Retorna uma string que representa o horário no formato "HH:MM".
     */
    public String mostrarHorario(){
        return String.format("%02d:%02d", horas, minutos);
    }
}