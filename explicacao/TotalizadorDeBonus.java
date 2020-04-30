class TotalizadorDeBonus{
	
	private double total = 0;

	public void adicionaBonus(Funcionario f){

		total += f.getBonus();
	}

	public double getTotal(){
		return this.total;
	}
}