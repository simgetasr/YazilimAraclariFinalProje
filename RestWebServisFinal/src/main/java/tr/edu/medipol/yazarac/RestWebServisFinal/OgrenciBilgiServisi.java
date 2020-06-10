package tr.edu.medipol.yazarac.RestWebServisFinal;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/ogrenci")

public class OgrenciBilgiServisi {

	    private static List<Ogrenci> ogrenciListesi = new ArrayList<>();
	    static {
	        ogrenciListesi.add(new Ogrenci("Simge", 49));
	        ogrenciListesi.add(new Ogrenci("Kemal", 36));
	        ogrenciListesi.add(new Ogrenci("Beyda", 25));
	    }
	    
	    @GetMapping("/listele")
	    public List<Ogrenci> listele(){
	        return ogrenciListesi;
	    }
	    @PostMapping("/ogrenciekle")
	    public Ogrenci Ekle(@RequestBody Ogrenci ogrenci){
	    	ogrenciListesi.add(ogrenci);
			return ogrenci;
	    }
	    @PostMapping("/ogrencisil")
	    public Ogrenci sil(@RequestBody Ogrenci ogrenci){
	    	ogrenciListesi.remove(ogrenci);
			return ogrenci;
	    }
	    
	}

