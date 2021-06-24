import React from 'https://esm.sh/react';

function main() {
  // Text
  const text = `
    function hello() {
      print("name\tage");   
    }

    hello();
  `;
  console.log(text);
  const more = <div>
    function hello() &#x7B;
      print("name\tage");   
    {"}"}

    hello();
  </div>;
  console.log(more.props.children);
}

main();
