package exercise1_SingletonPattern.Code;

class Logger {

	static Logger logger;
	
	private Logger(){
		
	}
	
	public static Logger getInstance() {
		if(logger==null) {
			synchronized(Logger.class) {
				if(logger == null) logger = new Logger();
			}
		}
		return logger;
	}

}
