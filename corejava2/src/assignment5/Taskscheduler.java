package assignment5;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Taskscheduler {
	public class TaskScheduler {
	    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	    public void scheduleTask(Task task, int interval) {
	        Runnable taskWrapper = task::execute;
	        scheduler.scheduleAtFixedRate(taskWrapper, 0, interval, TimeUnit.SECONDS);
	    }

	    public void shutdown() {
	        scheduler.shutdown();
	    }

	    public static void main(String[] args) {
	        TaskScheduler scheduler = new TaskScheduler();

	        // Schedule three different tasks
	        scheduler.scheduleTask(() -> System.out.println("Task 1 executed!"), 2); // Executes every 2 seconds
	        scheduler.scheduleTask(() -> System.out.println("Task 2 executed!"), 4); // Executes every 4 seconds
	        scheduler.scheduleTask(() -> System.out.println("Task 3 executed!"), 6); // Executes every 6 seconds

	        // Let the scheduler run for some time before shutting it down
	        try {
	            Thread.sleep(20000); // Run the scheduler for 20 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            scheduler.shutdown();
	        }
	    }
	}
}

	        
	    

