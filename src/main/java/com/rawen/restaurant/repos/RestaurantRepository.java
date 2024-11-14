
package com.rawen.restaurant.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rawen.restaurant.entities.Plat;
import com.rawen.restaurant.entities.Style;
@RepositoryRestResource(path = "rest")

public interface RestaurantRepository extends JpaRepository<Plat, Long> {
	List<Plat> findByNomPLat(String nom);
	List<Plat> findByNomPLatContains(String nom);
	@Query("SELECT p FROM Plat p WHERE p.nomPLat LIKE %:nom% AND p.prixPLat > :prix")
	List<Plat> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);
	@Query("SELECT p FROM Plat p WHERE p.style = ?1")
	/*List<Plat> testfindByStyle(Style style);
	 */
	List<Plat> findByStyle(Style style);
	List<Plat> findByStyle_IdStyle(Long idStyle);
	List<Plat> findByOrderByNomPLatAsc();

	@Query("select p from Plat p order by p.nomPLat ASC, p.prixPLat DESC")
	List<Plat> trierPlatsNomsPrix ();
	Style save(Style s);




		
	}
