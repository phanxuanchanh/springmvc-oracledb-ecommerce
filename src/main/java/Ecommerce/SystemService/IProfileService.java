package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Profile;

@Service
public interface IProfileService {
	@Autowired
	
	List<Profile> GetProfiles();
}
