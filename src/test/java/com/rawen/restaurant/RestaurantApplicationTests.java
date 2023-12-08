package com.rawen.restaurant;

import java.util.Date;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.rawen.restaurant.entities.Plat;
import com.rawen.restaurant.entities.Style;
import com.rawen.restaurant.repos.RestaurantRepository;
@ExtendWith(SpringExtension.class)
@Import(TestConfig.class)
@SpringBootTest
class RestaurantApplicationTests {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Test
    public void testCreatePlat() {
        Plat plat = new Plat(" ", 0, new Date());
        restaurantRepository.save(plat);
    }
	@Test
	public void testFindPlatBysonId()
	{

		Plat p =restaurantRepository.findById(8L).get();
			System.out.println(p);
}
	@Test
	public void testListerTousPlats()
	{
	List<Plat> plats =restaurantRepository.findAll();
	for (Plat p : plats)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testUpdatePlat()
	{
	Plat p =restaurantRepository.findById(19L).get();
	p.setPrixPLat(60000);
	p.setNomPLat("Salade César");
	restaurantRepository.save(p);
	System.out.println(p);
	
	}
	@Test
	public void testDeletePlat()
	{
		restaurantRepository.deleteById(28L);;
	}
	@Test

	public void testFindPlatByNom()
	{
		List<Plat> plats=restaurantRepository.findByNomPLat("Couscous");
		for(Plat p:plats)
		System.out.println(p);
	}
	@Test
    public void testFindPLatByNomContains() {
        List<Plat> plats = restaurantRepository.findByNomPLatContains("Lasagne");
        for (Plat p : plats)
            System.out.println(p);
    }
	@Test
	public void testfindByNomPrix()
	{
	List<Plat> plats = restaurantRepository.findByNomPrix("Couscous",50000.0 );
	for (Plat p : plats)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByStyle() {
	    Style style = new Style();
	    style.setIdStyle(1L);
	    
	    List<Plat> plats = restaurantRepository.findByStyle(style);
	    
	    for (Plat p : plats) {
	        System.out.println(p);
	    }
	}


	@Test
	public void testFindByStyleIdStyle() {
	    List<Plat> plats = restaurantRepository.findByStyle_IdStyle(1L);
	    for (Plat p : plats) {
	        System.out.println(p);
	    }
	}
	@Test
	public void testfindByOrderByNomPLatAsc()
	{
	List<Plat> plats = 
	restaurantRepository.findByOrderByNomPLatAsc();
	for (Plat p : plats)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Plat> plats = restaurantRepository.trierPlatsNomsPrix();
	for (Plat p : plats)
	{
	System.out.println(p);
	}
	}


	


}
	
