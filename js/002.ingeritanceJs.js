class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  greet() {
    console.log("Hello, " + this.name, this.age);
  }
}

// class Employee{
//     constructor(name, age, salary) {

//     }
// }

class Employee extends Person {
  constructor(name, age, salary) {
    super(name, age);
    this.salary = salary;
  }
  display1() {
    super.greet(), console.log("salary:", this.salary);
  }
}
const e1 = new Employee("apparao", 97, 2000);
e1.display1();

