class Square{
  constructor(side) {
    this.side = side;
  }
  perimeter() {
    return 4 * this.side;
  }
  area() {
    return this.side * this.side;
  }

  getDetails() {
    const side = this.side;
    const area = this.area();
    const perimeter = this.perimeter();

    return { side, area, perimeter };
  }

}

const square1 = new Square(10);
const square2 = new Square(20);

/*
console.log(square1.side)
console.log(square1.area())
console.log(square1.perimeter())
*/
console.log(square1.getDetails())
console.log(square1 instanceof Square);
