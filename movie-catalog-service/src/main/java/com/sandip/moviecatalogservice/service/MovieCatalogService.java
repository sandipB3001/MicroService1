package com.sandip.moviecatalogservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sandip.moviecatalogservice.model.CatalogItem;

public interface MovieCatalogService {

	public List<CatalogItem> getMovieCatalog(String userId);
}
