let userInput : unknown; // unknown isn't a type we should use all the time, but it's better than the 'any' type.

let userName : string;

userInput = 5;
userInput = 'Max';
if (typeof userInput === 'string') {
  userName = userInput;
}

function gererateErrorMessage(message : string, code : number) : never {
  throw {
    message : message,
    errorCode: code
  };
}

gererateErrorMessage('An error occurred', 500);