package de.bht.ema.around.repositories;

import de.bht.ema.around.model.AccessToken;
import org.springframework.data.repository.CrudRepository;

public interface AccessTokenRepository extends CrudRepository<AccessToken, Long> {

	AccessToken findByToken(String token);
	
}
