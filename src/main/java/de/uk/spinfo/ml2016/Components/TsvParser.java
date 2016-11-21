package de.uk.spinfo.ml2016.Components;

import java.util.List;

import de.uk.spinfo.ml2016.Structures.Tool;
import de.uk.spinfo.ml2016.Structures.ToolPart;
import de.uk.spinfo.ml2016.Structures.ToolSub;

public class TsvParser {

	private List<Tool> tools;
	private List<ToolPart> toolParts;
	private List<ToolSub> toolSubs;

	public List<Tool> getTools() {
		return tools;
	}

	public List<ToolPart> getToolParts() {
		return toolParts;
	}

	public List<ToolSub> getToolSubs() {
		return toolSubs;
	}
	
}
