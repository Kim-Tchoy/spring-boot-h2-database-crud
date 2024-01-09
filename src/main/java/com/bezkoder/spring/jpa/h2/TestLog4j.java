package com.bezkoder.spring.jpa.h2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * This class demonstrates the usage of Log4j for logging messages at different levels.
 */
public class TestLog4j {

    private static final Logger logger = LogManager.getLogger(TestLog4j.class);

    /**
     * The main method demonstrates logging messages at various levels.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        logger.debug("Debug message.");
        logger.info("Info message.");
        logger.warn("Warning message.");
        logger.error("Error message.");
        logger.fatal("Fatal message.");
    }

}
