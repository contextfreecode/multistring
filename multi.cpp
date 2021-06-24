#include <iostream>

auto main() -> int {
    auto text = R"heredoc(
        function hello() {
            print("name\tage");   
        }
        
        hello();
    )heredoc";
    std::cout << text << "\n";
}
