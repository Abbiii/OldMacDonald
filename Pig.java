class Pig implements Animal 
{     
     private String myType;
     private String mySound;
     public Pig()
     {
     	myType = "unknown";
     	mySound = "unknown";
     }
     public Pig(String type, String sound)
     {
     	myType = type;
     	mySound = sound;
     }
     public String getType() {return myType;}
     public String getSound() {return mySound;}
}
