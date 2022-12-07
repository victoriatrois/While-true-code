enum Role {ADMIN = 1, READ_ONLY, AUTHOR};

const person = {
  name: 'Victoria',
  age: 29,
  hobbies: ['Walking', 'Seeing friends'],
  role: 1
};

let favoriteActivities: string[];
favoriteActivities = ['Spending time with family'];

console.log(person);

for (const hobby of person.hobbies) {
  console.log(hobby.toUpperCase());
}

if (person.role === Role.ADMIN) {
  console.log('is admin')
}