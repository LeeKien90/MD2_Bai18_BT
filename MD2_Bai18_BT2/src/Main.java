public class Main {
    public static void main(String[] args) {
        OodThread ot = new OodThread("OodThread");
        EvenThread et = new EvenThread("EvenThread");
        ot.run();
        et.run();
    }
}