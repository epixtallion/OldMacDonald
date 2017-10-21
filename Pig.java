class Pig implements Animal 
{
	protected String myType;
	protected String mySound;
	public Pig(){
		myType = "unknown";
		mySound = "unknown";
	}
	public Pig(String type, String sound){
		myType = type;
		mySound = sound;
	}
	public void setSound(String s){
		mySound = s;
	}
	public String getSound(){
		return mySound;
	}
  public void setType(String s){
		myType = s;
	}
	public String getType(){
		return myType;
	}
}
