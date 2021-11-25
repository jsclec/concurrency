package thread.creation.example;

public class Main {

    public static int incrementTheCount(int numOfThreadCount){
        numOfThreadCount += 1;
        System.out.println(numOfThreadCount);
        return numOfThreadCount;
    }

    public static int getAnotherThread(int numOfThreadCount){
        new Thread(new Runnable() {
            @Override
            public void run() {
                incrementTheCount(numOfThreadCount);
            }
        });
        return numOfThreadCount;
    }

    public static void main(String[] args) throws InterruptedException {
        int numOfThreadCount = 0;
        for(int i = 0;i<10;i++) numOfThreadCount = getAnotherThread(numOfThreadCount);
        System.out.println(numOfThreadCount);
    }


}