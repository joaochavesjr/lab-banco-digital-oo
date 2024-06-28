
public interface InternetConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, InternetConta contaDestino);
	
	void imprimirExtrato();
}
