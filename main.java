import java.time.LocalDate;

public class main {
    public static void main(String[] args){
        Exercicio2 e2 = new Exercicio2();
        e2.insereData(LocalDate.of(2001, 7, 8));
        e2.insereData(LocalDate.of(2044, 7, 8));
        e2.insereData(LocalDate.of(2022, 7, 8));
        System.out.println(e2.toString());
        System.out.println(e2.dataMaisProxima(LocalDate.of(2005, 1, 1)).toString());
    }    
}
