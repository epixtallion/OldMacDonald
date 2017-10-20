class NamedCow extends Cow
{
	protected string myName;
	public string getName(){
		return myName;
	}
	public NamedCow(String type, String name, String sound){
		myName = name;
		mySound = sound;
		myType = type;
	}
	public NamedCow(){
		myName = "unknown";
	}
}