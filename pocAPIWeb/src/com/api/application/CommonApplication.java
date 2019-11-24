/**
 * 
 */
package com.api.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.api.capability.resource.Quotes;

@ApplicationPath("/")
public class CommonApplication extends Application {
	
	@SuppressWarnings("unchecked")
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(Quotes.class));
    }

}
