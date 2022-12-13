import java.util.Arrays;

public class Matriz {
    public Double[][] dados = new Double[48][2];
    public boolean crescente = true;
    public void adicionar_dados(int valor_max) {
        for (int i = 0; i < dados.length; i++) {
            dados[i][0] = i+1.0;
            dados[i][1] = Math.round((Math.random() * valor_max) * 10.0) / 10.0;
        }
        SortArray(dados, 1, crescente);
    }

    public Double[][] getDados() {
        return dados;
    }

    public static void SortArray(Double[][] dados, int col, boolean crescente) {
        if (crescente){
            Arrays.sort(dados, (a,b) -> a[col].compareTo(b[col]));
        }
        else {
            Arrays.sort(dados, (b,a) -> a[col].compareTo(b[col]));
        }
    }
}
