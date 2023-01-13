package Threadtopic;

import java.io.IOException;
import java.nio.CharBuffer;

public class Threadpooldemo implements Readable, Runnable {
    private String message;
    public Threadpooldemo(String string) {
    }
    public void WorkerThread(String name){
        this.message =name;
        
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
