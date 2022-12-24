int r, g, b;

void setup(){
size (600,600);
}

void draw(){
background(r,g,b);
}

void keyPressed(){
r = (int) random(0,255);
g = (int) random(0,255);
b = (int) random(0,255);
println(keyCode);
}


//rojo arriba
//azul derecha
//verde izquierda
//amarillo abajo
