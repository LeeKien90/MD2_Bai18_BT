public class OodThread extends Thread{
        private String name;

    public OodThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0){
                    System.out.println("Số lẻ trong OodThread: " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Luồng gián đoan");
        }

    }
}
