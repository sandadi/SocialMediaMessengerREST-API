package sandadi.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sandadi.messenger.model.Profile;
import sandadi.messenger.service.ProfileService;

@Path("/profiles")
public class ProfileResources {
	ProfileService s = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAll()
	{
		return s.getAllProfiles();
	}

}
