package conversor_divisas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

//import org.json.JSONArray;
import org.json.JSONObject;

public class Peticion {
	
//	static String from ="MXN";
//	static String to ="USD";
//	static String amount = "1";
	
	
	public static void main(String[] args) {
//			peticion(String, args, args);
		
	}
		
		public static double peticion(String from, String to, String amount) {
			//Api key OQ5LJCEfTJfkpLpVp04nkVSzs8yUp464
			double valor_conversion = 0;
			final String apiKey = "OQ5LJCEfTJfkpLpVp04nkVSzs8yUp464";
			
			
			try {
				
				URL url = new URL("https://api.apilayer.com/exchangerates_data/convert?to=" + to + "&from=" + from + "&amount=" + amount + "&apikey=" + apiKey);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();
				
				int responseCode = connection.getResponseCode();
				
				if(responseCode != 200) {
					
					throw new RuntimeException("Ocurrio un error: " + responseCode);
					
				}else {
					StringBuilder informationString = new StringBuilder();
					Scanner scanner = new Scanner(url.openStream());
					
					while(scanner.hasNext()) {
						informationString.append(scanner.nextLine());
					}
					
					scanner.close();
					
//					System.out.println(informationString);
					
					//JSONArray jsonArray = new JSONArray(informationString.toString());
					//JSONObject jsonObject = jsonArray.getJSONObject(0);
					JSONObject jsonObject = new JSONObject(informationString.toString());
					valor_conversion = jsonObject.getDouble("result");
//					System.out.println(valor_conversion);
					
				}
					
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return valor_conversion;
		
	}

}
