public abstract class contapoupanca extends contadigital {
    private double taxaDeJuros;

    public contapoupanca() {
        super(); 
    }

    public contapoupanca(String titular, double taxaDeJuros) {
        super(titular); 
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public void setSaldo(double saldo) {
    }
}
