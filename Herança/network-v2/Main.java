public class Main {
    public static void main(String[] args) {
    
        MessagePost mensagem = new MessagePost("jorge", "teste");
        EventPost event = new EventPost("Fran", "Fran entrou para o grupo 'Swifters Brazil'.");

        mensagem.printShortSummary();
        System.out.println(event.getEvent());
        event.printShortSummary();
        
    }
}
