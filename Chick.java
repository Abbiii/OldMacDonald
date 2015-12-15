class Chick implements Animal 
{
	 private String myType;
     private String mySound;
     public Chick()
     {
     	myType = "unknown";
     	mySound = "unknown";
     }
     public Chick(String type, String sound)
     {
     	myType = type;
     	mySound = sound;
     }
     public Chick(String type, String sound1, String sound2)
     {
     	myType = type;
     	if (Math.random() < .5)
     		mySound = sound1;
     	else mySound = sound2;
     }
     public String getType() {return myType;}
     public String getSound() {return mySound;}
}
