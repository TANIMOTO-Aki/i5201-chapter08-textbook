public class Sample8_arrayTotal {
    public static void main(String[] args) {
        int[] arrayScore = {70,85,60,65,75};        //点数
        /* インスタンス生成 */
        arrayTotal gk = new arrayTotal();           //配列合計クラス

        /* 要素合計算出メソッドの呼び出しと結果の受け取り */
        int total = gk.elementTotal(arrayScore);
        System.out.println("配列要素の合計は" + total);
    }
}


class arrayTotal {
    public int elementTotal(int[] element) {        //要素合計算出メソッド
        /* 合計の計算 */
        int sum = 0;                                //合計エリアの初期化
        for (int i = 0; i < element.length; i++) {  //要素数分の繰り返し
            sum += element[i];                      //合計算出
        } 
        return sum;                                 //合計の返却
    }
}