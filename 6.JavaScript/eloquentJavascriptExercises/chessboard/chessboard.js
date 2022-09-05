let boardSize = 8;
let boardSquares = "";

for (let y = 0; y < boardSize; y++) {
  for (let x = 0; x < boardSize; x++) {
    if ((x + y) % 2 == 0) {
      boardSquares += "  ";

    } else {
      boardSquares += "#";

    }
  }
  boardSquares += "\n";

}
console.log(boardSquares);