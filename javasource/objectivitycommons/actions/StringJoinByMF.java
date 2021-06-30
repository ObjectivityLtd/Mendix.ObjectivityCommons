// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package objectivitycommons.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Same as StringJoin, but getting the string value to join from each entity is different: calls the given MICROFLOW instead of an ATTRIBUTE.
 * The microflow should accept the entity as param and return string as result.
 */
public class StringJoinByMF extends CustomJavaAction<java.lang.String>
{
	private java.util.List<IMendixObject> List;
	private java.lang.String Separator;
	private java.lang.String Microflow;

	public StringJoinByMF(IContext context, java.util.List<IMendixObject> List, java.lang.String Separator, java.lang.String Microflow)
	{
		super(context);
		this.List = List;
		this.Separator = Separator;
		this.Microflow = Microflow;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String sep = Optional.ofNullable(this.Separator).orElse("");
		IContext ctx = this.getContext();
		List<String> parts = new ArrayList<String>();
		for (IMendixObject obj : this.List) {
			Object val = Core.execute(ctx, this.Microflow, obj);
			parts.add((val == null) ? null : val.toString());
		}
		return String.join(sep, parts);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StringJoinByMF";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
