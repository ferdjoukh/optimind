package com.altran.Utils;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

public class Utils {
	
	/**
     * Get the IFile associated with an EMF resource (and located inside the
     * workspace)
     * 
      * @param resource
     *            en EMF resource
     * @return the IFile corresponding to the EMF resource
     */
     public static IFile getFile(Resource resource) {
            if (resource != null) {
                   URI uri = resource.getURI();
                   uri = resource.getResourceSet().getURIConverter().normalize(uri);
                   String scheme = uri.scheme();
                   if ("platform".equals(scheme) && uri.segmentCount() > 1 && "resource".equals(uri.segment(0))) {
                         StringBuffer platformResourcePath = new StringBuffer();
                         for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
                                platformResourcePath.append('/');
                                platformResourcePath.append(uri.segment(j).replaceAll("%20", " "));
                         }
                         return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformResourcePath.toString()));
                   }
            }
            return null;
     }

}
