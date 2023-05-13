import java.util.ArrayList;
import java.util.* ;

public class viewSeats extends Customer{
    private ArrayList<Integer> returnedseats1 = new ArrayList() ;


    public List getAvailable(){

        return returnedseats1;
    }
    public void run() {
        try {


            serviceQueue.acquire();       //Acquire Section
            System.out.println("Thread " + Thread.currentThread().getName() + " is placed in queue");
            rmutex.acquire();
            readCount++;
            if (readCount == 1) {
                resource.acquire();
            }
            serviceQueue.release();
            System.out.println("Thread " + Thread.currentThread().getName() + " is released from queue and started reading");
            rmutex.release();

            //Reading section


            returnedseats1 = (ArrayList<Integer>) seatsAvailabile.clone();


            System.out.println("Thread " + Thread.currentThread().getName() + " has FINISHED READING");

            //Releasing section
            rmutex.acquire();
            readCount--;
            if (readCount == 0) {
                resource.release();
            }
            rmutex.release();
            //return shit;
            // System.out.println(serviceQueue.getQueueLength());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            //return fault;
        }

    }
}