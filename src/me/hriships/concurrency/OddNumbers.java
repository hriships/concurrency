package me.hriships.concurrency;

/**
 * Created by administrator on 2/8/16.
 */
public class OddNumbers implements Runnable {

    private int limit;
    private Captain captain;

    public OddNumbers(int limit, Captain captain) {
        this.limit = limit;
        this.captain = captain;
    }

    @Override
    public void run() {
        for(int i =1; i < limit; i=i+2) {
            captain.canI("t2");
            System.out.print("[" + i + "]");
            captain.imDone();
        }
    }
}