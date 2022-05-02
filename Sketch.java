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
  PImage imgStaredown;
  PImage imgYeezus;
  PImage imgDropout;
  char charAlbum = ' ';
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
    imgGraduation.resize(60, 60);

    imgThugger = loadImage("thugger.jpg");
    imgThugger.resize(600, 600);

    imgStaredown = loadImage("staredown.png");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    background(0);

    // uses mousePressed variable to change the backgroud to Kanye West's Graduation if the mouse is being pressed
    if (mousePressed){
      image(imgStaredown, 0, 0);
    }

    // uses keyPressed and key variables to output to the user they are pressing a key, and what key it is  
    if (keyPressed){
      textSize(12);
      text("You are currently", 445, 510);
      text("pressing this key: ", 445, 530);
      text(key, 545, 530);
    }
    
    // uses mouseX and mouseY variables to draw Kanye West at the position of the mouse
    image(imgKanye, mouseX - 2, mouseY - 5);

    // favourite album
    textSize(12);
    text("Pick the best Kanye album by typing the corresponding number:", 30, 50);
    text("1. The College Dropout", 30, 70);
    text("2. Yeezus", 30, 90);
    text("3. Graduation", 30, 110);

    if(keyPressed && charAlbum == '1'){
      text("Timeless Classic!", 30, 130);
      image(imgGraduation, 130, 120);
    }

    if(keyPressed && charAlbum == '2'){
      text("Excellent choice, but I pity your eardrums!", 30, 130);
      image(imgGraduation, 260, 120);
    }

    if(keyPressed && charAlbum == '3'){
      text("You love your synths!", 30, 130);
      image(imgGraduation, 150, 120);
    }

  }

  /**
   * Changes the background to Young Thug and Lil Durk when the mouse is pressed down and dragged
   */
  public void mouseDragged(){
    image(imgThugger, 0, 0);
  }

  /**
   * Outputs "Click" to the screen when the mouse is pressed at the coordinates of the mouse
   */
  public void mousePressed(){
    textSize(50);
    text("Click", mouseX, mouseY + 40);
    text("Click", mouseX, mouseY + 40);
    text("Click", mouseX, mouseY + 40);
  }

  public void keyTyped(){
    charAlbum = key;
  }
}