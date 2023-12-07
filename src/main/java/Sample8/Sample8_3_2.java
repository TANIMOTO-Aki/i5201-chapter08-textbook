public class Sample8_3_2 {
    public static void main(String[] args) {        //①
        System.out.println(args.length);            //②
        for (int i = 0; i < args.length; i++) {     //③
            System.out.println(args[i]);            //④
        }
    }
}

/*
 * プログラムの説明
 * ①コマンドライン引数の定義（配列名argsは変更可能である）
 * ②コマンドライン引数として受け取った文字列の個数をargs.lengthが管理している
 * ③配列argsの添字としてiを用いて、受け取った個数分だけ繰り返す
 * ④配列の内容を表示する
 */
