import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {

        Feriados feriados = new Feriados();

        System.out.println("Buscando feriado escolhido");
        TimeUnit.MILLISECONDS.sleep(1000);

        feriados.setFeriado("15/11/2023");

        System.out.println(feriados.feriadoEscolhido(feriados.getFeriado()));

        System.out.println(" ");
        TimeUnit.MILLISECONDS.sleep(1000);

        System.out.println("Buscando todos os feriados");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println(feriados.todosOsFeriados()); 
    }

}
