package com.crud.service;

import com.crud.domain.Entidy;

public interface EntityService {

	Iterable<Entidy> list();
	
	Entidy save(Entidy entidy);
}
