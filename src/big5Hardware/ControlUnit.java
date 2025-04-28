package src.big5Hardware;

public class ControlUnit {
    private  MemoryUnit memoryUnit;
    private InputDevice inputDevice;
    private OutputDevice outputDevice;
    private ArithmeticUnit arithmeticUnit;

    // 処理の開始
    public void start() {
        System.out.println("制御装置さん：　コンピュータの処理を開始します");
    }

    public void end() {
        System.out.println("制御装置さん：　コンピュータの処理を終了します");  
    }

    // 入力装置にデータ入力を指示する
    public void fetchInput() {
        System.out.println("制御装置さん：　入力装置さんはデータ入力を受け付けてください");
    }

    // 入力データの検証
    public void validateInput() {
    System.out.println("制御装置さん：　入力されたデータが正しいか確認します。");
    }

    // 演算装置に計算を指示
    public void excuteOperation() {
        System.out.println("制御装置さん：　演算装置さんは記憶装置さんの中に記憶されているデータを使って演算を行ってください。");
    }

    // 演算エラー処理
    public void handleOperationError(String errorMessage) {
    System.out.println("制御装置さん：　エラー発生！" + errorMessage + " 出力装置さん、エラーを表示してください。");
    }

    // 記憶装置に演算装置に演算対象データを渡すように指示
    public void passDataToArithmeticUnit() {
        System.out.println("制御装置さん：　演算装置さんは記憶装置さんの中に記憶されているデータを使って演算を行ってください。");
    }

    // 記憶装置に出力装置に演算結果を渡すように指示
    public void passDataToOutputDevice() {
        System.out.println("制御装置さん：　記憶装置さんは出力装置さんに演算結果を渡してください。");
    }  

    // 出力装置に出力を指示
    public void outputResult() {
        System.out.println("制御装置さん：　出力装置さんは演算結果を出力してください。");

    }
}