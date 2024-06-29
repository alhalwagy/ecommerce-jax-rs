import jakarta.persistence.EntityNotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class EntityNotFoundMapper
        implements ExceptionMapper<EntityNotFoundException> {

  public Response toResponse(EntityNotFoundException e) {
    return Response.status(Response.Status.NOT_FOUND).build();
  }
}
