abc080_b.kt
##########################################
java,kt共通
int Y = Integer.parseInt(X);
##########################################
全て要修正
1.readLine() の結果を X に代入する際、null チェックを追加しています。
これにより、X が null の場合に備えて空文字列 "" をデフォルト値としています。
2.M を var で宣言しました。これにより、ループ内で M の値を更新できます。
3.X.toIntOrNull() を使用して、X を整数に変換しました。
toIntOrNull() は、文字列を整数に変換できる場合はその整数を返し、変換できない場合は null を返します。
Y の初期値として 0 を指定しています。
##########################################
##########################################
##########################################
fun main(args: Array<String>) {
    val X = readLine() ?: ""
    var M = 0
    for (char in X) {
        val digit = Character.getNumericValue(char)
        M += digit
    }
    val Y = X.toIntOrNull() ?: 0
    if (Y % M == 0) {
        println("Yes")
    } else {
        println("No")
    }
}
##########################################
[修正版AC]
fun main(args: Array<String>) {
    val X = readLine() ?: ""
    var M = 0
    for (char in X) {
        val digit = Character.getNumericValue(char)
        M += digit
    }
    val Y = X.toIntOrNull() ?: 0
    if (Y % M == 0) {
        println("Yes")
    } else {
        println("No")
    }
}
##########################################
[ERROR]
fun main(args: Array<String>) {
    val X = readLine()
    val M=0
    for (char in X) {
        val digit = Character.getNumericValue(char)
        M += digit
    }
    int Y = Integer.parseInt(X);
    if (Y%M==0){
    println("Yes")    
    } else {
    println("No")      
    }
}
##########################################
[python]
X=str(input())
M=0
for x in list(X):
  M+=int(x)
if int(X)%M==0:
  print('Yes')
else:
  print('No')
##########################################
