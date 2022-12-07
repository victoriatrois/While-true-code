type DataType = number | string;
type ConversionType = 'number' | 'text';

function combine(
  input1: DataType,
  input2: DataType,
  combinationType: ConversionType
) {
  let result;
  if (typeof input1 === 'number' && typeof input2 === 'number' || combinationType === 'number') {
    const addition = +input1 + +input2;
    result = addition;
  } else {
    const combination = input1.toString() + input2.toString();
    result = combination;
  }
  return result;
}

const combinedAges = combine(30, 26, 'number');
console.log(combinedAges);

const combinedStringAges = combine(30, 26, 'text');
console.log(combinedStringAges);

const combinedNames = combine('Vic', 'Dimi', 'text');
console.log(combinedNames);