public class Q8_4 {
    public static void main(String[] args) {
        int total;
        int a1,a2;

        Calc7 c1 = new Calc7();

        /* コマンドライン引数で指定された値を取得 */
        a1 = Integer.parseInt(args[0]);
        a2 = Integer.parseInt(args[1]);

        /* 2つの値の加算 */
        total = c1.add(a1,a2);
        System.out.println(a1 + "+" + a2 + "=" + total);

        /* 2つの値の減算 */
        total = c1.sub(a1,a2);
        System.out.println(a1 + "-" + a2 + "=" + total);
    }
}
