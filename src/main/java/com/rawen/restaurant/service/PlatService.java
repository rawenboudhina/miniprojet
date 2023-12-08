package com.rawen.restaurant.service;

import java.util.List;

import com.rawen.restaurant.entities.Plat;
import com.rawen.restaurant.entities.Style;

public interface PlatService {
	Plat savePlat(Plat p);
	Plat updatePlat(Plat p);
	void deletePlat(Plat p);
	 void deletePlatById(Long id);
	Plat getPlat(Long id);
	List<Plat> getAllPlats();
	List<Plat> findByNomPLat(String nom);
	List<Plat> findByNomPLatContains(String nom);
	List<Plat> findByNomPrix (String nom, Double prix);
	List<Plat> findByStyle (Style style);
	List<Plat> findByStyleIdStyle(Long id);
	List<Plat> findByOrderByNomPLatAsc();
	List<Plat> trierPlatsNomsPrix();

}
