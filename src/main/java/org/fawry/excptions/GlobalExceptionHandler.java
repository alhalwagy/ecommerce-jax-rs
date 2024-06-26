package org.fawry.excptions;

import org.fawry.excptions.CustomExceptions.ResourceNotFoundException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.fawry.model.errors.ResponseErrorModel;

import java.sql.Timestamp;

@Provider
public class GlobalExceptionHandler implements ExceptionMapper<Throwable> {

  @Override
  public Response toResponse(Throwable exception) {
    if (exception instanceof ResourceNotFoundException ) {
      return handleResourceNotFoundException((ResourceNotFoundException) exception);
    }

    return handleGeneralExceptions(exception);
  }

  private Response handleResourceNotFoundException(ResourceNotFoundException exception) {

    ResponseErrorModel error = new ResponseErrorModel();
    error.setStatus(Response.Status.NOT_FOUND.getStatusCode());
    error.setMessage(exception.getMessage());
    error.setOccuredAt(new Timestamp(System.currentTimeMillis()));

    return Response.status(Response.Status.NOT_FOUND).entity(error).build();
  }

  private Response handleGeneralExceptions(Throwable exception) {
    ResponseErrorModel error = new ResponseErrorModel();
    error.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
    error.setMessage(exception.getMessage());
    error.setOccuredAt(new Timestamp(System.currentTimeMillis()));

    return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
  }
}
