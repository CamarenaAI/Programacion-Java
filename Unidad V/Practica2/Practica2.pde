void setup(){
size(600,600);
background(10,0,10);
}

void draw(){
}

void mousePressed(){
background(155);
text("Mouse button keeps pressed",width/2,height/2);
if(mouseButton == LEFT){
text("It was leftt button",width/2,height/4);
}
else if(mouseButton == RIGHT){
text("It was right button",width/2,height/4);
}
else if (mouseButton == CENTER){
text("It was center button",width/2,height/4);
}
}

void mouseClicked(){
background(255,0,0);
text("Mouse is beggin clicked",width/2,height/2);
}

void mouseDragged(){
background(155);
text("Mouse is beggin dragged",width/2,height/2);
}

void mouseReleased(){
background(155);
text("Mouse is beggin released",width/2,height/2);
}

void mouseMoved(){
println(mouseX);
println(mouseY);
}
