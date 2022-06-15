#import "Basic";
#import "Compiler";
#import "File";

main :: () {
    /*
        Here's a comment.
        /*
            And a nested comment.
        */
    */
    // Text
    text :: #string DONE
        function hello() {
          console.log("name\tage");   
        }
    
        hello();
    DONE;
    print(text);
	// TODO Need #run with String_Builder? Some block?
    // data ::
    //     "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00"
    //     "\x00\x00!\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00"
    //     "\x00\x01\x00\x01\x00\x00\x02\x02L\x01\x00;";
	data :: #run add_global_data(xx read_entire_file("pixel.png"), .READ_ONLY);
    print("%\n", data.count);
}
