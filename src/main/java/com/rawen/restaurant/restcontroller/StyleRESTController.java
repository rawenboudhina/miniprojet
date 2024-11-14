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
import com.rawen.restaurant.entities.Style;
import com.rawen.restaurant.repos.StyleRepository;

@RestController
@RequestMapping("/api/Style")
@CrossOrigin("*")
public class StyleRESTController {
	@Autowired
	StyleRepository styleRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Style> getAllStyles()
	{
	return styleRepository.findAll();
	}
	@RequestMapping(value="/{idStyle}",method = RequestMethod.GET)
	public Style getStyleByIdStyle(@PathVariable("idStyle") Long idStyle){
		return styleRepository.findById(idStyle).get();
}	
	//@RequestMapping(value="/addStyle",method = RequestMethod.POST)
	//public Style addStyleByIdStyle(@PathVariable("idStyle") Long idStyle){
		//return styleRepository.findById(idStyle).get();
//}	
	@RequestMapping(value="/addStyle",method = RequestMethod.POST)
	public Style addStyleByIdStyle(@RequestBody Style style){
		return styleRepository.save(style);
}	

	}

	

