
import javax.swing.*;
import java.util.ArrayList;
import java.util.* ;
import java.util.concurrent.Semaphore;

public class booking extends Customer{
    int numberOfSeats = 0 ;
    ArrayList<Integer> returnedseats = new ArrayList() ;
    booking (int numberOfSeats){
       this.numberOfSeats=  numberOfSeats ;
    }

   public ArrayList getbookedseats(){

        return returnedseats ;
    }

    @Override
    public void run() {



   // public ArrayList booking()
        try {
           // ArrayList<Integer> retunredseats =new ArrayList();

            serviceQueue.acquire();           // wait in line to be serviced
            System.out.println("Thread "+Thread.currentThread().getName() + " is placed in queue");
            resource.acquire();               // request exclusive access to resource
            serviceQueue.release();           // let next in line be serviced
            System.out.println("Thread "+Thread.currentThread().getName() + " is released from queue and started writing");
            


            //critical section

4.5.6.7.8.9

           //retunredseats = seatsAvailabile.subList(0, numberOfSeats);

            List<Integer> seatslist = seatsAvailabile.subList(0, numberOfSeats);
            returnedseats = new ArrayList<Integer>(seatslist);
            for (int i = 0 ; i < numberOfSeats ; i++ )
            {
                seatsAvailabile.remove(0) ;
            }





            System.out.println("Thread "+Thread.currentThread().getName() + " has finished WRITING");

            resource.release();
            //return  returnedseats ;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
           // return fault ;

        }

    }



}
