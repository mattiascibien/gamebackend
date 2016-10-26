package net.mattiascibien.gamebackend;

import net.mattiascibien.gamebackend.resources.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class GameBackendApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final HashSet<Class<?>> resources = new HashSet<>();

        resources.add(ScoreResource.class);

        return resources;
    }
}
