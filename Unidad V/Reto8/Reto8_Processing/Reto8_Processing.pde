import processing.serial.*;


Serial P;

int i=1;
int q;
int k;
void setup() {
  P = new Serial(this, "COM6", 9600);
  size(600, 600);
  background(155);
}

void draw() {
  if (P.available() > 0) {
    k = P.read();
  }
      background(155);

    if (i==1) {
      fill(100, 200, 255);
      ellipse(300, q, 50, 50);
      q=q+k;
    }
    
    if (q>=575) {
      i=0;
    }
    if (i==0) {
      fill(100, 200, 255);
      ellipse(300, q, 50, 50);
      q=q-k;
    }
    if (q<=280) {
      i=1;
    }
   
    
    println(k);
    delay(3);
  }
  
