// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package objectivitycommonstest.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the ObjectivityCommonsTest module
	public static void aCT_CreateData(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_CreateData").withParams(params).execute(context);
	}
	public static void aCT_Test_GetTypeAsString(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_GetTypeAsString").withParams(params).execute(context);
	}
	public static void aCT_Test_ListCreate(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_ListCreate").withParams(params).execute(context);
	}
	public static void aCT_Test_ListCreate_WithContext(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_ListCreate_WithContext").withParams(params).execute(context);
	}
	public static void aCT_Test_ListCreateSimple(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_ListCreateSimple").withParams(params).execute(context);
	}
	public static void aCT_Test_ListGetByIndex(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_ListGetByIndex").withParams(params).execute(context);
	}
	public static void aCT_Test_RandomNumber(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_RandomNumber").withParams(params).execute(context);
	}
	public static void aCT_Test_RetrieveFromList_FromChildren_NonXPath(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_RetrieveFromList_FromChildren_NonXPath").withParams(params).execute(context);
	}
	public static void aCT_Test_RetrieveFromList_FromChildren_XPath(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_RetrieveFromList_FromChildren_XPath").withParams(params).execute(context);
	}
	public static void aCT_Test_RetrieveFromList_FromParents_XPath(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_RetrieveFromList_FromParents_XPath").withParams(params).execute(context);
	}
	public static void aCT_Test_StringReplaceRegex(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_StringReplaceRegex").withParams(params).execute(context);
	}
	public static void aCT_Test_StringSplitAndJoin(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_StringSplitAndJoin").withParams(params).execute(context);
	}
	public static void aCT_Test_StringSplitAndJoinByMF(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_StringSplitAndJoinByMF").withParams(params).execute(context);
	}
	public static void aCT_Test_StringSplitAndJoinWithDoubleSepar(IContext context, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_Test_StringSplitAndJoinWithDoubleSepar").withParams(params).execute(context);
	}
	public static void aCT_TestRetrieve_Page_Next(IContext context, objectivitycommonstest.proxies.RetrieveContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_TestRetrieve_Page_Next").withParams(params).execute(context);
	}
	public static void aCT_TestRetrieve_Page_Prev(IContext context, objectivitycommonstest.proxies.RetrieveContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_TestRetrieve_Page_Prev").withParams(params).execute(context);
	}
	public static void aCT_TestRetrieve_Refresh(IContext context, objectivitycommonstest.proxies.RetrieveContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.ACT_TestRetrieve_Refresh").withParams(params).execute(context);
	}
	public static objectivitycommonstest.proxies.RetrieveContextVM dS_RetrieveContextVM(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("ObjectivityCommonsTest.DS_RetrieveContextVM").withParams(params).execute(context);
		return result == null ? null : objectivitycommonstest.proxies.RetrieveContextVM.initialize(context, result);
	}
	public static objectivitycommonstest.proxies.TestContextVM dS_TestContextVM(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("ObjectivityCommonsTest.DS_TestContextVM").withParams(params).execute(context);
		return result == null ? null : objectivitycommonstest.proxies.TestContextVM.initialize(context, result);
	}
	public static java.util.List<objectivitycommonstest.proxies.Base> dS_TestRetrieve_Enhanced(IContext context, objectivitycommonstest.proxies.RetrieveContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("ObjectivityCommonsTest.DS_TestRetrieve_Enhanced").withParams(params).execute(context);
		java.util.List<objectivitycommonstest.proxies.Base> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(objectivitycommonstest.proxies.Base.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<objectivitycommonstest.proxies.Base> dS_TestRetrieve_Standard(IContext context, objectivitycommonstest.proxies.RetrieveContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("ObjectivityCommonsTest.DS_TestRetrieve_Standard").withParams(params).execute(context);
		java.util.List<objectivitycommonstest.proxies.Base> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(objectivitycommonstest.proxies.Base.initialize(context, obj));
		}
		return result;
	}
	public static void sUB_CreateData_Base(IContext context, objectivitycommonstest.proxies.Base _base)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Base", _base == null ? null : _base.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.SUB_CreateData_Base").withParams(params).execute(context);
	}
	public static void sUB_CreateData_Child(IContext context, objectivitycommonstest.proxies.Child _child, objectivitycommonstest.proxies.Parent _parent)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Child", _child == null ? null : _child.getMendixObject());
		params.put("Parent", _parent == null ? null : _parent.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.SUB_CreateData_Child").withParams(params).execute(context);
	}
	public static void sUB_CreateData_Parent(IContext context, objectivitycommonstest.proxies.Parent _parent, objectivitycommonstest.proxies.TestContextVM _contextVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Parent", _parent == null ? null : _parent.getMendixObject());
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.SUB_CreateData_Parent").withParams(params).execute(context);
	}
	public static void sUB_Test_ListCreate(IContext context, objectivitycommonstest.proxies.Test _test, objectivitycommons.proxies.ValueVM _index)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		params.put("Index", _index == null ? null : _index.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.SUB_Test_ListCreate").withParams(params).execute(context);
	}
	public static void sUB_Test_ListCreate_WithContext(IContext context, objectivitycommonstest.proxies.Test _test, objectivitycommonstest.proxies.TestContextVM _contextVM, objectivitycommons.proxies.ValueVM _index)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Test", _test == null ? null : _test.getMendixObject());
		params.put("ContextVM", _contextVM == null ? null : _contextVM.getMendixObject());
		params.put("Index", _index == null ? null : _index.getMendixObject());
		Core.microflowCall("ObjectivityCommonsTest.SUB_Test_ListCreate_WithContext").withParams(params).execute(context);
	}
	public static void sUB_Test_RetrieveFromList_ShowInfo(IContext context, java.util.List<objectivitycommonstest.proxies.Parent> _parentList, java.util.List<objectivitycommonstest.proxies.Child> _childrenList, java.lang.String _header, boolean _parentsFirst)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_parentList = null;
		if (_parentList != null)
		{
			listparam_parentList = new java.util.ArrayList<>();
			for (objectivitycommonstest.proxies.Parent obj : _parentList)
				listparam_parentList.add(obj.getMendixObject());
		}
		params.put("ParentList", listparam_parentList);

		java.util.ArrayList<IMendixObject> listparam_childrenList = null;
		if (_childrenList != null)
		{
			listparam_childrenList = new java.util.ArrayList<>();
			for (objectivitycommonstest.proxies.Child obj : _childrenList)
				listparam_childrenList.add(obj.getMendixObject());
		}
		params.put("ChildrenList", listparam_childrenList);

		params.put("Header", _header);
		params.put("ParentsFirst", _parentsFirst);
		Core.microflowCall("ObjectivityCommonsTest.SUB_Test_RetrieveFromList_ShowInfo").withParams(params).execute(context);
	}
	public static java.lang.String sUB_Test_StringSplitAndJoinByMF(IContext context, objectivitycommons.proxies.ValueVM _valueVM)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ValueVM", _valueVM == null ? null : _valueVM.getMendixObject());
		return (java.lang.String) Core.microflowCall("ObjectivityCommonsTest.SUB_Test_StringSplitAndJoinByMF").withParams(params).execute(context);
	}
}