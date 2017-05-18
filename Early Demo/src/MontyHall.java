import java.util.Random;
import javax.swing.*;
public class MontyHall{
 Door one ;
 Door two ;
 Door three;
 Door x;
 Door y;
 Door z;
 Door a;
 Door b;
 Random test = new Random();
 Door[] list;
 Door[] allDoors;
 int doors;
 Statistics stats;

 public MontyHall(int numberOfDoors) {
   doors=numberOfDoors;
  int count=0;
  int secondCount=0;
  String tmp;


  allDoors=new Door[doors];
  for (int i=0;i<doors;i++){
   secondCount+=1;
    tmp=Integer.toString(secondCount);
   allDoors[i]=new Door(tmp);
  }

 }
 public void runGames(int number,boolean command){
  stats= new Statistics(doors);
  if (command==false){
   for(int i=0;i<number;i++){
   oneGame();
   }
   System.out.println(stats);
  }
  else{
   for(int i=0;i<number;i++){
   oneGame();
   }
   JOptionPane.showMessageDialog (null,stats.toString(), "Results", JOptionPane.INFORMATION_MESSAGE);
  }
 }
 public void oneGame(){
  for(int i=0;i<doors;i++){
   allDoors[i].reset();
  }
  x=pickADoor();
  x.choose();
  y=pickADoor();
  y.setPrize();
  //System.out.println(x.getName());
  //System.out.println(y.getName());
  openOtherDoors(x,y);
  stats.updateStatistics(allDoors);
 }
 private int rand(int min, int max){
  int randomNumber=test.nextInt((max-min)+1)+min;
  return randomNumber;
 }

 private Door pickADoor(){
  int randomNumber=test.nextInt(doors);
  return allDoors[randomNumber];
 }
 
 private void openOtherDoors(Door chosen,Door prize){
  int z=Integer.parseInt(chosen.door);
  if ((chosen.door).equals(prize.door)){

   int randomNumber=rand(1,doors);

   if (randomNumber==(z)){
    while (randomNumber==z){
    randomNumber=rand(1,doors);
   }

   }
   String tmp=Integer.toString(randomNumber);
   for (int i=0;i<doors;i++){
   if (allDoors[i].isChosen()==false && ((allDoors[i].door).equals(tmp))==false&&(tmp.equals("0"))==false){
    allDoors[i].open();

   }
  }

  }
  else{
   for (int i=0;i<doors;i++){
   if (allDoors[i].isChosen()==false && allDoors[i].hasPrize()==false){
    allDoors[i].open();

   }
  }

  }

  for (int i=0;i<doors;i++){
   if (allDoors[i].isOpen()==true){
    //System.out.println(allDoors[i].getName());
   }
  }
 }


 public static void main(String[]args){

  int w=0;
  int numberOfSim;
  int numberOfDoors;
  boolean command=true;

  if (args.length==2){
   numberOfSim=Integer.parseInt(args[0]);
   numberOfDoors=Integer.parseInt(args[1]);
   command=true;
  }
  else{
   numberOfSim = Integer.parseInt(JOptionPane.showInputDialog("Input the number of games to play", "1000"));
   numberOfDoors = Integer.parseInt(JOptionPane.showInputDialog("Input the number of doors", "3"));
   command=false;
  }
  MontyHall game = new MontyHall(numberOfDoors);
  game.runGames(numberOfSim,command);



 }

}
class Door{
 boolean open=false;
 boolean selection=false;
 boolean prize=false;
 String door;

 Door (String identity){
  door=identity;
 }
 public void reset(){
  open=false;
  selection=false;
  prize=false;

 }
 public void open(){
  open=true;
  //System.out.println("Door "+door +" is open");


 }
 public boolean isOpen(){
  if (open==true){

  }
  return (open);

 }
 public boolean hasPrize(){

  return prize;

 }
 public boolean isChosen(){
  if (selection==true){

  }
  return(selection);
 }
 public void choose(){
  selection=true;
  //System.out.println("Door " + door+" is chosen by the player");
 }
 public void setPrize(){
  prize=true;
  //System.out.println("Door " + door+" has the prize");
 }
 public String getName(){

  return (door);
 }
}

class Statistics{
 int switchWin=0;
 int switchLose=0;
 int totalGames=0;
 int[][] list;
 int doors;
 int prizeIndex;
 int selectIndex;
 int totalChosen;
 int totalOpen;
 int totalPrize;

  public Statistics(int numberOfDoors){
   doors=numberOfDoors;
   list= new int[doors][];
   for (int i=0;i<doors;i++){
    list[i]=new int[3];
   }
  }
  public void updateStatistics(Door[] doorArray){

   for (int i=0;i<doors;i++){
    int z=Integer.parseInt((doorArray[i]).door);
    if(doorArray[i].isChosen()==true&&doorArray[i].hasPrize()==true){

     list[z-1][0]+=1;
     list[z-1][2]+=1;
     switchLose+=1;
     totalChosen+=1;
     totalPrize+=1;

    }
    else if(doorArray[i].isChosen()==true){

     list[z-1][0]+=1;
     selectIndex=z;
     totalChosen+=1;

    }

    else if(doorArray[i].isOpen()==true){

     list[z-1][1]+=1;
     totalOpen+=1;

    }

    else if(doorArray[i].hasPrize()==true){

     list[z-1][2]+=1;
     prizeIndex=z;
     totalPrize+=1;

    }

   }
   totalGames+=1;
   switchWin=totalGames-switchLose;

  }
  public String toString(){
   String []output= new String [4];
   output[0]="Number of Games Played: "+totalGames+"\n";
   output[0]=output[0]+"Staying strategy won "+ switchLose+" times "+ (switchLose*100/totalGames)+"%\n";
   output[0]=output[0]+"Switching strategy won "+ switchWin+" times "+ (switchWin*100/totalGames)+"%\n";
   output[1]=("Chosen Doors\n");

   for (int i=0;i<(list).length;i++){
    output[1]=output[1]+"Door "+(i+1)+": "+ list[i][0]+ " "+ ((list[i][0])*100/totalChosen)+"%\n";
   }
   output[2]=("Opened Doors\n");
   for (int i=0;i<(list).length;i++){
    output[2]=output[2]+"Door "+(i+1)+": "+ list[i][1]+" "+ ((list[i][1])*100/totalOpen)+"%\n";
   }
   output[3]=("Prize Doors\n");
   for (int i=0;i<(list).length;i++){
    output[3]=output[3]+"Door "+(i+1)+": "+ list[i][2]+" "+ ((list[i][2])*100/totalPrize)+"%\n";
   }

   output[0]=output[0]+output[1]+output[2]+output[3];
   return output[0];
  }


  public String toCSV(){
   String []output= new String[4];
   output[0]="Number of Games "+ totalGames+"\nNumber of Doors "+ doors+"\n,Wins,Losses\n"+"Staying strategy "+switchWin+","+switchLose+"\nStaying strategy "+ switchLose+ ", " +switchWin+"\n";
   output[1]=",Selected doors, Winning doors, Open doors\n";
   output[2]="";
   for (int i=0;i<(list).length;i++){
    output[2]=output[2]+"Door "+ (i+1)+","+list[i][0]+","+list[i][1]+","+list[i][2]+"\n";

    }

   output[0]=output[0]+output[1]+output[2];
   return output[0];
  }
}
