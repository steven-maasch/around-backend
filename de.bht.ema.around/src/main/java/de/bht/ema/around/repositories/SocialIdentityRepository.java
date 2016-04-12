package de.bht.ema.around.repositories;

import de.bht.ema.around.model.Company;
import org.springframework.data.repository.CrudRepository;

import de.bht.ema.around.model.SocialIdentity;

public interface SocialIdentityRepository extends CrudRepository<SocialIdentity, Long> { 
	
	SocialIdentity findBySocialIdAndCompany(Long socialId, Company company);
	
}
