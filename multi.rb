def main
  # Text
  text = "
    function hello() {
      console.log(\"name\tage\");   
    }
  
    hello();
  "
  # text = textwrap.dedent(text).strip()
  puts text
  # Binary
  data = [
    "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!",
    "\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00",
    "\x00\x02\x02L\x01\x00;",
  ].join.b
  puts data.length
end

main
