package ExchangeMoney;

public class ProcessingClass {
	OutputClass op = null;
	exchangeType tp = null;
	
	ProcessingClass() {
		op = new OutputClass();
		tp = new exchangeType();
	}
	int changeWon = 0;
	double exchangeResult;
	double changeMoney;
	
	public int changeUSD(double inputwon) {
		int changeUSD = (int)(inputwon / ConstValueClass.EX_RATE_USD);
		return changeUSD;//환전금액
	}
	
	public int changeEUR(double won) {
		int changeEUR = (int)(won / ConstValueClass.EX_RATE_EUR);
		return changeEUR;//환전금액
	}
	
	public int changeJPY(double won) {
		int changeJPY = ((int)(won / ConstValueClass.EX_RATE_JPY / 1000)) * 1000;
		return changeJPY;//환전금액
	}
	
	public int exchangeUSD(double won) {
		exchangeResult = won / ConstValueClass.EX_RATE_USD;
		changeMoney = ((exchangeResult - (int)exchangeResult) * ConstValueClass.EX_RATE_USD) / 10;
		changeWon = ((int)(changeMoney) * 10);
		return changeWon;
	}

	public int exchangeEUR(double won) {
		exchangeResult = won / ConstValueClass.EX_RATE_EUR;
		changeMoney = ((exchangeResult - (int)exchangeResult) * ConstValueClass.EX_RATE_EUR) / 10;
		changeWon = ((int)(changeMoney) * 10);
		return changeWon;
	}
	
	public int exchangeJPY(double won) {
		exchangeResult = won / ConstValueClass.EX_RATE_JPY;
		changeMoney = (((exchangeResult / 1000) - ((int)(exchangeResult / 1000))) * 1000 * ConstValueClass.EX_RATE_JPY) / 10;
		changeWon = ((int)(changeMoney) * 10);
		return changeWon;
	}
	
	public void exchange() {
		int won1000, won500, won100, won50, won10;
		
		won1000 = changeWon / 1000;
		won500 = changeWon % 1000 / 500;
		won100 = changeWon % 1000 % 500 / 100;
		won50 = changeWon % 1000 % 500 % 100 / 50;
		won10 = changeWon % 1000 % 500 % 100 % 50 / 10;
		
		op.printExchange(changeWon, won1000, won500, won100, won50, won10);
		
	}
	public void divideUSD() {
		int usd100, usd50, usd20;
		int usd10, usd5, usd2, usd1;
		
		usd100 = (int)exchangeResult / 100;
		usd50 = (int)exchangeResult % 100 / 50;
		usd20 = (int)exchangeResult % 100 % 50 / 20;
		usd10 = (int)exchangeResult % 100 % 50 % 20 / 10;
		usd5 = (int)exchangeResult % 100 % 50 % 20 % 10 / 5;
		usd2 = (int)exchangeResult % 100 % 50 % 20 % 10 % 5 / 2;
		usd1 = (int)exchangeResult % 100 % 50 % 20 % 10 % 5 % 2;
		op.printExchangeUSD((int)exchangeResult, usd100, usd50, usd20, usd10, usd5, usd2, usd1);
	}
	
	public void divideEUR() {
		int eur500, eur200, eur100;
		int eur50, eur20, eur10; 
		int eur5, eur2, eur1;
		
		eur500 =  (int)exchangeResult / 500;
		eur200 =  (int)exchangeResult % 500 / 200;
		eur100 = (int)exchangeResult % 500 % 200 / 100;
		eur50 = (int)exchangeResult % 500 % 200 % 100 / 50; 
		eur20 = (int)exchangeResult % 500 % 200 % 100 % 50 / 20; 
		eur10 =  (int)exchangeResult % 500 % 200 % 100 % 50 % 20 / 10;
		eur5 =  (int)exchangeResult % 500 % 200 % 100 % 50 % 20 % 10 / 5;
		eur2 =  (int)exchangeResult % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2; 
		eur1 = (int)exchangeResult % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2;
		op.printExchangeEUR((int)exchangeResult, eur500, eur200, eur100, eur50, eur20, eur10, eur5, eur2, eur1);
	}
	
	public void divideJPY() {
		
		int jpy10000, jpy5000, jpy1000;
		jpy10000 = ((int)(exchangeResult / 1000) * 1000) / 10000;
		jpy5000 = ((int)(exchangeResult / 1000) * 1000) % 10000 / 5000;
		jpy1000 = ((int)(exchangeResult / 1000) * 1000) % 10000 % 5000 / 1000;
		op.printExchangeJPY(((int)(exchangeResult / 1000) * 1000), jpy10000, jpy5000, jpy1000);
		
	}
	

}
