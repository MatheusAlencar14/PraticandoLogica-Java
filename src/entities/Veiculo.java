package entities;

public class Veiculo {

    private double valor;
    private int ano;

    public Veiculo(double valor, int ano) {
        this.valor = valor;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double desconto() {
        if (ano <= 2000) {
            return valor * 0.12;
        } else {
            return valor * 0.07;
        }
    }

    public double totalPagar() {
        if (ano <= 2000) {
            return valor - (valor * 0.12);
        } else {
            return valor - (valor * 0.07);
        }
    }

    @Override
    public String toString() {
        return " (" + ano + ") Desconto: R$ " + String.format("%.2f", desconto())
                + ", Total a pagar: R$ " + String.format("%.2f", totalPagar());
    }
}
