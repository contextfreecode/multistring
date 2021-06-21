class Multi {
    /**
     * @param args the command line arguments, where e.g. "java Multi.java hi"
     *             gives an array of just one element: "hi".
     */
    public static void main(String[] args) {
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
    }
}
