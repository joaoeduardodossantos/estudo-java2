class Conta {
	protected double saldo;

	public double getSaldo(){
		return this.saldo;
	}

	public void deposita(double valor){
		this.saldo += valor;
	}

	public void saca(double valor){ 
		if (this.saldo < valor){
			System.out.println("Saldo insuficiente para o saque!");
		} else {
			this.saldo -= valor;
		}
	}

	public void atualiza(double valor){
		this.saldo += this.saldo * valor;
	}
}