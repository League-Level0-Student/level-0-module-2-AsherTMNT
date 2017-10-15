int cookies=0;
void setup(){
  size(1000,1000);
  textSize(50);
}

void mouseClicked(){
  cookies+=1;
 
}

void draw(){
  noStroke();
  background(255, 255, 255);
  if(mousePressed==true){
  fill(random(255), random(255), random(255));
  ellipse(500,500,490,490);
  fill(0, 0, 0);
  ellipse(500, 500, 45, 45);
  ellipse(400, 350, 45, 45);
  ellipse(565, 400, 45, 45);
  ellipse(470, 600, 45, 45);
  ellipse(380, 550, 45, 45);
  ellipse(650, 550, 45, 45);
  text(cookies+" Cookies", 375, 100);
  }else{
  fill(random(255), random(255), random(255));
  ellipse(500,500,500,500);
  fill(0, 0, 0);
  ellipse(500, 500, 55, 55);
  ellipse(400, 350, 55, 55);  
  ellipse(565, 400, 55, 55);
  ellipse(470, 600, 55, 55);
  ellipse(380, 550, 55, 55);
  ellipse(650, 550, 55, 55);
  text(cookies+" Cookies", 375, 100);
} 
}