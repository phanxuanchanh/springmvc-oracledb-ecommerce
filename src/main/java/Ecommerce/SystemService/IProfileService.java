package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.ProfileInput;
import Ecommerce.SystemEntity.Profile;

@Service
public interface IProfileService {
	@Autowired
	
	List<Profile> GetProfiles();
	
	List<Profile> GetProfiles_Distinct();
	
	boolean CreateProfile(ProfileInput profileInput);
	
	boolean UpdateProfile(ProfileInput profileInput);
	
	boolean DeleteProfile(String profileName);
}
