public class NumberGenerator implements Runnable{
    private String name;
    public NumberGenerator(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("In ra số: " + i +" - " + this.name);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("luồng chạy");
        }
        System.out.println("kết thúc");
    }
}
