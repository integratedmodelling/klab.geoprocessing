package org.integratedmodelling.klab.geoprocessing.libraries;

import java.util.List;

import org.integratedmodelling.klab.Version;
import org.integratedmodelling.klab.api.data.mediation.impl.Range;
import org.integratedmodelling.klab.api.geometry.Geometry.Dimension;
import org.integratedmodelling.klab.api.knowledge.Artifact.Type;
import org.integratedmodelling.klab.api.knowledge.observation.State;
import org.integratedmodelling.klab.api.lang.ServiceCall;
import org.integratedmodelling.klab.api.scope.ContextScope;
import org.integratedmodelling.klab.api.services.runtime.extension.KlabFunction;
import org.integratedmodelling.klab.api.services.runtime.extension.Library;
import org.integratedmodelling.klab.api.services.runtime.extension.Resolver;
import org.integratedmodelling.klab.geoprocessing.algorithms.Terrain;

@Library(name = "klab.geospatial.generators", description = "Contextualizers that generate realistic geographic terrains and features for stress-testing")
public class Generators {

    @KlabFunction(name = "terrain", description = "", geometry = "S2", type = Type.NUMBER, version = Version.CURRENT)
    public static class FractalTerrain implements Resolver<State> {

        @Override
        public State resolve(State observation, ServiceCall call, ContextScope scope) {

            Range range = call.getParameters().get("range", new Range(0., 4000., false, false));
            List<Long> xy = scope.getGeometry().dimension(Dimension.Type.SPACE).getShape();
            Terrain terrain = new Terrain(call.getParameters().get("detail", 8), call.getParameters().get("roughness", 0.55),
                    range.getLowerBound(), range.getUpperBound());
            //
            // double dx = 1.0 / xy[0];
            // double dy = 1.0 / xy[1];
            // for (long x = 0; x < xy[0]; x++) {
            // for (long y = 0; y < xy[1]; y++) {
            // ret.set(context.getScale().at(Dimension.Type.SPACE, x, y), terrain.getAltitude(dx *
            // x, dy * y));
            // }
            // }
            //
            // return ret;
            return null;
        }

    }

}
