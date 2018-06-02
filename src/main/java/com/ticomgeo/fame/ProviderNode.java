package com.ticomgeo.fame;

import com.ticomgeo.fame.descriptors.ProviderNodeDescriptor;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * @author mstricklin
 * @version 1.0
 */
public abstract class ProviderNode extends ProviderNodeDescriptor implements FameNode {

	@SuppressWarnings("unused")
	private static final Logger CLASS_LOGGER = LoggerFactory.getLogger((new Throwable()).getStackTrace()[0].getClassName());

	@SuppressWarnings("unused")
	private static final String NEWLINE = System.getProperty("line.separator");

}