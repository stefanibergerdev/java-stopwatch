public class contador {
    public static void main(String[] args) throws InterruptedException {

        for(int minute = 0; minute < 1; minute++) {
            for(int second = 0; second < 60; second++) {

                System.out.printf("\r%02d:%02d", minute, second);

                Thread.sleep(1000);
            }
        }
    }
}