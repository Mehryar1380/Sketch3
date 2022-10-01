void setup(){
  size(500,500);
  
}
void draw(){
  float x =random(500);
  float y = random(500);
  float z =0;

 float t = random(500);

for(int i =0;i<1000;i++){
  x = sin(i*x)*t; // Creates a x cordinate for the  series of lines that mimic a vanishing point on the left side
   z = tan(i*z)*t; // Creates a x cordinate for the  series of lines that mimin a vanishing point on the right side 
line(x,y,200,200);

line(z+500,y,200,200);


  t = random(500);

  }
   
}
