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
  int getX()
  {
    return x;
  }
  int getY()
  {
   return y; 
  }
  int getSize()
  {
   return size; 
  }
  void move()
  {
    x+=speed;
    if(x > width)
    {
      x= 0;
    }else if (x < 0)
    {
     x = 400; 
    }
  }
  
  void display() 
  {
    fill(0, 255, 0);
    rect(x, y, size, 50);
  }
}
Car c = new Car(5,200,60,5);
Car a = new Car(15, 100, 50, -5);
Car b = new Car (20,300,50, -4);
Car d = new Car (10, 50, 65, 1);
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
  b.display();
  d.display();
  c.move();
  a.move();
  b.move();
  d.move();
  intersects(a);
  intersects(b);
  intersects(c);
  intersects(d);
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
boolean intersects (Car car) {
  if ((frogY > car.getY() && frogY < car.getY() +50)&&
  (frogX > car.getX() && frogX < car.getX()+car.getSize()))
  {
    return true;
  }
  else
  {
    return false;
  }}
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