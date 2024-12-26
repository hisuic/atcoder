use std::io;

fn main() {
    // 1行目の入力を取得して N, c1, c2 を取得
    let mut first_line = String::new();
    io::stdin().read_line(&mut first_line).expect("Failed to read line");
    let first_line: Vec<&str> = first_line.trim().split_whitespace().collect();

    let n: usize = first_line[0].parse().expect("Failed to parse N");
    let c1char = first_line[1].chars().next().unwrap();
    let c2char = first_line[2].chars().next().unwrap();

    // 文字列 S を取得
    let mut s = String::new();
    io::stdin().read_line(&mut s).expect("Failed to read line");
    let s = s.trim(); // 末尾の改行を削除

    // 文字列を置き換え
    let mut result = String::new();
    for ch in s.chars() {
        if ch == c1char {
            result.push(ch); // c1 はそのまま残す
        } else {
            result.push(c2char); // それ以外を c2 に置き換える
        }
    }

    // 結果を出力
    println!("{}", result);
}


// fn main() {
//     let mut n = String::new();
//     io::stdin().read_line(&mut n).ok();
//     let n: usize = n.trim().parse().ok().unwrap();
//
//     let mut c1 = String::new();
//     io::stdin().read_line(&mut c1).expect("Failed to read line.");
//     let c1char = c1.chars().next().unwrap();
//
//     let mut c2 = String::new();
//     io::stdin().read_line(&mut c2).expect("Failed to read line.");
//     let c2char = c2.chars().next().unwrap();
//
//     let mut s = String::new();
//     io::stdin().read_line(&mut s).expect("Failed to read line.");
//
//     let mut char_vec: Vec<char> = s.chars().collect();
//     for i in 0..n {
//         if char_vec[i] != c1char {
//             char_vec[i] = c2char;
//         }
//     }
//
//     let output: String = char_vec.iter().collect();
//
//     print!("{}", output);
// }
