import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		// Criar bancos
		Banco bancobrasileiro = new Banco("Banco Brasileiro", 1);
		Banco bancointernet = new Banco("Banco Internet", 2);
		
		// Criar clientes dos bancos
		Cliente clientetrad1 = new Cliente("Joao", "12386747443");
		
		Cliente clientetrad2 = new Cliente("Jose", "2423424234");
		
		Cliente clienteinternet1 = new Cliente("Maria", "12345634532");
		
		Cliente clienteinternet2 = new Cliente("Roberto", "54376534523");

		Cliente clienteinternet3 = new Cliente("Vilma", "23476532123");

		// Criar contas dos clientes
		Conta contaclientetrad1 = new ContaCorrente(clientetrad1);
		Conta contaclientetrad2 = new ContaPoupanca(clientetrad2);

		Conta contaclienteinternet1 = new ContaCorrente(clienteinternet1);
		Conta contaclienteinternet2 = new ContaPoupanca(clienteinternet2);
		Conta contaclienteinternet3 = new ContaCorrente(clienteinternet3);

		// Adicionar contas aos bancos
		ArrayList<Conta> listacontastrad =  new ArrayList<Conta>();
		listacontastrad.add(contaclientetrad1);
	    listacontastrad.add(contaclientetrad2);		
		bancobrasileiro.setContas(listacontastrad);
		
		ArrayList<Conta> listacontasinternet = new ArrayList<Conta>();
		listacontasinternet.add(contaclienteinternet1);
		listacontasinternet.add(contaclienteinternet2);
		listacontasinternet.add(contaclienteinternet3);
		bancointernet.setContas(listacontasinternet);		
		
		// Popular valores em contas
		contaclientetrad1.depositar(1000);
		contaclientetrad1.transferir(500, contaclientetrad2);
		
		contaclienteinternet1.depositar(100);
		contaclienteinternet1.transferir(25, contaclienteinternet2);

		contaclienteinternet3.depositar(300);
		
		//Imprimir relatorio de bancos
		bancobrasileiro.relatorioClientes();
		
		bancointernet.relatorioClientes();
		
	}

}
