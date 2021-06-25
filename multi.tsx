import React from "https://esm.sh/react";

function main() {
  // Text
  const text = `
    function hello() {
      console.log("name\tage");   
    }

    hello();
  `;
  console.log(text);
  // JSX
  const more = <div>
    function hello() &#x7B;
      console.log("name\tage");   
    {"}"}

    hello();
  </div>;
  console.log(more.props.children);
  // Binary
  const data = Uint8Array.from(
    Array.from(
      // atob("R0lGODlhAQABAIABAP///wAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw=="),
      (
        "GIF89a\x01\x00\x01\x00\x80\x01\x00\xff\xff\xff\x00\x00\x00!" +
        "\xf9\x04\x01\n\x00\x01\x00,\x00\x00\x00\x00\x01\x00\x01\x00" +
        "\x00\x02\x02L\x01\x00;"
      ),
    ).map((c) => c.charCodeAt(0)),
  );
  // console.log(data);
  console.log(data.length);
}

main();
