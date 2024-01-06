package com.bezkoder.spring.jpa.h2;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestLog4j {

    private static final Logger logger = LogManager.getLogger(TestLog4j.class);

    public static void main(String[] args) {
        logger.debug("Debug message.");
        logger.info("Info message.");
        logger.warn("Warning message.");
        logger.error("Error message.");
        logger.fatal("Fatal message.");
    }

    private static void logDebugMessage() {
        logger.debug("This is a debug message used for more detailed information during debugging.");
    }

    private static void logInfoMessage() {
        logger.info("This is an info message used for confirmation that the code is actually working.");
    }

    private static void logWarningMessage() {
        logger.warn("This is a warning message used for something unexpected (but not an error).");
    }

    private static void logErrorMessage() {
        logger.error("This is an error message used for an issue.");
    }

    private static void logFatalMessage() {
        logger.fatal("This is a fatal message used for severe errors which will lead to termination.");
    }
}