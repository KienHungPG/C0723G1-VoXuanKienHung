package ss4_class_object.bai_tap;


public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng StopWatch
        StopWatch stopWatch = new StopWatch();

        // Tạo một mảng chứa 100,000 số ngẫu nhiên để sắp xếp
        int[] numbersArray = new int[100000];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = (int) (Math.random() * 100000);
        }

        // Bắt đầu đo thời gian
        stopWatch.start();

        // Sắp xếp mảng bằng thuật toán selection sort
        for (int i = 0; i < numbersArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[j] < numbersArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbersArray[minIndex];
            numbersArray[minIndex] = numbersArray[i];
            numbersArray[i] = temp;
        }
        // Dừng đo thời gian
        stopWatch.stop();

        // In ra thời gian thực thi
        System.out.println("Execution time is: " + stopWatch.getElapsedTime() + " ms");
    }
}

