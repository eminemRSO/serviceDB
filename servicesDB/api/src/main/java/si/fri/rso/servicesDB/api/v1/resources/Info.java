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
@Produces("application/json")
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
        json.put("mikrostoritve", new String[]{"http://83.212.127.63:8080/v1/images", "http://83.212.127.63:8087/katalog/katalog", "http://83.212.127.63:8081/auth"});
        json.put("github", new String[]{"https://github.com/eminemRSO/serviceDB", "https://github.com/eminemRSO/katalogRSO"});
        json.put("travis", new String[]{"https://travis-ci.com/github/eminemRSO/serviceDB", "https://travis-ci.com/github/eminemRSO/katalogRSO"});
        json.put("dockerhub", new String[]{"https://hub.docker.com/repository/docker/mista123/servicesdb", "https://hub.docker.com/repository/docker/mista123/katalog-rso"});
        return Response.status(Response.Status.OK).entity(json.toString()).build();
    }
}
