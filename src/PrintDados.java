import java.time.Duration;
import java.time.LocalTime;

public class PrintDados {
    Temperatura temp = new Temperatura();
    Umidade umid = new Umidade();
    CO2 gas_cabornico = new CO2();

    public PrintDados() {


    }
    public void print_temperatura() {
        separar_linha();
        System.out.println("    Dados da Temperatura    ");
        separar_linha();
        System.out.println("| MEDIÇÃO | HORÁRIO | TEMPERATURA |");
        for (int i = 0; i < temp.dados.length; i++) {
            System.out.printf("|    %02.0f   |  %s  |   %04.1f ºC   | %n", temp.dados[i][0],
                    horario(temp.dados[i][0]), temp.dados[i][1]);
        }
    }

    public void print_umidade() {
        separar_linha();
        System.out.println("    Dados da Umidade    ");
        separar_linha();
        System.out.println("| MEDIÇÃO | HORÁRIO | UMIDADE |");
        for (int i = 0; i < umid.dados.length; i++) {
            System.out.printf("|   %02.0f    |  %s  |  %04.1f %% | %n", umid.dados[i][0],
                    horario(umid.dados[i][0]), umid.dados[i][1]);
        }
    }

    public void print_CO2() {
        separar_linha();
        System.out.println("    Dados do Gás Carbônico    ");
        separar_linha();
        System.out.println("| MEDIÇÃO | HORÁRIO |  CO2   |");
        for (int i = 0; i < gas_cabornico.dados.length; i++) {
            System.out.printf("|   %02.0f    |  %s  | %04.1f %% | %n", gas_cabornico.dados[i][0],
                    horario(gas_cabornico.dados[i][0]), gas_cabornico.dados[i][1]);
        }
    }


    public String horario(Double n) {
        int t = (int) (Math.floor(n) * 30);
        return LocalTime.MIN.plus(Duration.ofMinutes(t)).toString();
    }

    public static void separar_linha() {
        String str = "---";
        System.out.println(str.repeat(25));
    }
}
