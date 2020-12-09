package com.cyber.catalog.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

public interface CatalogItemService {

	List<String> findAllProvince();
	
	long findIdByNameItem(String name);
	
	List<String> getAllDistrictByCity(String city);
	
	List<String> getAllWardByDistrict( String district);

}
