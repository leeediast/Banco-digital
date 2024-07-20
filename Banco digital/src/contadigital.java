        public abstract class contadigital {
            private String numero;
            private double saldo;
        
            public contadigital(String numero) {
                this.numero = numero;
                this.saldo = 0;
            }
        
            public contadigital() {
                        }

            public String getNumero() {
                return numero;
            }
        
            public double getSaldo() {
                return saldo;
            }
        
            public void depositar(double valor) {
                if (valor > 0) {
                    saldo += valor;
                }
            }
        
            public abstract boolean sacar(double valor);
        
            public boolean transferir(contadigital destino, double valor) {
                if (sacar(valor)) {
                    destino.depositar(valor);
                    return true;
                }
                return false;
            }
        
            @Override
            public String toString() {
                return "Conta{" +
                        "numero='" + numero + '\'' +
                        ", saldo=" + saldo +
                        '}';
            }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    protected abstract void setSaldo(double saldo2);
        }
    