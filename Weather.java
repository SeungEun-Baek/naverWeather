import java.io.*;
import java.net.*;

public class Weather {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://weather.naver.com/rgn/cityWetrCity.nhn?cityRgnCd=CT001019");
		//String encoding = "euc-kr";
		String encoding = "utf-8";

		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, encoding);
		BufferedReader br = new BufferedReader(isr);

		//System.out.println(isr.getEncoding());
		String line = "";
		while ((line = br.readLine()) != null) {
			if (line.contains("°­¼öÈ®·ü"))
				System.out.println(line);
		}
	}
}
