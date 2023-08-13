package org.integratedmodelling.klab.geoprocessing.adapters;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.integratedmodelling.klab.api.collections.Parameters;
import org.integratedmodelling.klab.api.data.KlabData;
import org.integratedmodelling.klab.api.knowledge.Artifact.Type;
import org.integratedmodelling.klab.api.knowledge.Observable;
import org.integratedmodelling.klab.api.knowledge.Resource;
import org.integratedmodelling.klab.api.scope.Scope;
import org.integratedmodelling.klab.api.services.resources.adapters.Encoder;
import org.integratedmodelling.klab.api.services.resources.adapters.Parameter;
import org.integratedmodelling.klab.api.services.resources.adapters.ResourceAdapter;
import org.integratedmodelling.klab.api.services.resources.adapters.Validator;
import org.integratedmodelling.klab.api.services.resources.adapters.Validator.LifecyclePhase;
import org.integratedmodelling.klab.api.services.runtime.Notification;

@ResourceAdapter(name = "raster", threadsafe = true, type = {Type.NUMBER, Type.CONCEPT, Type.TEXT, Type.BOOLEAN}, parameters = {
        @Parameter(name = "fileUrl", type = Type.URL)})
public class RasterAdapter {

    @Encoder
    public KlabData encode(Observable observable, Resource resource, Parameters<String> urnParameters) {
        return null;
    }

    @Validator(phase = LifecyclePhase.LocalImport)
    public Collection<Notification> validateLocal(File resource, Scope scope) {
        List<Notification> ret = new ArrayList<>();
        return ret;
    }

}
