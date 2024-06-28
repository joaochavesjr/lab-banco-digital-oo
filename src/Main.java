
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Criar bancos
		Banco bancobrasileiro = new Banco("Banco Brasileiro", 1);
		Banco bancointernet = new Banco("Banco Internet", 2);
		
		// Criar clientes dos bancos
		Cliente clientetrad1 = new Cliente();
		clientetrad1.setNome("Joao");
		clientetrad1.setCpf("12312312312312");
		
		Cliente clientetrad2 = new Cliente();
		clientetrad2.setNome("Jose");
		clientetrad2.setCpf("43235312312312");
		
		Cliente clienteinternet1 = new Cliente();
		clienteinternet1.setNome("Maria");
		clienteinternet1.setCpf("23245312312312");
		
		Cliente clienteinternet2 = new Cliente();
		clienteinternet2.setNome("Roberto");
		clienteinternet2.setCpf("32345312312312");

		Cliente clienteinternet3 = new Cliente();
		clienteinternet3.setNome("Vilma");
		clienteinternet3.setCpf("67676767634344");

		// Criar contas dos clientes
		Conta contaclientetrad1 = new ContaCorrente(clientetrad1);
		Conta contaclientetrad2 = new ContaPoupanca(clientetrad2);

		Conta contaclienteinternet1 = new ContaCorrente(clienteinternet1);
		Conta contaclienteinternet2 = new ContaPoupanca(clienteinternet2);
		Conta contaclienteinternet3 = new ContaCorrente(clienteinternet3);

		// Adicionar contas aos bancos
		ArrayList<Conta> listacontastrad = new ArrayList<Conta>();
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
