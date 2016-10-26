package net.mattiascibien.gamebackend.resources;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;


// The Java class will be hosted at the URI path "/helloworld"
@Path("/scores")
public class ScoreResource {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
}
