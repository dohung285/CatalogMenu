package com.cyber.catalog.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyber.catalog.service.CatalogItemService;

@RestController
@RequestMapping("/api")
public class CatalogItemController {
	
	@Autowired
	CatalogItemService catalogItemService;
	
	//Lấy ra tất cả các thành phố
	@GetMapping(value = "/allProvince") //, produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
	public List<String> findAllProvince(){
		return catalogItemService.findAllProvince();
	}
	
	//Lấy ra id của thành phố
	@GetMapping(value = "/provinceId")
	public long findIdByNameItem(@RequestParam String name) {
		return catalogItemService.findIdByNameItem(name);
	}
	
	
	//Lấy ra danh sách các quận trong một thành phố
	@GetMapping(value = "/district")
	public List<String> getAllDistrictByCity(@RequestParam String city){
		return catalogItemService.getAllDistrictByCity(city);
	}

	//Lấy ra danh sách các phường trong một thành phố
	@GetMapping(value = "/ward")
	public List<String> getAllWardByDistrict(@Param("ward") String ward){
		return catalogItemService.getAllWardByDistrict(ward);
	}
	

}
