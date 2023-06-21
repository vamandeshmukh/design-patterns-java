package design.patterns.behavioural.chain;

/**
 * 
 * As the name suggest, the chain of responsibility pattern creates a chain of
 * receiver objects for a request. This pattern decouples sender and receiver of
 * a request based on type of request. This pattern comes under behavioral
 * patterns. In this pattern, normally each receiver contains reference to
 * another receiver. If one object cannot handle the request then it passes the
 * same to the next receiver and so on.
 * 
 * Implementation - We've created an abstract class AbstractLogger with a level
 * of logging. Then we've created three types of loggers extending the
 * AbstractLogger. Each logger checks the level of message to its level and
 * print accordingly otherwise does not print and pass the message to its next
 * logger.
 *
 */

public class App {

	private static AbstractLogger getChainOfLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.INFO);
		AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.DEBUG);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

	public static void main(String[] args) {

		AbstractLogger loggerChain = getChainOfLogger();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an info!");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug!");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error!");
	}

}
