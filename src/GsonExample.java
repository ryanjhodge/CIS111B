import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import gov.usgs.itis.itis_service.data.*;

import com.google.gson.Gson;

public class GsonExample {
    public static void main(String[] args) {
 
	
 
	try {
		URL url = new URL("http://www.itis.gov/ITISWebService/jsonservice/searchByCommonName?srchKey=dolphin");
		InputStream urlInputStream = url.openConnection().getInputStream();
		BufferedReader br = new BufferedReader(
			new InputStreamReader(urlInputStream, "UTF-8"));
		StringBuilder sb = new StringBuilder();
		 
		String line;
		
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		
		System.out.println(sb.toString());
		Gson gson = new Gson();
		SvcCommonNameList joc = new SvcCommonNameList();
		joc = gson.fromJson(sb.toString(), SvcCommonNameList.class);
		for (CommonNames name: joc.getCommonNames()) {
			System.out.println(name.getCommonName());
		}
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
    }
}