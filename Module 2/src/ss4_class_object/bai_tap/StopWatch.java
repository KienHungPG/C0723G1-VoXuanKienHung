package ss4_class_object.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void end(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(long startTime, long endTime){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100000);
        }
        stopWatch.start();
        long startTime = stopWatch.getStartTime();
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        stopWatch.end();
        long endTime = stopWatch.getEndTime();
        long runTime  = stopWatch.getElapsedTime(startTime,endTime);
        System.out.println(runTime + " milisecond");
    }
}
