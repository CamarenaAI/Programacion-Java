import processing.serial.*;

Serial myPort;


void setup(){
  size(1100,200);
  myPort = new Serial(this,"COM15",9600);
  for(int x=0; x<=1100; x=x+100){
    fill(255);
    rect(x,0,100,100);
    fill(255,0,0);
    rect(x,100,100,100);
  }    
}
int i = 0;

void draw(){
  fill(0);
  textSize(20);
  text("ALL ON",1015,55);
  textSize(20);
  text("ALL OFF",1011,159);

  if(cuadro==i){
    myPort.write(cuadro);
    myPort.write(cuadro);
    myPort.write(cuadro);
  }
  i++;
  if(i>22){
    i=0;
  }
  delay(100);
}





int cuadro = 0;

void mouseClicked(){
  //LED 1
  if(mouseX >= 0 && mouseX < 100 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 1;
    fill(0,255,0);
    rect(0,0,100,100);
    
    fill(255);
    rect(0,100,100,100);
  }
  if(mouseX >= 0 && mouseX < 100 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 2;
    fill(255);
    rect(0,0,100,100);
    
    fill(255,0,0);
    rect(0,100,100,100);
  }
  
  //LED 2
  if(mouseX >= 100 && mouseX < 200 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 3;
    fill(0,255,0);
    rect(100,0,100,100);
    
    fill(255);
    rect(100,100,100,100);
  }
  if(mouseX >= 100 && mouseX < 200 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 4;
    fill(255);
    rect(100,0,100,100);
    
    fill(255,0,0);
    rect(100,100,100,100);
  }
  
  //LED 3
  if(mouseX >= 200 && mouseX < 300 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 5;
    fill(0,255,0);
    rect(200,0,100,100);
    
    fill(255);
    rect(200,100,100,100);
  }
  if(mouseX >= 200 && mouseX < 300 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 6;
    fill(255);
    rect(200,0,100,100);
    
    fill(255,0,0);
    rect(200,100,100,100);
  }

  //LED 4
  if(mouseX >= 300 && mouseX < 400 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 7;
    fill(0,255,0);
    rect(300,0,100,100);
    
    fill(255);
    rect(300,100,100,100);
  }
  if(mouseX >= 300 && mouseX < 400 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 8;
    fill(255);
    rect(300,0,100,100);
    
    fill(255,0,0);
    rect(300,100,100,100);
  }
  
  //LED 5
  if(mouseX >= 400 && mouseX < 500 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 9;
    fill(0,255,0);
    rect(400,0,100,100);
    
    fill(255);
    rect(400,100,100,100);
  }
  if(mouseX >= 400 && mouseX < 500 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 10;
    fill(255);
    rect(400,0,100,100);
    
    fill(255,0,0);
    rect(400,100,100,100);
  }
  
  //LED 6
  if(mouseX >= 500 && mouseX < 600 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 11;
    fill(0,255,0);
    rect(500,0,100,100);
    
    fill(255);
    rect(500,100,100,100);
  }
  if(mouseX >= 500 && mouseX < 600 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 12;
    fill(255);
    rect(500,0,100,100);
    
    fill(255,0,0);
    rect(500,100,100,100);
  }

  //LED 7
  if(mouseX >= 600 && mouseX < 700 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 13;
    fill(0,255,0);
    rect(600,0,100,100);
    
    fill(255);
    rect(600,100,100,100);
  }
  if(mouseX >= 600 && mouseX < 700 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 14;
    fill(255);
    rect(600,0,100,100);
    
    fill(255,0,0);
    rect(600,100,100,100);
  }
  
  //LED 8
  if(mouseX >= 700 && mouseX < 800 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 15;
    fill(0,255,0);
    rect(700,0,100,100);
    
    fill(255);
    rect(700,100,100,100);
  }
  if(mouseX >= 700 && mouseX < 800 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 16;
    fill(255);
    rect(700,0,100,100);
    
    fill(255,0,0);
    rect(700,100,100,100);
  }
  
  //LED 9
  if(mouseX >= 800 && mouseX < 900 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 17;
    fill(0,255,0);
    rect(800,0,100,100);
    
    fill(255);
    rect(800,100,100,100);
  }
  if(mouseX >= 800 && mouseX < 900 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 18;
    fill(255);
    rect(800,0,100,100);
    
    fill(255,0,0);
    rect(800,100,100,100);
  }

  //LED 10
  if(mouseX >= 900 && mouseX < 1000 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 19;
    fill(0,255,0);
    rect(900,0,100,100);
    
    fill(255);
    rect(900,100,100,100);
  }
  if(mouseX >= 900 && mouseX < 1000 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 20;
    fill(255);
    rect(900,0,100,100);
    
    fill(255,0,0);
    rect(900,100,100,100);
  }
  
  //ALL LEDS
  if(mouseX >= 1000 && mouseX < 1100 && mouseY >= 0 && mouseY < 100 ){
    cuadro = 21;
    for(int x=0; x<=1100; x=x+100){
      fill(0,255,0);
      rect(x,0,100,100);
      fill(255);
      rect(x,100,100,100); 
    }
  }
  if(mouseX >= 1000 && mouseX < 1100 && mouseY >= 100 && mouseY < 200 ){
    cuadro = 22;
    for(int x=0; x<=1100; x=x+100){
      fill(255,0,0);
      rect(x,100,100,100);
      fill(255);
      rect(x,0,100,100);
    }
  }


}


void mouseMoved(){
  print(mouseX);
  print(" ");
  println(mouseY);
}
