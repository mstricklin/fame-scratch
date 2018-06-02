package com.ticomgeo.fame.someNodes;

import com.ticomgeo.fame.descriptors.types.*;
import com.ticomgeo.fame.ProviderNode;
import com.ticomgeo.fame.descriptors.InitializationParameterDescriptor;
import com.ticomgeo.fame.types.Duration;
import com.ticomgeo.fame.types.Period;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.Collection;

import static com.google.common.collect.Lists.newArrayList;

/**
 * @author mstricklin
 * @version 1.0
 */
public class PeriodicEventProvider extends ProviderNode {

	public static final String ID = "2b517da8-5ca3-11e8-9c2d-fa7ae01bbebc";


	@Override
	public void getServiceDescriptor() {
		CLASS_LOGGER.warn("com.ticomgeo.fame.someNodes.PeriodicEventProvider.getServiceDescriptor is not currently implemented");

	}

	@Override
	public String getId() {
		return PeriodicEventProvider.ID;
	}

//	@Override
//	public PeriodicEventProvider getInstance(Collection<InitializationParameter> params) {
//		InstanceBuilder builder = of();
//		for (InitializationParameter ip: params) {
//			if ("period".equalsIgnoreCase(ip.getName()))
//				builder.period( (Period) ip.getValue());
//			else if ("duration".equalsIgnoreCase(ip.getName()))
//				builder.duration( (Duration) ip.getValue());
//		}
//		return builder.build();
//	}

	@Override
	public Collection<FameDesignator> getDesignators() {
		// Should this be per-instance, or per-type?
		return Arrays.asList(FameDesignator.of("ProviderName", "PeriodicEventProvider"));
	}

	@Override
	public Collection<InitializationParameterDescriptor> getParameters() {
		return Arrays.asList(InitializationParameterDescriptor.of("period", true, Period.class),
		                     InitializationParameterDescriptor.of("duration", false, Duration.class)
		);
	}

	@Override
	public DataProductType getType() {
		return DataProductType.TIMESTAMP;
	}

	@Override
	public DataProductionType getProduction() {
		return DataProductionType.DISCRETE_PERIODIC_CHRONOLOGICAL_EVENT;
	}

	@Override
	public ApiProtocolType getAccessProtocol() {
		return ApiProtocolType.FAME;
	}

	@Override
	public Collection<DataProductFormat> getProductFormats() {
		return Arrays.asList(DataProductFormat.FAME);
	}


	// ==========================================
	@SuppressWarnings("unused")
	private static final Logger CLASS_LOGGER = LoggerFactory.getLogger((new Throwable()).getStackTrace()[0].getClassName());

	@SuppressWarnings("unused")
	private static final String NEWLINE = System.getProperty("line.separator");


}