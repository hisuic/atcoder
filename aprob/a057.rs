use std::io;

fn main() {
    let mut a = String::new();
    io::stdin().read_line(&mut a).ok();
    let a: usize = a.trim().parse().ok().unwrap();

    let mut b = String::new();
    io::stdin().read_line(&mut b).ok();
    let b: usize = b.trim().parse().ok().unwrap();

    let mut show_time: usize = a + b;

    show_time %= 24;

    print!("{}", show_time);
}
