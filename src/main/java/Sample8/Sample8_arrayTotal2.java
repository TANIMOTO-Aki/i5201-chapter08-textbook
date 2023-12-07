public class Sample8_arrayTotal2 {
    public static void main(String[] args) {
        int[] arrayScore2 = {-1,70,85,60,65,75};        //点数
        /* インスタンス生成 */
        arrayTotal2 gk2 = new arrayTotal2();            //配列合計クラス

        /* 先頭要素に合計を算出するメソッドの呼び出し */
        gk2.elementTotalToLead(arrayScore2);
        System.out.println("配列要素の合計は" + arrayScore2[0]);
    }
}

class arrayTotal2 {
    public void elementTotalToLead(int[] element) {     //要素合計算出メソッド
        /* 合計の算出 */
        element[0] = 0;                                 //合計エリアの初期化
        for (int i = 1; i < element.length; i++) {      //要素数分の繰り返し
            element[0] += element[i];                   //合計算出
        }
        return;                                         //返却値なし
    }
}