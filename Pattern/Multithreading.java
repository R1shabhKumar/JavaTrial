//This is the producer consumer problem
class Store{
    int x;
    boolean flag = false;
    synchronized public void put(int i){
        try{
            if(flag==true){
                wait();
            }else{
                x=i;
                System.out.println("The producer have produced "+x);
                flag=true;
                notify();
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    synchronized public void get(){
        try{
            if(flag==false){
                wait();
            }else{
                System.out.println(("The consumer have consumed "+x));
                flag=false;
                notify();
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
}
class Consumer extends Thread{
    Store s;
    Consumer(Store a){
        s=a;
    }
    public void run(){
        int y=0;
        while(y<10){
        s.get();
        y++;
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }
}
    
class Producer extends Thread{
    Store s;
    
    Producer(Store b)
    {
        s=b;
    }
    
    public void run(){
    int x=0;
    while(x<10){
        s.put(x++);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //s.put(11);
    }
}


public class Multithreading {
    public static void main(String[] args) {
    Store q = new Store();
    Producer p= new Producer(q);
    Consumer c = new Consumer(q);
    
    p.start();
    c.start();  
    }
}    

