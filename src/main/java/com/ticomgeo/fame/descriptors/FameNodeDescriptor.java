package com.ticomgeo.fame.descriptors;

import com.ticomgeo.fame.descriptors.types.FameDesignator;
import com.ticomgeo.fame.descriptors.types.*;

import java.util.Collection;

/**
 * @author mstricklin
 * @version 1.0
 */
public interface FameNodeDescriptor {

	String getId();

	void getServiceDescriptor();

	Collection<FameDesignator> getDesignators();

	Collection<InitializationParameterDescriptor> getParameters();

	DataProductType getType();

	DataProductionType getProduction();

	ApiProtocolType getAccessProtocol();

	Collection<DataProductFormat> getProductFormats();

}