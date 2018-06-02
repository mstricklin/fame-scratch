package com.ticomgeo.fame.descriptors;

import com.ticomgeo.fame.descriptors.types.ApiProtocolType;
import com.ticomgeo.fame.descriptors.types.DataProductFormat;
import com.ticomgeo.fame.descriptors.types.FameDesignator;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author mstricklin
 * @version 1.0
 */
public abstract class AbstractNodeDescriptor implements FameNodeDescriptor {

	// does the utility of default implementations override the virtue of forcing an implementation?

	@Override
	public Collection<FameDesignator> getDesignators() {
		// does the utility of a default implementation override the virtue of forcing an implementation?
		return Collections.emptyList();
	}

	@Override
	public Collection<InitializationParameterDescriptor> getParameters() {
		// does the utility of a default implementation override the virtue of forcing an implementation?
		return Collections.emptyList();
	}

	@Override
	public ApiProtocolType getAccessProtocol() {
		// does the utility of a default implementation override the virtue of forcing an implementation?
		return ApiProtocolType.FAME;
	}

	@Override
	public Collection<DataProductFormat> getProductFormats() {
		return Arrays.asList(DataProductFormat.FAME);
	}

}