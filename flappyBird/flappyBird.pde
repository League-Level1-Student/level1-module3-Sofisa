
float birdYVelocity = 0;   
float gravity = 0.75;

float birdX = 100;
float birdY = 500;

float pipeX = 900;
int pipeHeight = 350;

int score = 0;

void setup ()
{
  size (1000,1000);
}

void draw()
{
  background(157, 207, 232);
  fill(255, 230, 165);
  stroke(255, 230, 165);
  ellipse(birdX, birdY, 35, 35);
  fill(85, 119, 68);
  stroke(85, 119, 68);
  fill(0, 0, 0);
  ellipse(birdX + 3, birdY - 3, 5, 5);
  rect(pipeX, 0, 100, pipeHeight);
  rect(pipeX, pipeHeight + 200, 100, 1000);
  birdYVelocity += gravity;
  birdY += birdYVelocity;
  pipeX -= 5;
  pipeTeleport();
  if(checkWilsion())
  {
    System.exit(0);
  }
  text("WILSION\'S SCORE: " + score, 10, 10);
}

void mousePressed()
{
  birdYVelocity = -13;
}

void pipeTeleport()
{
  if(pipeX <= -100)
  {
   pipeX = 1000; 
   pipeHeight = (int) random(100, 400);
  }
}

boolean checkWilsion ()
{
   if (birdY - 12.5 < pipeHeight && birdX > pipeX && birdX < (pipeX+100))
 {
   return true;
 }
   else if (birdY> pipeHeight + 200 && birdX > pipeX && birdX < (pipeX+100))
    {
      return true;
    }
    else
    {
      return false;
    } 
}
  