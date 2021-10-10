const object = { a: 1, b: 2, c: 3,"boy":22 };

for (let property in object) {
  console.log(`${property}: ${object[property]}`);
}
