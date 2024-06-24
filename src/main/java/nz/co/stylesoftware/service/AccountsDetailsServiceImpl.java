package nz.co.stylesoftware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import nz.co.stylesoftware.dao.IAccountDetailsJpaDao;
import nz.co.stylesoftware.entity.AccountDetails;

import org.springframework.stereotype.Service;

@Service
public class AccountsDetailsServiceImpl implements IAccountDetailsService {

	@Autowired
	private IAccountDetailsJpaDao jpaRepo;
	
	public String registerAccount(List<AccountDetails> acctList) {
		jpaRepo.saveAll(acctList); 
		return "Registration has been done successfully!";
	}

	@Override
	public AccountDetails getById(Integer Id) {
		//return jpaRepo.getById(Id); //deprecated
		return jpaRepo.getReferenceById(Id);
	}
	
	

}
