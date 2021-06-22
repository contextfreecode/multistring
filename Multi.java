class Multi {
    /**
     * @param args the command line arguments, where e.g. "java Multi.java hi"
     *             gives an array of just one element: "hi".
     */
    public static void main(String[] args) throws Exception {
        var text = """
            Parameters
            ----------
            a : array_like
                The shape and data-type of `a` define these same attributes of
                the returned array.
            dtype : data-type, optional
                Overrides the data type of the result.
        """;
        System.out.println(text);
        var data =
            "\u4749\u4638\u3961\u0100\u0100\u8001\u00ff\uffff\u0000\u0021" +
            "\uf904\u010a\u0001\u002c\u0000\u0000\u0100\u0100\u0002\u024c" +
            "\u0100\u3b00";
        for (var c: data.toCharArray()) {
            System.out.printf("%02x\n", c >> 8);
            System.out.printf("%02x\n", c & 0xFF);
        }
        var d2 = Multi.class.getResourceAsStream("pixel.png").readAllBytes();
        for (var b: d2) {
            System.out.printf("%02x\n", b);
        }
        // var data =
        //     "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!" +
        //     "\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00" +
        //     "\x00\x02\x02L\x01\x00;";
        // var data = new byte[] {
        //     0x47, 0x49, 0x46, 0x38, 0x39, 0x61, 0x01, 0x00, 0x01, 0x00, 0x80,
        //     0x01, 0x00, 0xff, 0xff, 0xff, 0x00, 0x00, 0x00, 0x21, 0xf9, 0x04,
        //     0x01, 0x0a, 0x00, 0x01, 0x00, 0x2c, 0x00, 0x00, 0x00, 0x00, 0x01,
        //     0x00, 0x01, 0x00, 0x00, 0x02, 0x02, 0x4c, 0x01, 0x00, 0x3b
        // }
    }
}
