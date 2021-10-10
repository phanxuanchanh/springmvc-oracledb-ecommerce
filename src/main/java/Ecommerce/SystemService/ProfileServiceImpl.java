package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.ProfileDAO;
import Ecommerce.SystemEntity.Profile;

@Service
public class ProfileServiceImpl implements IProfileService {
	@Autowired
	private ProfileDAO profileDAO;
	
	public List<Profile> GetProfiles() {
		return profileDAO.GetProfiles();
	}
}
