void setup(){
size(600,600);
background(0,0);

//strokeWeight(50);  //Ancho
//stroke(0,0,255);  //Color Contorno
fill(255,60,5);      //Color Figura   

quad(10,10, 590,10, 590,590, 10,590); //Cuadrilatero(x1,y1,x2,y2,x3,y3)

strokeWeight(10);
stroke(0,0,255);
line(20,20,580,580); //Linea (X1,Y1,X2,Y2)
line(20,580,580,20); //Linea (X1,Y1,X2,Y2)

strokeWeight(50);
stroke(255,255);
ellipse(300,300,450,450); //Circulo(x,y,w,h)

fill(30,70);
strokeWeight(0);
stroke(220,355); 
ellipse(300,300,400,400); //Circulo(x,y,w,h)
}

void draw(){
 /*rect(0,0,50,100); //Rectangulo(x,y,w,h)
ellipse(150,150,50,40); //Elipse(x,y,w,h)
ellipse(100,100,50,50); //Circulo(x,y,w,h)
triangle(10,300,10,500,100,500); //Triangulo (x1,y1,x2,y2,x3,y3)
*/
}
