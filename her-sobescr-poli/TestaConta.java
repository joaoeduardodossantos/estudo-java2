class TestaConta {
	
	public static void main(String[] args){

		Conta conta = new Conta();

		conta.deposita(1000.0);

		//conta.saca(1100.0);

		System.out.println(conta.getSaldo());
//---------------------------------------------------------------
		conta.atualiza(0.2);
		System.out.println(conta.getSaldo());
//---------------------------------------------------------------

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000.0);
		cc.atualiza(0.2);
		System.out.println(cc.getSaldo());		

//---------------------------------------------------------------
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(1000.0);
		cp.atualiza(0.2);
		System.out.println(cp.getSaldo());
	}
}