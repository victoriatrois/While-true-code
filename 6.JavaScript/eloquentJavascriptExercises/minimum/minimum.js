function selectMinimum(value1, value2) {
  minimumValue = Math.min(value1, value2);
  return minimumValue;
}

console.log(selectMinimum(0, 10));
// → 0
console.log(selectMinimum(0, -10));
// → -10