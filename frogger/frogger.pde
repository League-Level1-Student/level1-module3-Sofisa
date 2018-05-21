class Car {
  int x;
  int y;
  int size;
  int speed;
  Car(int x, int y, int size, int speed) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.speed = speed;
  }
  void display() 
  {
    fill(0, 255, 0);
    rect(x, y, size, 50);
  }
}
Car c = new Car(5,200,60,50);
Car a = new Car(15, 100, 50, 50);
int frogX = 200;
int frogY = 375;
int hop = 20;
void setup () {
  size(400, 400);
}
void draw() {
  background(0, 0, 0);
  fill(0, 238, 68);
  ellipse(frogX, frogY, 20, 20);
  boundaries();
  c.display();
  a.display();
}
void boundaries() {
  if (frogX < 0) {
    frogX = 0;
  }
  if (frogX > 400) {
    frogX = 400;
  }
  if (frogY < 0) {
    frogY = 0;
  }
  if (frogY >400) {
    frogY = 400;
  }
}
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      frogY -= hop;
    } else if (keyCode == DOWN)
    {
      frogY += hop;
    } else if (keyCode == RIGHT)
    {
      frogX += hop;
    } else if (keyCode == LEFT)
    {
      frogX -= hop;
    }
  }
}