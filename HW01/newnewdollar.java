package HW01;

import java.io.IOException;
import java.util.Scanner;

public class newnewdollar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		FileWriterClass fw = new FileWriterClass();
		exchangeType tp = new exchangeType();
		
		fw.headerWrite();
		while(true) {
			tp.inputWon = inputConsole.inputWon();
			tp.inputType = inputConsole.inputType();

			if (tp.inputType == ConstValueClass.EX_TYPE_USD) {
				tp.Resultwon = pc.changeUSD(tp.inputWon);
				tp.exchangewon = pc.exchangeUSD(tp.inputWon);
				fw.dataWrite("USD", tp.inputWon, tp.Resultwon, tp.exchangewon);
				pc.divideUSD();
				pc.exchange();
				
			} else if (tp.inputType == ConstValueClass.EX_TYPE_EUR) {
				tp.Resultwon = pc.changeEUR(tp.inputWon);
				tp.exchangewon = pc.exchangeEUR(tp.inputWon);
				fw.dataWrite("EUR", tp.inputWon, tp.Resultwon, tp.exchangewon);
				pc.divideEUR();
				pc.exchange();
				
			} else if (tp.inputType == ConstValueClass.EX_TYPE_JPY) {
				tp.Resultwon = pc.changeJPY(tp.inputWon);
				tp.exchangewon = pc.exchangeJPY(tp.inputWon);
				fw.dataWrite("JPY", tp.inputWon, tp.Resultwon, tp.exchangewon);
				pc.divideJPY();
				pc.exchange();
				
			} else if (tp.inputType == ConstValueClass.EX_TYPE_EXIT) {
				break;
			}
		}
		fw.fileClose();

	}

}
