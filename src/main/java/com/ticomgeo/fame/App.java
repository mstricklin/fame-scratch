package com.ticomgeo.fame;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * @author mstricklin
 * @version 1.0
 */
public class App {



    public static void main(String[] args) {
    	CLASS_LOGGER.info("Hello world");

        List<String> nodes = newArrayList(
                "com.ticomgeo.fame.providers.PeriodicEventProvider",
                "com.ticomgeo.fame.providers.PushPointEventProvider"
        );

    }

	// ==========================================
	private static final Logger CLASS_LOGGER = LoggerFactory.getLogger((new Throwable()).getStackTrace()[0].getClassName());

	@SuppressWarnings("unused")
	private static final String NEWLINE = System.getProperty("line.separator");


}