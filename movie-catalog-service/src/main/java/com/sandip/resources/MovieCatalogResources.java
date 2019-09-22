package com.sandip.resources;

import java.util.Collections;
import java.util.List;

//import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sandip.model.CatalogItem;

@RestController
@RequestMapping(value="/catalog")
public class MovieCatalogResources {

	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
	{
		return Collections.singletonList(
				new CatalogItem("3 Idiots","Test",5)	
			);
	}
}
