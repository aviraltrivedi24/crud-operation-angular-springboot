package com.crud.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.domain.Entidy;
import com.crud.service.EntityService;

@RestController
@RequestMapping("/api/entities")
public class EntityController {

	Logger logger = LogManager.getLogger();
	
	@Autowired
	private EntityService entityService;
	
	
	public EntityController(EntityService entityService) {
		this.entityService = entityService;
	}


	@RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
	public Iterable<Entidy> list(){
		logger.info(this.entityService.list());
		return this.entityService.list();
	}
	
	@PostMapping(value = {"/save"})
	public Entidy saveEntidy(@RequestBody Entidy entidy) {
		return this.entityService.save(entidy);
	}
}
//{}
