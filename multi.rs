// use indoc::indoc;

fn main() {
    // Text
    let text = "
        function hello() {
          console.log(\"name\tage\");   
        }
    
        hello();
        ";
    println!("{}", &text);
    // Bin
    // let data = b"\
    //     GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!\
    //     \xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00\
    //     \x00\x02\x02L\x01\x00;\
    //     ";
    let data = include_bytes!("pixel.png");
    println!("{}", data.len());
}
