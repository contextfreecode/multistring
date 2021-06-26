class Multi {
    /**
     * @param args the command line arguments, where e.g. "java Multi.java hi"
     *             gives an array of just one element: "hi".
     */
    public static void main(String[] args) throws Exception {
        // Example from https://openjdk.java.net/jeps/378
        var text = """
            function hello() {
              console.log("name\tage");   
            }
        
            hello();
            """;
        System.out.println(text);
        // Binary
        // var data =
        //     "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!" +
        //     "\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00" +
        //     "\x00\x02\x02L\x01\x00;"
        // var data = stringBytes(
        //     "\u4749\u4638\u3961\u0100\u0100\u8001\u00ff\uffff\u0000\u0021" +
        //     "\uf904\u010a\u0001\u002c\u0000\u0000\u0100\u0100\u0002\u024c" +
        //     "\u0100\u3b00"
        //     // """
        //     // \u4749\u4638\u3961\u0100\u0100\u8001\u00ff\uffff\u0000\u0021\
        //     // \uf904\u010a\u0001\u002c\u0000\u0000\u0100\u0100\u0002\u024c\
        //     // \u0100\u3b00"""
        // );
        // var data = new byte[] {
        //     0x47, 0x49, 0x46, 0x38, 0x39, 0x61, 0x01, 0x00, 0x01, 0x00,
        //     (byte)0x80, 0x01, 0x00, (byte)0xff, (byte)0xff, (byte)0xff,
        //     0x00, 0x00, 0x00, 0x21, (byte)0xf9, 0x04, 0x01, 0x0a, 0x00,
        //     0x01, 0x00, 0x2c, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x01,
        //     0x00, 0x00, 0x02, 0x02, 0x4c, 0x01, 0x00, 0x3b,
        // };
        var data = Multi.class.getResourceAsStream("pixel.png").readAllBytes();
        System.out.println(data.length);
    }

    static byte[] stringBytes(String string) {
        var bytes = new byte[string.length() * 2];
        int index = 0;
        for (var c : string.toCharArray()) {
            bytes[index++] = (byte)(c >> 8);
            bytes[index++] = (byte)(c & 0xFF);
        }
        return bytes;
    }
}
