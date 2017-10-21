class NamedCow extends Cow
{
	protected String myName;
	public String getName(){
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
