public class Sample8_3_1{
    public static void main(String[] args) {
        int total;
        int a1 = 15, a2 = 10;

        Calc cl = new Calc();

        total = cl.add(a1,a2);

        System.out.println("合計=" + total);
    }
}