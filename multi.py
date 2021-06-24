def main():
    """
    Function `main` runs the main program, doncha know.
    """

    # Text
    text = """
      function hello() {
        print("name\tage");   
      }
      
      hello();
    """
    print(text)
    # Data
    data = (
        b"GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!"
        b"\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00"
        b"\x00\x02\x02L\x01\x00;"
    )
    print(len(data))


main()


# https://github.com/numpy/numpy/blob/31e232c47e6be5ddc1c2433ccb97cec1640df012/numpy/core/numeric.py#L76
# Parameters
# ----------
# a : array_like
#     The shape and data-type of `a` define these same attributes of
#     the returned array.
# dtype : data-type, optional
#     Overrides the data type of the result.


# http://probablyprogramming.com/2009/03/15/the-tiniest-gif-ever
# In [1]: import base64
# In [2]: base64.b64decode('R0lGODlhAQABAIABAP///wAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==')
# Out[2]: b'GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00\x00\x02\x02L\x01\x00;'
# In [10]: a = base64.b64decode('R0lGODlhAQABAIABAP///wAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==')
# In [11]: ", ".join(f"0x{_:02x}" for _ in a)
# Out[11]: '0x47, 0x49, 0x46, 0x38, 0x39, 0x61, 0x01, 0x00, 0x01, 0x00, 0x80, 0x01, 0x00, 0xff, 0xff, 0xff, 0x00, 0x00, 0x00, 0x21, 0xf9, 0x04, 0x01, 0x0a, 0x00, 0x01, 0x00, 0x2c, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x01, 0x00, 0x00, 0x02, 0x02, 0x4c, 0x01, 0x00, 0x3b'
# In [3]: with open("pixel.png", "wb") as out: out.write(a)
