import javax.swing.*;
import java.util.ArrayList;
import java.util.* ;
import java.util.concurrent.Semaphore;

public class Customer extends Thread {

    protected static Semaphore serviceQueue = new Semaphore(1);
    protected static Semaphore rmutex = new Semaphore(1);
    protected static Semaphore resource = new Semaphore(1);
    protected static int readCount = 0;
    static  ArrayList<Integer>seatsAvailabile = new ArrayList();


   public void add(){
        for (int index = 1; index <= 30; index++) {
            seatsAvailabile.add(index);
        }
    }
        
       
    }



