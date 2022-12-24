import processing.serial.*;
Serial myPort; // Creamos un objeto llamado port de la clase Serial

//Variables para definir la pelota
float ballX;
float ballY;
float ballDir = 1;
float ballSize = 20;         //Radio
float direccion = 1;         //Dirección

//Variables para definir el disco
int anchoDisco = 30;
int largoDisco = 55;
int posDisco;                //Neva posición
int ultPosDisco;            //Ultima posición
int Distancia = 1;          

void setup(){
myPort = new Serial(this,"COM15", 9600);
size(255, 255);
rectMode(CENTER);
ellipseMode(CENTER);
noStroke();
smooth();
ballY = height/2;
ballX = 1;
}

void draw(){
background(51);
ballX += ballDir * 2.0;
ballY += direccion;

if(ballX > width + ballSize) {
ballX = - width/2 - ballSize;
ballY = random(0, height);
direccion = 0;
}

if (myPort.available() > 0) {               //Si el dato está disponible,
ultPosDisco = posDisco;                     //Guarda la ultima posición
posDisco = myPort.read();                  //Lee y almacena la nueva posición
}

//Desplaza el disco verticalmente en la pantalla
float discoY = constrain(posDisco, anchoDisco, height - largoDisco);

//Testea si la pelota toca el disco
float posicionY = width - Distancia  - anchoDisco - ballSize;
if(ballX == posicionY
&& ballY > discoY - largoDisco - ballSize
&& ballY < discoY + largoDisco + ballSize) {
ballDir *= -1;
if(posDisco != ultPosDisco) {
direccion = (posDisco - ultPosDisco/2.0);
if(direccion > 5) {direccion = 5; }
if(direccion < -5) {direccion = -5; }
}
}

// Si la pelota toca el disco o la pared, cambia de dirección
if(ballX < ballSize && ballDir == -1) {
ballDir *= -1;
}

// Si la pelota toca la parte superior o inferior del borde, cambia dirección
if(ballY > height - ballSize) {
direccion = direccion * -1;
}
if(ballY < ballSize) {
direccion = direccion * -1;
}

// Dibuja la pelota
fill(255);
ellipse(ballX, ballY, ballSize, ballSize);
stroke(255,255,255);

// Dibuja el disco
fill(153);
ellipse(width - Distancia, discoY, anchoDisco, largoDisco);
}
