package org.fawry.excptions;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ResourceNotFoundMapper implements ExceptionMapper {



    @Override
    public Response toResponse(Throwable throwable) {
        return null;
    }
}

