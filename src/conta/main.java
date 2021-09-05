package conta;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		contaBancaria c = new contaBancaria("123", "Thiago Lopes", 100.00);
		c.deposito(500.50);
		c.saque(200);
	}

}
