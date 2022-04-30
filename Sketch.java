import processing.core.PApplet;
import processing.core.PImage;  
/**
 * Description: A program that demonstrates user input in processing
 * @author: L. Pei 
 */
public class Sketch extends PApplet {
  //global variables
  PImage imgKanye;
  PImage imgGraduation;
  PImage imgThugger;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // assign images to global image variables
    imgKanye = loadImage("kanye.png");
    imgKanye.resize(30, 34);

    imgGraduation = loadImage("graduation.png");
    imgGraduation.resize(600, 600);

    imgThugger = loadImage("thugger.jpg");
    imgThugger.resize(600, 600);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(0);

    // uses mousePressed variable to change the backgroud to Kanye West's Graduation if the mouse is being pressed
    if (mousePressed){
      image(imgGraduation, 0, 0);
    }

    // uses keyPressed and key variables to output to the user they are pressing a key, and what key it is  
    if (keyPressed){
      text("You are currently", 350, 100);
      text("pressing this key: ", 350, 120);
      text(key, 445, 120);
    }
    
    // uses mouseX and mouseY variables to draw Kanye West at the position of the mouse
    fill(255);
    image(imgKanye, mouseX - 2, mouseY - 5);
    }

  
  public void mouseDragged(){
    image(imgThugger, 0, 0);
  }
}