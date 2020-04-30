class ContaPoupanca extends Conta {
	
	public void atualiza(double valor){
		this.saldo += this.saldo * valor * 3;
	}

	public void deposita(double valor){
		this.saldo = (this.saldo + valor) - 0.10;
	}
}