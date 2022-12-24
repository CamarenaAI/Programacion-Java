void setup(){
size(600,600);
  text("Presiona el Boton para Encender o Apagar el LED",150,30);
  fill(170,0,0);
  ellipse(300,300,450,450);
  fill(255);
  text("Apagado",277,300);
}

void draw(){
}

void mousePressed(){
background(155);
text("Presiona el Boton para Encender o Apagar el LED",150,30);
if(mouseButton == LEFT){
fill(0,100,0);
ellipse(300,300,450,450); 
}

else if(mouseButton == RIGHT){
text("Presiona el Boton para Encender o Apagar el LED",150,30);
fill(178,34,34);
ellipse(300,300,450,450);
}
}

void mouseReleased(){
background(155);
if(mouseButton == LEFT){
text("Presiona el Boton para Encender o Apagar el LED",150,30);
fill(255,0,0);
ellipse(300,300,450,450); 
}

else if(mouseButton == RIGHT){
text("Presiona el Boton para Encender o Apagar el LED",150,30);
fill(124,252,0);
ellipse(300,300,450,450);
}
}
