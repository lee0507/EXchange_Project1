package HW01;

public class OutputClass {
	
	public void printExchangeUSD(int usd, int usd100, int usd50, 
			 int usd20, int usd10, int usd5, 
			 int usd2, int usd1) {
		
		System.out.println("\n�޷� ���� : " + usd + " �޷�");
		System.out.println("100 �޷� : " + usd100 + " ��");
		System.out.println("50 �޷� : " + usd50 + " ��");
		System.out.println("20 �޷� : " + usd20 + " ��");
		System.out.println("10 �޷� : " + usd10 + " ��");
		System.out.println("5 �޷� : " + usd5 + " ��");
		System.out.println("2 �޷� : " + usd2 + " ��");
		System.out.println("1 �޷� : " + usd1 + " ��");
	}
	
	public void printExchangeEUR(int eur, int eur500, int eur200, int eur100, 
			 int eur50, int eur20, int eur10, 
			 int eur5, int eur2, int eur1) {
		
		System.out.println("\n���� ���� : " + eur + " ����");
		System.out.println("500 ���� : " + eur500 + " ��");
		System.out.println("200 ���� : " + eur200 + " ��");
		System.out.println("100 ���� : " + eur100 + " ��");
		System.out.println("50 ���� : " + eur50 + " ��");
		System.out.println("20 ���� : " + eur20 + " ��");
		System.out.println("10 ���� : " + eur10 + " ��");
		System.out.println("5 ���� : " + eur5 + " ��");
		System.out.println("2 ���� : " + eur2+ " ��");
		System.out.println("1 ���� : " + eur1 + " ��");
	}
	
	public void printExchangeJPY(int jpy, int jpy10000, int jpy5000, int jpy1000) {
		System.out.println("\n�� ���� : " + jpy + " ��");
		System.out.println("10000 �� : " + jpy10000 + " ��");
		System.out.println("5000 �� : " + jpy5000 + " ��");
		System.out.println("1000 �� : " + jpy1000 + " ��");
	}
	
	public void printExchange(int changeWon, int won1000, int won500,
			  int won100, int won50, int won10) {

		System.out.println("\n��ȭ �Ž��� : " + changeWon + " ��");
		System.out.println("1000�� : " + won1000 +" ��");
		System.out.println("500�� : " + won500 +" ��");
		System.out.println("100�� : " + won100 +" ��");
		System.out.println("50�� : " + won50 +" ��");
		System.out.println("10�� : " + won10 +" ��");
	}
	
}