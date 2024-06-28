import java.util.List;

public class Banco {

	private String nome;
	private Integer numero;
	private List<Conta> contas;
	
	public Banco(String nome, Integer numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void relatorioClientes(){
		if (!contas.isEmpty()){
			System.out.println("Banco: " + getNome() + ", Numero: " + getNumero() + ", Total Clientes: " + contas.size());
			System.out.println("===================================================");
			for (Conta c: contas) {
				System.out.println("Conta No. "+ c.getNumero() + " Agencia: " + c.getAgencia());
				System.out.println(String.format("Titular: %s", c.getNomeCliente()));
				System.out.println(String.format("Saldo: %.2f", c.getSaldo()));
				System.out.println("---------------------------------------------------\n");
			}
		}
	}

}
