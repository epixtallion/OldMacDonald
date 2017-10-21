class Chick implements Animal 
{
	protected String myType;
	protected String mySound;
	protected String mySound2;
	public Chick(){
		myType = "unknown";
		mySound = "unknown";
		mySound2 = "unknown";
	}
 	public Chick(String type, String sound, String sound2){
		myType = type;
		mySound = sound;
		mySound2 = sound2;
	}
	public String getSound(){
		return Math.random()<.5 ? mySound2 : mySound2;
	}
  public void setSound(String sound){ mySound = sound; }
  public String getType(){ return myType; }
  public void setType(String type){ myType = type; }
} 
