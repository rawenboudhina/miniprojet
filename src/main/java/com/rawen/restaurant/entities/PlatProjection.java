package com.rawen.restaurant.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name= "nomPLat",types = { Plat.class })
public interface PlatProjection {
public String getNomPLat();
}
