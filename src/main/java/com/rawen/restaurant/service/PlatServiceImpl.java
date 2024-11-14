package com.rawen.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rawen.restaurant.entities.Plat;
import com.rawen.restaurant.entities.Style;
import com.rawen.restaurant.repos.RestaurantRepository;
@Service
public class PlatServiceImpl implements PlatService{
	@Autowired
	
RestaurantRepository restaurantRepository;

	@Override
	public Plat savePlat(Plat p) {
		
		return restaurantRepository.save(p);
	}

	@Override
	public Plat updatePlat(Plat p) {
		
		return restaurantRepository.save(p);

	}

	@Override
	public void deletePlat(Plat p) {
		restaurantRepository.delete(p);

		
	}

	@Override
	public void deletePlatById(Long id) {
		restaurantRepository.deleteById(id);
	}

	@Override
	public Plat getPlat(Long id) {
		return restaurantRepository.findById(id).get();
	}

	@Override
	public List<Plat> getAllPlats() {
		return restaurantRepository.findAll();
	}

	@Override
	public List<Plat> findByNomPLat(String nom) {
		
		return restaurantRepository.findByNomPLat(nom);
	}

	@Override
	public List<Plat> findByNomPLatContains(String nom) {
		return restaurantRepository.findByNomPLatContains(nom);
	}

	@Override
	public List<Plat> findByNomPrix(String nom, Double prix) {
	
		return restaurantRepository.findByNomPrix(nom, prix);
	}
	

	@Override
	public List<Plat> findByStyleIdStyle(Long id) {
		// TODO Auto-generated method stub
		return restaurantRepository.findByStyle_IdStyle(id);
	}

	@Override
	public List<Plat> findByOrderByNomPLatAsc() {
		return restaurantRepository.findByOrderByNomPLatAsc();
	}

	@Override
	public List<Plat> trierPlatsNomsPrix() {
	
		return restaurantRepository.trierPlatsNomsPrix();
	}

	@Override
	public List<Plat> findByStyle(Style style) {
	
		return restaurantRepository.findByStyle(style);
	}
	@Override
	public Style createStyle(Style s) {
		
		return restaurantRepository.save(s);

	}

	

}
