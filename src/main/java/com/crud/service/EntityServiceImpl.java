package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.domain.Entidy;
import com.crud.repository.EntityRepository;

@Service
public class EntityServiceImpl implements EntityService{

	@Autowired
	private EntityRepository entityRepository;
	
	public EntityServiceImpl(EntityRepository entityRepository) {
		this.entityRepository = entityRepository;
	}


	@Override
	public Iterable<Entidy> list() {
		// TODO Auto-generated method stub
		System.out.println(this.entityRepository.findAll());
		
		return this.entityRepository.findAll();
	}


	@Override
	public Entidy save(Entidy entidy) {
		// TODO Auto-generated method stub
		return this.entityRepository.save(entidy);
	}

}
