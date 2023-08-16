package org.integratedmodelling.klab.geoprocessing;

import org.integratedmodelling.klab.Version;
import org.integratedmodelling.klab.api.extensions.Component;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

@Component(id = "klab.geoprocessing", version = GeoprocessingComponent.VERSION)
public class GeoprocessingComponent extends Plugin {

    public static final String VERSION = "1.0.0-SNAPSHOT";

    public GeoprocessingComponent(PluginWrapper wrapper) {
        super(wrapper);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void start() {
        // TODO build available service catalog (Geoserver, PostGIS, GDAL etc)
        super.start();
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        super.stop();
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        super.delete();
    }

}
