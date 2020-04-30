class TestaFuncionario{
	public static void main(String[] args){

	   Funcionario joao = new Funcionario();

	   joao.setSalario(1000.0);

	   System.out.println(joao.getBonus());

	   Gerente jose = new Gerente();

	   jose.setSalario(2000.0);

	   System.out.println(jose.getBonus());

	   Desenvolvedor edu = new Desenvolvedor();

	   edu.setSalario(10000.0);

	   System.out.println(edu.getBonus());

	   TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
	   	    totalizador.adicionaBonus(joao);
	   	    totalizador.adicionaBonus(jose);
	   	    totalizador.adicionaBonus(edu);

	   	    System.out.println(totalizador.getTotal());
	   
	}
}