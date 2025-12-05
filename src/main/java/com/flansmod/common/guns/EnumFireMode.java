package com.flansmod.common.guns;

public enum EnumFireMode 
{
	SEMIAUTO,
	FULLAUTO,
	MINIGUN,
	BURST,
	RAILGUN;
	
	public static EnumFireMode getFireMode(String s)
	{
		s = s.toLowerCase();
		if(s.equals("fullauto"))
			return FULLAUTO;
		if(s.equals("minigun"))
			return MINIGUN;
		if(s.equals("burst"))
			return BURST;
		if(s.equals("railgun"))
			return RAILGUN;
		return SEMIAUTO;
	}
}
