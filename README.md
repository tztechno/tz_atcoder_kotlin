# tz_atcoder_kotlin

---
```

```
---
```

```
---
```

```
---
```

```
---
```

```
---
```
val N = readLine()!!.toInt()
val A = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
val B = A.toMutableList()
var flag = true
```
---
```
java,kt共通
int Y = Integer.parseInt(X);
```
---
```
全て要修正
1.readLine() の結果を X に代入する際、null チェックを追加しています。
これにより、X が null の場合に備えて空文字列 "" をデフォルト値としています。
2.M を var で宣言しました。これにより、ループ内で M の値を更新できます。
3.X.toIntOrNull() を使用して、X を整数に変換しました。
toIntOrNull() は、文字列を整数に変換できる場合はその整数を返し、変換できない場合は null を返します。
Y の初期値として 0 を指定しています。
```
---

