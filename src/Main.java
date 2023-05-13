import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.* ;

public class Main extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int x = 1 ;
        int NumberofSeats  ;
        viewSeats ziadMazhar = new viewSeats();
        ziadMazhar.add();

        System.out.println("__________________________________________________________");
        System.out.println("Welcome to madinaty cinema!");
        System.out.println("__________________________________________________________");
        System.out.println("Choose an option from the menu and indicate your option wth the the corresponding index");

        int choice  ;

        String canContinue = "yes";

        while(true) {
            while (canContinue.equals("Yes") || canContinue.equals("yes")) {
                System.out.println("1.New Booking\n2.view seats\n");
                 choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("number of seats per customer");
                        NumberofSeats = sc.nextInt();
                        System.out.println("number of customers max 4 ");
                        int Numberofcustomers = sc.nextInt();

                                   booking ziad = new booking(NumberofSeats);
                     switch (Numberofcustomers) {
                            case 1:
                                //ziad.add();
                                Thread t1 = new Thread(ziad);
                                t1.setName("ziad ");
                                t1.start();
                                t1.join();
                                System.out.println("ziad no of seats booked =" + ziad.getbookedseats());
                                System.out.println("total no of seats availabile =" + ziad.seatsAvailabile);
                                break;
                            case 2:
                                booking ziad1 = new booking(NumberofSeats);
                                //ziad1.add();
                                Thread t2 = new Thread(ziad1);
                                t2.setName("ziad ");
                                t2.start();
                                t2.join();
                                System.out.println("ziad no of seats booked =" + ziad1.getbookedseats());
                                System.out.println("total no of seats availabile =" + ziad1.seatsAvailabile);
                                booking batool = new booking(NumberofSeats);
                                Thread t3 = new Thread(batool);
                                t3.setName("batool ");
                                t3.start();
                                t3.join();
                                System.out.println("batool no of seats booked =" + batool.getbookedseats());
                                System.out.println("total no of seats availabile =" + batool.seatsAvailabile);
                                break;
                            case 3:
                                booking ziad2 = new booking(NumberofSeats);
                                //ziad2.add();
                                Thread t5 = new Thread(ziad2);
                                t5.setName("ziad ");
                                t5.start();
                                t5.join();
                                System.out.println("ziad no of seats booked =" + ziad2.getbookedseats());
                                System.out.println("total no of seats availabile =" + ziad2.seatsAvailabile);
                                
                                booking batool1 = new booking(NumberofSeats);
                                Thread t4 = new Thread(batool1);
                                t4.setName("batool ");
                                t4.start();
                                t4.join();
                                System.out.println("batool no of seats booked =" + batool1.getbookedseats());
                                System.out.println("total no of seats availabile =" + batool1.seatsAvailabile);
                                
                                booking besho = new booking(NumberofSeats);
                                Thread t6 = new Thread(besho);
                                t6.setName("besho ");
                                t6.start();
                                t6.join();
                                System.out.println("besho no of seats booked =" + besho.getbookedseats());
                                System.out.println("total no of seats availabile =" + besho.seatsAvailabile);
                                break;
                            case 4:
                            booking ziad3 = new booking(NumberofSeats);
                            //ziad2.add();
                            Thread t7 = new Thread(ziad3);
                            t7.setName("ziad3 ");
                            t7.start();
                            t7.join();
                            System.out.println("ziad no of seats booked =" + ziad3.getbookedseats());
                            System.out.println("total no of seats availabile =" + ziad3.seatsAvailabile);
                            
                            booking batool2 = new booking(NumberofSeats);
                            Thread t8 = new Thread(batool2);
                            t8.setName("batool2 ");
                            t8.start();
                            t8.join();
                            System.out.println("batool no of seats booked =" + batool2.getbookedseats());
                            System.out.println("total no of seats availabile =" + batool2.seatsAvailabile);
                            
                            booking besho1 = new booking(NumberofSeats);
                            Thread t9 = new Thread(besho1);
                            t9.setName("besho1 ");
                            t9.start();
                            t9.join();
                            System.out.println("besho no of seats booked =" + besho1.getbookedseats());
                            System.out.println("total no of seats availabile =" + besho1.seatsAvailabile);

                            booking tes = new booking(NumberofSeats);
                            Thread t10 = new Thread(tes);
                            t10.setName("tes ");
                            t10.start();
                            t10.join();
                            System.out.println("besho no of seats booked =" + tes.getbookedseats());
                            System.out.println("total no of seats availabile =" + tes.seatsAvailabile);
                            break;
                             } break ;
             case 2:

                 System.out.println("number of Reader max 5 ");
                 int NumberofReader = sc.nextInt();
                 switch (NumberofReader) {
                     case 1:
                         viewSeats ziad1 = new viewSeats();
                         Thread t1 = new Thread(ziadMazhar);
                         t1.setName("ziad1 ");
                         t1.start();
                         t1.join();
                         System.out.println("total no of seats availabile =" + ziadMazhar.seatsAvailabile);
                         break ;
                     case 2:
                         viewSeats ziadMazhar1 = new viewSeats();
                         Thread t2 = new Thread(ziadMazhar1);
                         t2.setName("ziadMazhar1 ");
                         t2.start();
                         t2.join();
                         System.out.println("total no of seats availabile =" + ziadMazhar1.seatsAvailabile);

                         viewSeats batool = new viewSeats();
                         Thread t3 = new Thread(batool);
                         t3.setName("batool ");
                         t3.start();
                         t3.join();
                         System.out.println("total no of seats availabile =" + batool.seatsAvailabile);
                         break ;
                     case 3:
                         viewSeats ziadMazhar2 = new viewSeats();
                         Thread t4 = new Thread(ziadMazhar2);
                         t4.setName("ziadMazhar2 ");
                         t4.start();
                         t4.join();
                         System.out.println("total no of seats availabile =" + ziadMazhar2.seatsAvailabile);
                        
                         viewSeats batool1 = new viewSeats();
                         Thread t5 = new Thread(batool1);
                         t5.setName("batool1 ");
                         t5.start();
                         t5.join();
                         System.out.println("total no of seats availabile =" + batool1.seatsAvailabile);


                         viewSeats besho = new viewSeats();
                         Thread t6 = new Thread(besho);
                         t6.setName("besho ");
                         t6.start();
                         t6.join();
                         System.out.println("total no of seats availabile =" + besho.seatsAvailabile);
                         break ;

                     case 4:
                         viewSeats ziadMazhar3 = new viewSeats();
                         Thread t7 = new Thread(ziadMazhar3);
                         t7.setName("ziadMazhar3 ");
                         t7.start();
                         t7.join();
                         System.out.println("total no of seats availabile =" + ziadMazhar3.seatsAvailabile);

                         viewSeats batool2 = new viewSeats();
                         Thread t8 = new Thread(batool2);
                         t8.setName("batool2 ");
                         t8.start();
                         t8.join();
                         System.out.println("total no of seats availabile =" + batool2.seatsAvailabile);


                         viewSeats besho1 = new viewSeats();
                         Thread t9 = new Thread(besho1);
                         t9.setName("besho1 ");
                         t9.start();
                         t9.join();
                         System.out.println("total no of seats availabile =" + besho1.seatsAvailabile);

                         viewSeats tes = new viewSeats();
                         Thread t10 = new Thread(tes);
                         t10.setName("tes ");
                         t10.start();
                         t10.join();
                         System.out.println("total no of seats availabile =" + tes.seatsAvailabile);
                         break ;

                     case 5:
                         viewSeats ziadMazhar4 = new viewSeats();
                         Thread t11 = new Thread(ziadMazhar4);
                         t11.setName("ziadMazhar4 ");
                         t11.start();
                         t11.join();
                         System.out.println("total no of seats availabile =" + ziadMazhar4.seatsAvailabile);

                         viewSeats batool3 = new viewSeats();
                         Thread t12 = new Thread(batool3);
                         t12.setName("batool3 ");
                         t12.start();
                         t12.join();
                         System.out.println("total no of seats availabile =" + batool3.seatsAvailabile);


                         viewSeats besho2 = new viewSeats();
                         Thread t13 = new Thread(besho2);
                         t13.setName("besho2 ");
                         t13.start();
                         t13.join();
                         System.out.println("total no of seats availabile =" + besho2.seatsAvailabile);

                         viewSeats tes1 = new viewSeats();
                         Thread t14 = new Thread(tes1);
                         t14.setName("tes1 ");
                         t14.start();
                         t14.join();
                         System.out.println("total no of seats availabile =" + tes1.seatsAvailabile);

                         viewSeats thao = new viewSeats();
                         Thread t15 = new Thread(thao);
                         t15.setName("thao ");
                         t15.start();
                         t15.join();
                         System.out.println("total no of seats availabile =" + thao.seatsAvailabile);

                         break ;

              }
                 break ;
                }

                System.out.println("Enter Yes to continue : ");
                
                canContinue = sc.next();

                if (canContinue.equals("Yes") || canContinue.equals("yes") ){
                    continue;
                }else return;

            }

        }


    }

}