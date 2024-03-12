package com.advancedwoodcutting;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AdvancedWoodcuttingPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AdvancedWoodcuttingPlugin.class);
		RuneLite.main(args);
	}
}