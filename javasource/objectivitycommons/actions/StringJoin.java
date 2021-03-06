// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package objectivitycommons.actions;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * See:
 * JamCommons: StringJoin
 * Java: String.join
 * JavaScript: Array.join
 */
public class StringJoin extends CustomJavaAction<java.lang.String>
{
	private java.util.List<IMendixObject> List;
	private java.lang.String Separator;
	private java.lang.String Attribute;

	public StringJoin(IContext context, java.util.List<IMendixObject> List, java.lang.String Separator, java.lang.String Attribute)
	{
		super(context);
		this.List = List;
		this.Separator = Separator;
		this.Attribute = Attribute;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String sep = Optional.ofNullable(this.Separator).orElse("");
		String atr = Optional.ofNullable(this.Attribute).orElse("");
		IContext ctx = this.getContext();
		List<String> parts = this.List.stream().map((obj) -> {
			Object val = obj.getValue(ctx, atr);
			return (val == null) ? null : val.toString();
		}).collect(Collectors.toList());
		return String.join(sep, parts);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "StringJoin";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
