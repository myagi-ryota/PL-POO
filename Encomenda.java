import java.time.LocalDate;

import java.time.LocalDate;

public class Encomenda {
    
    private String nomeCliente;
    private int nfiscalCliente;
    private String moradaCliente;
    private int nEncomenda;
    private LocalDate data;
    private int lecapacity = 20;
    private int leindex = 0;
    private LinhaEncomenda[] linhasEncomenda = new LinhaEncomenda[lecapacity];

    public Encomenda(){
        this.nomeCliente = "";
        this.nfiscalCliente = -1;
        this.moradaCliente = "";
        this.nEncomenda = -1;
        this.data = LocalDate.of(1500, 1, 1);
    }

    public Encomenda(String nome, int nfiscal, String morada, int nEncomenda, LocalDate data, LinhaEncomenda[] arrLinhaEncomendas){
        this.nomeCliente = nome;
        this.nfiscalCliente = nfiscal;
        this.moradaCliente = morada;
        this.nEncomenda = nEncomenda;
        this.data = data;
        this.linhasEncomenda = arrLinhaEncomendas;
    }
}
