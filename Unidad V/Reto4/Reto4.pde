int a, b, c, d;

void setup(){
size (600,600);
}

//Tecla Arriba
void draw(){
if(keyCode == 38){
background(255,0,0);
}

//Tecla Derecha
if(keyCode == 37){
background(0,255,0);
}

//Tecla Izquierda
if(keyCode == 39){
background(30,144,255);
}

//Tecla Abajo
if(keyCode == 40){
background(255,255,0);
}

}

void keyPressed(){
}
