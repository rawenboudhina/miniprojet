package com.rawen.restaurant.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rawen.restaurant.entities.Plat;
import com.rawen.restaurant.service.PlatService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PlatRESTcontroller {
	@Autowired
	PlatService platService;
<<<<<<< HEAD
	@RequestMapping(path="all",method=RequestMethod.GET)
	public List<Plat> getAllPlats(){
		return platService.getAllPlats();
	}
	@RequestMapping(value="/getbyid/{idPlat}",method = RequestMethod.GET)
	public Plat getPlatById(@PathVariable("idPlat") Long idPlat) {
	return platService.getPlat(idPlat);
	 }
	@RequestMapping(value="/addPlat",method = RequestMethod.POST)
	public Plat createPlat(@RequestBody Plat plat) {
	return platService.savePlat(plat);
	}
	@RequestMapping(value="/updatePlat",method = RequestMethod.PUT)
	public Plat updatePlat(@RequestBody Plat plat) {
		return platService.updatePlat(plat);
	}
	@RequestMapping(value="/delPlat/{idPlat}",method = RequestMethod.DELETE)
=======
	@RequestMapping(method=RequestMethod.GET)
	public List<Plat> getAllPlats(){
		return platService.getAllPlats();
	}
	@RequestMapping(value="/{idPlat}",method = RequestMethod.GET)
	public Plat getPlatById(@PathVariable("idPlat") Long idPlat) {
	return platService.getPlat(idPlat);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Plat createProduit(@RequestBody Plat plat) {
	return platService.savePlat(plat);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Plat updateProduit(@RequestBody Plat plat) {
		return platService.updatePlat(plat);
	}
	@RequestMapping(value="/{idPlat}",method = RequestMethod.DELETE)
>>>>>>> 77b4930b6ee211b6f6fbe618b5488f368207ed03
	public void deletePlat(@PathVariable("idPlat") Long id)
	{
	platService.deletePlatById(id);
	}
	@RequestMapping(value="/platsStyle/{idStyle}",method = RequestMethod.GET)
<<<<<<< HEAD
	public List<Plat> getPlatsByStyleId(@PathVariable("idStyle") Long idStyle) {
=======
	public List<Plat> getProduitsByCatId(@PathVariable("idStyle") Long idStyle) {
>>>>>>> 77b4930b6ee211b6f6fbe618b5488f368207ed03
	return platService.findByStyleIdStyle(idStyle);   }
	@RequestMapping(value="/platsByName/{nom}",method = RequestMethod.GET)
	public List<Plat> findByNomPLatContains(@PathVariable("nom") String nom) {
	return platService.findByNomPLatContains(nom);
	}



}
