const std = @import("std");

pub fn main() !void {
    const stdout = std.io.getStdOut().writer();
    // Text
    const text =
        \\function hello() {
        \\    print("name\tage");   
        \\}
        \\
        \\hello();
    ;
    try stdout.print("{}\n", .{text});
}
