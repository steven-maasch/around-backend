package de.bht.ema.around.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.bht.ema.around.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByAccessTokenStr(String accessToken);
	
	User findBySocialIdentity(Long id);
	
}
