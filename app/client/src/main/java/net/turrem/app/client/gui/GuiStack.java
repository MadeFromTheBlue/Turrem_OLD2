package net.turrem.app.client.gui;

import java.util.ArrayList;

import net.turrem.app.client.render.IScreenLayer;
import net.turrem.app.client.render.RenderEngine;
import net.turrem.app.client.render.fbo.DiffuseFBO;

public class GuiStack implements IScreenLayer
{
	public ArrayList<GuiWindow> stack = new ArrayList<GuiWindow>();
	private boolean isOutdated = true;
	
	@Override
	public boolean hasContent()
	{
		return !this.stack.isEmpty();
	}
	
	@Override
	public boolean pauseRequested()
	{
		return false;
	}
	
	public void markOutdated()
	{
		this.isOutdated = true;
	}
	
	@Override
	public void render(RenderEngine engine, DiffuseFBO target)
	{
		this.isOutdated = false;
	}
	
	@Override
	public boolean isOutdated()
	{
		return this.isOutdated;
	}
}
