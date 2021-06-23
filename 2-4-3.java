/*  代入演算子

右オペランドの内容を左オペランドの変数に代入する演算子。代入は基本的に最後に行われる。

   演算子  |               機能                |    優先順位   |  評価の方法  |            評価の例            |
     =    | 右辺を左辺に代入                    |   最低(15)   |    右→左    | a=10 → a(中身は10)             |
    +=    | 左辺と右辺を加算して左辺に代入        |   最低(15)   |    右→左    | a += 2 → a(a=a+2)と同じ        |
    -=    | 左辺と右辺を減算して左辺に代入        |   最低(15)   |    右→左    | a -= 2 → a(a=a-2)と同じ        |
    *=    | 左辺と右辺を乗算して左辺に代入        |   最低(15)   |    右→左    | a *= 2 → a(a=a*2)と同じ        |
    /=    | 左辺と右辺を除算して左辺に代入        |   最低(15)   |    右→左    | a /= 2 → a(a=a/2)と同じ        |
    %=    | 左辺と右辺を除算してその余を左辺に代入 |   最低(15)   |    右→左    | a %= 2 → a(a=a%2)と同じ        |
    +=    | 左辺の後に右辺を連結し代入           |   最低(15)   |    右→左    | a += "風" → a(a=a+"風")と同じ   |


    */