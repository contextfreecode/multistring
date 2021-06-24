#include <iostream>

auto main() -> int {
  // Text
  auto text = R"(
    function hello() {
      print("name\tage");   
    }
    
    hello();
  )";
  std::cout << text << "\n";
  // Data
  char data[] = "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!"
                "\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00"
                "\x00\x02\x02L\x01\x00;";
  std::cout << sizeof(data) - 1 << "\n";
}
