const std = @import("std");
const stdout = std.io.getStdOut().writer();

pub fn main() !void {
    // Text
    const text =
        \\function hello() {
        \\    print("name\tage");   
        \\}
        \\
        \\hello();
    ;
    try stdout.print("{}\n", .{text});
    // Data
    // xxd multi | grep -A3 GIF
    // const data =
    //     "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!" ++
    //     "\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00" ++
    //     "\x00\x02\x02L\x01\x00;";
    const data = @embedFile("pixel.png");
    try stdout.print("{}\n", .{data.len});
}
