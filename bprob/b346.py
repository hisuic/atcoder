def check_substring(w_count, b_count):
    # 文字列 'wbwbwwbwbwbw' の w と b の数
    pattern_w = 7
    pattern_b = 5
    pattern_length = 12
    
    # 求める w と b の総数
    total_length = w_count + b_count
    
    # 総数が pattern_length の整数倍であるかどうかを検証
    if total_length % pattern_length != 0:
        return False
    
    # w と b の比率が同じかどうかを検証
    # 同じ比率であれば、求める組み合わせは周期内に存在する
    multiplier = total_length // pattern_length
    return w_count == pattern_w * multiplier and b_count == pattern_b * multiplier

# 使用例
W = int(input())
B = int(input())
result = check_substring(W, B)
if (result == True):
    print("Yes")
else:
    print("No")