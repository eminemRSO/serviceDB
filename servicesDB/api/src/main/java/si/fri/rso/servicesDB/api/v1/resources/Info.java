package si.fri.rso.servicesDB.api.v1.resources;

import org.json.JSONObject;
import si.fri.rso.servicesDB.api.v1.resources.ImageMetadataResource;
import si.fri.rso.servicesDB.lib.ImageMetadata;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.logging.Logger;


@ApplicationScoped
@Path("/info")
@Produces("text/plain")
public class Info {

    private Logger log = Logger.getLogger(ImageMetadataResource.class.getName());

    @Context
    protected UriInfo uriInfo;


    @GET
    @Path("/json")
    public Response getInfo() {
        JSONObject json = new JSONObject();
        json.put("clani", new String[]{"ms8816", "mb6169"});
        json.put("opis_projekta", new String("Preprosti fiver, kjer uporabniki naročajo oziroma prodajajo projekte v obliki slik, videjev in teksta."));
        json.put("github", new String[]{"https://github.com/eminemRSO/serviceDB"});
        json.put("travis", new String[]{"https://github.com/eminemRSO/serviceDB"});
        json.put("dockerhub", new String[]{"https://github.com/eminemRSO/serviceDB"});
        return Response.ok(json.toString(), MediaType.TEXT_PLAIN).build();
    }
}
