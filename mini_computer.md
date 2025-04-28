了解です！  
今までの話をふまえて、**ミニコンピュータシミュレーター用 各クラスのフィールド＆メソッド一覧**を整理してリストにまとめますね。

---

# 🎯 各クラスのフィールド・メソッド一覧

---

## ControlUnit（制御装置）

### フィールド

- `MemoryUnit memoryUnit`
- `InputDevice inputDevice`
- `OutputDevice outputDevice`
- `ArithmeticUnit arithmeticUnit`

### メソッド

- `void start()`  
  → 処理の開始（すべての指示をまとめるメインメソッド）
- `void fetchInput()`  
  → 入力装置にデータ入力を指示する
- `void executeOperation()`  
  → 演算装置に計算を指示する
- `void outputResult()`  
  → 出力装置に結果を表示させる
- `void handleError(String errorMessage)`  
  → エラー発生時の処理をまとめる

---

## InputDevice（入力装置）

### フィールド

- `String inputData`

### メソッド

- `void receiveInput()`  
  → ユーザーからデータを受け取る
- `void sendToMemory(MemoryUnit memoryUnit)`  
  → 受け取ったデータを記憶装置に保存する

---

## MemoryUnit（記憶装置）

### フィールド

- `String rawData`  
  → 入力されたそのままのデータ
- `int operand1`
- `int operand2`
- `String operator`
- `int result`

### メソッド

- `void storeInput(String inputData)`  
  → 入力データを保存する
- `void parseData()`  
  → 保存されたデータを演算子・オペランドに分解する
- `int getOperand1()`
- `int getOperand2()`
- `String getOperator()`
- `void storeResult(int result)`  
  → 演算結果を保存する
- `int getResult()`

---

## ArithmeticUnit（演算装置）

### フィールド

- なし（もしくは直近の計算履歴を持たせても良い）

### メソッド

- `int calculate(int operand1, int operand2, String operator)`  
  → 四則演算を実行して結果を返す
- （必要なら）`void throwError(String message)`  
  → 例外を投げるヘルパー（ゼロ除算時など）

---

## OutputDevice（出力装置）

### フィールド

- なし

### メソッド

- `void displayResult(int result)`  
  → 計算結果を画面に表示する
- `void displayError(String errorMessage)`  
  → エラーメッセージを画面に表示する

---

# 📝 まとめ

- **ControlUnit**：指示を出しまくる司令塔
- **InputDevice**：データを受け取る
- **MemoryUnit**：データを保存・整理
- **ArithmeticUnit**：計算担当
- **OutputDevice**：結果・エラーを表示

---

これをベースにすれば、  
「コンピュータの 5 大装置がどんな風に連携して動いているか」が、**クラスレベルで完全に視覚化できる**ようになります。

---

もし希望すれば、この後

- 簡単な**クラス同士のやり取りシナリオ**（例：「3 + 5」をどう処理するか）
- **設計図からの最初のコード化ステップ**  
  も一緒に考えられます！

👉 次、どこまで進めたい？（クラス図の整理でも、コード設計でも、あなたに合わせます！）
