import java.io.File;


public class HelloSystemDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		    
		    System.out.println("My project java class path is (?): " +
		        System.getProperty("java.class.path"));
		   
		    System.out.println("\n" + "USER INFO" + "\n" + "user home: " +
			        System.getProperty("user.home"));
		    
		    System.out.println("user name: " +
			        System.getProperty("user.name"));
		    
		    System.out.println("\n" + "JAVA INFO" + "\n" + "java home: " +
			        System.getProperty("java.home"));
		    
		    System.out.println("java version: " +
			        System.getProperty("java.version"));
		    
		    System.out.println("java vendor: " +
			        System.getProperty("java.vendor"));
		    
		    System.out.println("java vendor url: " +
			        System.getProperty("java.vendor.url"));
		    
		    
		    /* Total number of processors or cores available to the JVM */
		    System.out.println("\n" + "PROC and MEM INFO" + "\n" + "Available processors (cores): " + 
		        Runtime.getRuntime().availableProcessors());

		    /* Total amount of free memory available to the JVM */
		    System.out.println("Free memory (bytes): " + 
		        Runtime.getRuntime().freeMemory());

		    /* This will return Long.MAX_VALUE if there is no preset limit */
		    long maxMemory = Runtime.getRuntime().maxMemory();
		    /* Maximum amount of memory the JVM will attempt to use */
		    System.out.println("Maximum memory (bytes): " + 
		        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

		    /* Total memory currently available to the JVM */
		    System.out.println("Total memory available to JVM (bytes): " + 
		        Runtime.getRuntime().totalMemory());

		    /*Get a list of all filesystem roots on this system */
		    File[] roots = File.listRoots();

		    /*For each filesystem root, print some info */
		    for (File root : roots) {
		      System.out.println("File system root: " + root.getAbsolutePath());
		      System.out.println("Total space (bytes): " + root.getTotalSpace());
		      System.out.println("Free space (bytes): " + root.getFreeSpace());
		      System.out.println("Usable space (bytes): " + root.getUsableSpace());
		    }
		  }
		
}
