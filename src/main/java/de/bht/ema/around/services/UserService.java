package de.bht.ema.around.services;

import java.util.List;

import de.bht.ema.around.model.AccessToken;
import de.bht.ema.around.model.SocialIdentity;
import de.bht.ema.around.model.User;

public interface UserService {

	User getUserByAccessToken(AccessToken accessToken);
	
	User getUserByAccessTokenStr(String accessToken);
	
	User getUserBySocialIdentity(SocialIdentity socialIdentity);
	
	User saveUser(User user);
	
	User updateAccessToken(User user, AccessToken accessToken);
	
	List<User> getAllUsers();
	
}
