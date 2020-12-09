package com.cyber.catalog.io.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cyber.catalog.io.entity.CatalogItem;

@Repository
public interface CatalogItemRepository extends JpaRepository<CatalogItem, Long>{
	
	//get all province where idGroup=1 and item =0 and idParent=0
	@Query(value = " select c.nameItem from catalog_item  c where c.idGroup = 1 and c.item = 0 and c.idParent= 0 ")
	List<String> findAllProvince();

	// get Id of province by name
	@Query(value = " select x.id from catalog_item x where x.idGroup = 1 and x.idParent = 0 and x.nameItem = :name ")
	long findIdByNameItem(@Param("name") String name);
	
	//get all district in city
	
	@Query(" select x.nameItem from catalog_item x "
			+ " where x.idGroup = 1 and x.idParent = "
			+ " (select y.id from catalog_item y where y.idGroup = 1 and y.idParent = 0 and y.nameItem = :city )")
	List<String> getAllDistrictByCity(@Param("city") String city);
	
	
	//get all ward by district
	@Query("select x.nameItem from catalog_item x \r\n"
			+ " where x.idGroup = 1  and x.idParent = \r\n"
			+ "(select y.id from catalog_item y where y.idGroup = 1 and y.item = 1 and y.nameItem = :district )")
	List<String> getAllWardByDistrict(@Param("district") String district);
	
	
	
	
	
	
	
	

}
