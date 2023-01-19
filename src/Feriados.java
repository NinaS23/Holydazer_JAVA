import java.util.ArrayList;
import java.util.List;

public class Feriados {

    String[] datas = new String[]{
    "01/01/2023", 
    "21/02/2023",
    "17/04/2023",
    "21/04/2023",
    "01/05/2023",
    "08/06/2023",
    "07/09/2023",
    "12/10/2023",
    "02/11/2023",
    "15/11/2023",
    "25/12/2023" 
};

String[] feriadosNomes = new String[]{
    "Confraternização mundial", 
    "Carnaval",
    "Páscoa",
    "Tiradentes",
    "Dia do trabalho",
    "Corpus Christi",
    "Independência do Brasil",
    "Nossa Senhora Aparecida",
    "Finados",
    "Proclamação da República",
    "Natal" 
};


private String feriadoEscolhido;

public String getFeriado() {
    return this.feriadoEscolhido;
 }

public void setFeriado(String feriadoEscolhido) {
    this.feriadoEscolhido = feriadoEscolhido;
}


public String feriadoEscolhido(String feriadoEscolhido) {
    
    for (int i = 0; i < datas.length; i++) {
        if (datas[i] == feriadoEscolhido) {
            return " nome do feriado: " + feriadosNomes[i] + " |  data do feriado: " + datas[i];
        }
        
    }
    return "feriado não existe!";
}


public List<String> todosOsFeriados() {
    List<String> listaDeFeriados = new ArrayList<>();

        for (int i = 0; i < datas.length; i++){
            listaDeFeriados.add(feriadosNomes[i] + " corresponde a data: " + datas[i]  );
        }

        return listaDeFeriados;
}

}
