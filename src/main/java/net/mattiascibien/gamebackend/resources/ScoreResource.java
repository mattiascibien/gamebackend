package net.mattiascibien.gamebackend.resources;
import net.mattiascibien.gamebackend.dao.ScoreManagerDao;
import net.mattiascibien.gamebackend.dao.impl.ScoreManagerInMemoryDao;
import net.mattiascibien.gamebackend.model.Score;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


// The Java class will be hosted at the URI path "/helloworld"
@Path("/scores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ScoreResource {
    // The Java method will process HTTP GET requests
    private ScoreManagerDao dao = new ScoreManagerInMemoryDao();

    @GET
    public List getScores() {
        return dao.featchAllScores();
    }

    @GET
    @Path("{id}")
    public Score getScore(@PathParam("id") int scoreId) {
        return dao.fetchScoreById(scoreId);
    }

    @POST
    public Response postScore(Score score) {
        dao.insertScore(score);
        return Response.ok().build();
    }
}
