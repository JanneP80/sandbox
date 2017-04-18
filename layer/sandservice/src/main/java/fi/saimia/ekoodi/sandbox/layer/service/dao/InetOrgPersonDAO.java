package fi.saimia.ekoodi.sandbox.layer.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fi.saimia.ekoodi.sandbox.layer.service.cc.DaoException;
import fi.saimia.ekoodi.sandbox.layer.service.dao.file.InetOrgPersonFileDAO;
import fi.saimia.ekoodi.sandbox.layer.service.mdl.InetOrgPerson;

@Component
public class InetOrgPersonDAO {
	
	@Autowired
	private InetOrgPersonFileDAO fdao;
	
	public InetOrgPerson createInetOrgPerson(InetOrgPerson person){
		return person;
	}

	
	public InetOrgPerson readInetOrgPerson(InetOrgPerson person) throws DaoException{
		return fdao.readInetOrgPerson(person);
	}
	
}
