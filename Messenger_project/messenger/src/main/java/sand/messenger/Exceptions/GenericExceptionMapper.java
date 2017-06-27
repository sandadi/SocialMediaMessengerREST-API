package sand.messenger.Exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import sandadi.messenger.model.ErrorMessage;

/*@Provider*/
public class GenericExceptionMapper implements ExceptionMapper<Throwable>
{

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(),500,"Not yet Developed");
		// TODO Auto-generated method stub
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}

}
