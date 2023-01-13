package Threadtopic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolTest {
    public static void main(String[] args) {
        ExecutorService obj = Executors.newFixedThreadPool(3);
        for(int i  =0;i<10;i++){
            Runnable threaddemo = new Threadpooldemo(" " + i);
            obj.execute(threaddemo);

        }
        Runnable threaddemo = new Threadpooldemo(null);
            obj.execute(threaddemo);
        // Runnable threaddemo2 = new Threadpooldemo();
        // obj.execute(threaddemo);
        // obj.shutdown();

            
        
        
    }
    }
    
 
