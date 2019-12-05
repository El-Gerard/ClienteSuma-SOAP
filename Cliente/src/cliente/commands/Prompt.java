package cliente.commands;

public class Prompt {

    public String agregarNum(java.lang.String num) {
        com.uniminuto.redsuma.WsSumaWil_Service service = new com.uniminuto.redsuma.WsSumaWil_Service();
        com.uniminuto.redsuma.WsSumaWil port = service.getWsSumaWilPort();
        return port.agregarNum(num);
    }

    public String pedirSuma() {
        com.uniminuto.redsuma.WsSumaWil_Service service = new com.uniminuto.redsuma.WsSumaWil_Service();
        com.uniminuto.redsuma.WsSumaWil port = service.getWsSumaWilPort();
        return port.pedirSuma();
    }  
}