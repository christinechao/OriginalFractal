import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

 public void setup() 
{   
  size(800,800);    
 // noLoop(); 
  colorMode(HSB);
  frameRate(8);
} 

public void draw() 
{ 
  background(255);   
//  fill((int)(Math.random()*255),255/2,255, 50);
  // drawFractal( 200, 400, 400); //left
  // drawFractal( 400, 200, 400); //top
int randomNumb = (int)(Math.random()*600 + 100);
int randomNumb2 = (int)(Math.random()*600 + 100);
int randomNumb3 = (int)(Math.random()*350 + 50);

  drawFractal( randomNumb, randomNumb2, randomNumb3); 
  drawFractal( 400, 400, 500); //
} 

public void drawFractal(int x,int y, int siz) 
{ 
  //fill(#70C6AF);
  // stroke(#70C6AF);
  // strokeWeight(2);
  // noFill();
  noStroke();
  fill((int)(Math.random()*255),255/2,255, 50);
  ellipse(x, y, siz, siz);
  if(siz > 10)
  {
    // drawFractal(x+15, y+15, siz-50);
    // drawFractal(x-15, y-15, siz-50);
    drawFractal(x, y, siz-50);
    // drawFractal(x-15, y+15, siz-50);
  }
} 

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
