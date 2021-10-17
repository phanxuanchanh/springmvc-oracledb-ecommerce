package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.ProfileDAO;
import Ecommerce.SystemDTO.ProfileInput;
import Ecommerce.SystemEntity.Profile;

@Service
public class ProfileServiceImpl implements IProfileService {
	@Autowired
	private ProfileDAO profileDAO;
	
	public List<Profile> GetProfiles() {
		return profileDAO.GetProfiles();
	}

	public boolean CreateProfile(ProfileInput profileInput) {
		if(profileDAO.IsExistProfileByName(profileInput.getProfile_name()))
			return false;
		profileDAO.CreateProfile(profileInput);
		return true;
	}

	public boolean UpdateProfile(ProfileInput profileInput) {
		if(profileDAO.IsExistProfileByName(profileInput.getProfile_name())) {
			profileDAO.UpdateProfile(profileInput);
			return true;
		}
		return false;
	}

	public boolean DeleteProfile(String profileName) {
		if(profileDAO.IsExistProfileByName(profileName)) {
			profileDAO.DeleteProfile(profileName);
			return true;
		}
		return false;
	}

	public List<Profile> GetProfiles_Distinct() {
		return profileDAO.GetProfiles_Distinct();
	}
}
