public class Sample8_3_3 {
    /* 可変長引数を用いたメソッド */
    public static int addAll(int... number) {           //①可変長引数の定義
        int sum = 0;
        for (int i = 0; i< number.length; i++){         //②合計を求める処理
            sum += number[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( addAll(10,11,12,13));   //③複数の引数
        System.out.println( addAll(11));            //④引数がひとつ
        System.out.println( addAll());                        //⑤引数なし
    }
}
/*
 * プログラムの説明
 * ①addAllメソッドは、int型の変数numberを可変長引数として受け取るメソッドである
 *  受け取ったnumberは、配列と同じように扱われる
 * ②ここでは、for文を用いて、可変長引数で受け取った全ての値を累計し、その結果を返却する
 * ③複数の引数を渡した場合は、10,11,12,13の合計が求められ、46が表示される
 * ④引数をひとつだけ指定した場合でも問題なく処理され、11と表示される
 * ⑤引数無しで呼び出した場合は、要素数が０の配列として扱われ、０と表示される
 */