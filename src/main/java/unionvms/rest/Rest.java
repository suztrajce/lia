package unionvms.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restapi/")
public class Rest {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/rest/")
    public String getRest(){
        return "Hello world!";

    }
}
