package activiti.spring.javnaNabavka.springweb.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

@Service("PostavljanjeTajmeraService")
public class PostavljanjeTajmeraService{
			
			public String setujTajmer(){
				
				Date currentDate = new Date();
				currentDate.setMinutes(currentDate.getMinutes() + 2);
				
				System.out.println("a saddd current date je : " + currentDate);
				TimeZone tz = TimeZone.getTimeZone("UTC");
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
				df.setTimeZone(tz);
				String otvorenePrijave = df.format(currentDate);
				
				System.out.println("Vreme pre splita : " + otvorenePrijave);
				String [] niz = otvorenePrijave.split("\\+");
				
				String vreme = niz[0];
				
				System.out.println("Vreme splitovano " + vreme);
				
				return vreme;
			}
			
			
		
}
