package com.cyber.catalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyber.catalog.io.repository.CatalogItemRepository;
import com.cyber.catalog.service.CatalogItemService;

@Service
public class CatalogItemServiceImp implements CatalogItemService {

	@Autowired
	CatalogItemRepository catalogItemRepository;

	@Override
	public List<String> findAllProvince() {
		return catalogItemRepository.findAllProvince();
	}

	@Override
	public long findIdByNameItem(String name) {
		long id=catalogItemRepository.findIdByNameItem(name);
		if (id == 0) {
			throw new RuntimeException("Province not found!");
		}
		return id;
	}

	@Override
	public List<String> getAllDistrictByCity(String city) {
		return catalogItemRepository.getAllDistrictByCity(city);
	}

	@Override
	public List<String> getAllWardByDistrict(String district) {
		return catalogItemRepository.getAllWardByDistrict(district);
	}

}
