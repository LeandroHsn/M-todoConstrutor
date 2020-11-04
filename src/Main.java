public class Main {
    public static void main(String[] args) throws Exception {
    
    Armario armario = new Armario("Calça preta","Moletom amarelo");

    System.out.println(armario.getRoupa());
    System.out.println(armario.getGuardar());

    armario.setRoupa("Blusa Branca");
    armario.setGuardar("Blusa Preta");    

    System.out.println(armario.getRoupa());
    System.out.println(armario.getGuardar());    
          
}
}

