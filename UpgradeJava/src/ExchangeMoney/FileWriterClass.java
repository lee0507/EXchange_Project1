package ExchangeMoney;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriterClass {
	private FileWriter fw;
	private boolean isFileExist;
	
	public FileWriterClass() {
		try {
			File file = new File("D:\\exchangeresult\\exchange.csv");
			
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
			fw = new FileWriter("D:\\exchangeresult\\exchange.csv", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileClose() {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void headerWrite() throws IOException {
		String head = "날짜," + "환전대상," + "금액," + "환전결과," + "거스름돈," + "\n";
		if (isFileExist == false) {
			fw.write(head);
		}

	}
	
	public void dataWrite(String exchangetype, double inputwon, int won, int exchangewon) throws IOException {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = sf.format(c.getTime()) + "," + exchangetype + "," + inputwon + "," + won + "," + exchangewon + "\n";
		fw.write(result);
	}
}
