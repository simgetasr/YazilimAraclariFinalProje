package tr.edu.medipol.yazarac.RestWebServisFinal;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OgrenciBilgiTest {
	@Test
	public void Ogrenciliste() {
		//Given- Ön Koşullar
	List<String> ogrenciler = new ArrayList<>();
		 {
			 String Ogrenci1 ="Simge";
			 String Ogrenci2 ="Kemal";
			 String Ogrenci3 ="Beyda";
			 
				//When- Asil Test 
		
		ogrenciler.add(Ogrenci1);
		ogrenciler.add(Ogrenci2);
		ogrenciler.add(Ogrenci3);
			
		//Then- Kontroller
			assertEquals("Simge",Ogrenci1);
			assertEquals("Kemal",Ogrenci2);
			assertEquals("Beyda",Ogrenci3);
			
			
		}
		 
		
		
	}
	@Test

	//Given- Ön Koşullar

	public void   ogrenciekle() {
		List<String> ogrenciler = new ArrayList<>();{
			 String isim ="Kemal";
		 }
		//When- Asil Test 
		 
		 String Yeniogrenci="Mustafa";
		 
		 ogrenciler.add(Yeniogrenci);
		 
		 
			//Then- Kontroller
		 
		 assertEquals(Yeniogrenci,"Mustafa");
	   
	}
	@Test	
	public void ogrencisil() {
	
		//Given- Ön Koşullar
			List<String> ogrenciler = new ArrayList<>();
			 {
				 
				 String Ogrenci3 ="Beyda";
				 
				//When- Asil Test 
				 
				 ogrenciler.remove(Ogrenci3);
		    
				//Then- Kontroller
				 assertEquals(Ogrenci3,"Beyda");
			 }
	}
	
	



	
}