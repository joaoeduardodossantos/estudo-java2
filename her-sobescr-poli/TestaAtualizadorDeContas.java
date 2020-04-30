class TestaAtualizadorDeContas{
	
	public static void main(String[] args){
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000.0);
		cc.deposita(1000.0);
		cp.deposita(1000.0);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());

	}


}