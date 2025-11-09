package Threading.Synchronization;

class CountNumbers implements Runnable{

    @Override
    synchronized public void run() {
        try{
            System.out.println("You Stop Untill 25 " + Thread.currentThread().getName()+ " is On");
            for(int i=0;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("U may Ready");
                Thread.sleep(3000);
            System.out.println("U may go Now....!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}

public class Traffic {
    public static void main(String[] args) {
        
    
    CountNumbers  cn = new CountNumbers();
    Thread t1 = new Thread(cn);
    // Thread t2 = new Thread(cn);

    t1.setName("Red");
    // t2.setName("Green");

    t1.start();
    // t2.start();
    }    
}
