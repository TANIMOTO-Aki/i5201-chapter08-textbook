public class Sample8_4_1 {
    public static void main(String[] args) {
        int total;
        int num;

        CalcV2 c1 = new CalcV2();

        num = Integer.parseInt(args[0]);
        total = c1.add(num);
        System.out.println("1から" + num + "までの合計=" + total);
        total = c1.factorial(num);
        System.out.println(num + "の階乗=" + total);
    }
}
