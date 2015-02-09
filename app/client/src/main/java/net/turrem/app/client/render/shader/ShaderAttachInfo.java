package net.turrem.app.client.render.shader;

public class ShaderAttachInfo
{
	public static enum Error
	{
		NONE,
		PROGRAM_NOT_CREATED,
		SHADER_NOT_CREATED,
		LINK_ERROR;
	}
	
	public ShaderAttachInfo(Error state, String log)
	{
		this.state = state;
		this.log = log;
	}
	
	public final Error state;
	public final String log;
}