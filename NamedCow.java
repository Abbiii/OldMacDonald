class NamedCow extends Cow
{
	private String mooName;
	public NamedCow()
	{
		mooName = "unknown";
	}
	public NamedCow(String type, String name, String sound)
	{
		myType = type;
		mooName = name;
		mySound = sound;
	}
	public String getName() {return mooName;}
}
