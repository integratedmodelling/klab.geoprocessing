package org.integratedmodelling.klab.geoprocessing.libraries;

import org.integratedmodelling.klab.Version;
import org.integratedmodelling.klab.api.knowledge.Artifact.Type;
import org.integratedmodelling.klab.api.knowledge.observation.State;
import org.integratedmodelling.klab.api.lang.ServiceCall;
import org.integratedmodelling.klab.api.scope.ContextScope;
import org.integratedmodelling.klab.api.services.runtime.extension.KlabFunction;
import org.integratedmodelling.klab.api.services.runtime.extension.Library;
import org.integratedmodelling.klab.api.services.runtime.extension.Resolver;

@Library(name = "klab.geospatial.generators", description = "Contextualizers that generate realistic geographic terrains and features for stress-testing")
public class Generators {

    @KlabFunction(name = "terrain", description = "", type = Type.NUMBER, version = Version.CURRENT)
    public static class Terrain implements Resolver<State> {

        @Override
        public State resolve(State observation, ServiceCall call, ContextScope scope) {
            // TODO Auto-generated method stub
            return null;
        }

    }

}
