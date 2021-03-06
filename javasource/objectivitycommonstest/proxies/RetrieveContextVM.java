// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package objectivitycommonstest.proxies;

public class RetrieveContextVM
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject retrieveContextVMMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ObjectivityCommonsTest.RetrieveContextVM";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PageNumber("PageNumber"),
		PageSize("PageSize"),
		Sorting("Sorting"),
		SortingDirection("SortingDirection"),
		SearchName("SearchName"),
		SearchNumber("SearchNumber"),
		SearchCategory("SearchCategory"),
		SearchChangedDate("SearchChangedDate"),
		SearchChangedByAdmin("SearchChangedByAdmin"),
		SearchChangedByCurrentUser("SearchChangedByCurrentUser"),
		RetrieveContextVM_User("ObjectivityCommonsTest.RetrieveContextVM_User");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public RetrieveContextVM(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ObjectivityCommonsTest.RetrieveContextVM"));
	}

	protected RetrieveContextVM(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject retrieveContextVMMendixObject)
	{
		if (retrieveContextVMMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ObjectivityCommonsTest.RetrieveContextVM", retrieveContextVMMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ObjectivityCommonsTest.RetrieveContextVM");

		this.retrieveContextVMMendixObject = retrieveContextVMMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RetrieveContextVM.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static objectivitycommonstest.proxies.RetrieveContextVM initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return objectivitycommonstest.proxies.RetrieveContextVM.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static objectivitycommonstest.proxies.RetrieveContextVM initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new objectivitycommonstest.proxies.RetrieveContextVM(context, mendixObject);
	}

	public static objectivitycommonstest.proxies.RetrieveContextVM load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return objectivitycommonstest.proxies.RetrieveContextVM.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of PageNumber
	 */
	public final java.lang.Integer getPageNumber()
	{
		return getPageNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PageNumber
	 */
	public final java.lang.Integer getPageNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PageNumber.toString());
	}

	/**
	 * Set value of PageNumber
	 * @param pagenumber
	 */
	public final void setPageNumber(java.lang.Integer pagenumber)
	{
		setPageNumber(getContext(), pagenumber);
	}

	/**
	 * Set value of PageNumber
	 * @param context
	 * @param pagenumber
	 */
	public final void setPageNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pagenumber)
	{
		getMendixObject().setValue(context, MemberNames.PageNumber.toString(), pagenumber);
	}

	/**
	 * @return value of PageSize
	 */
	public final java.lang.Integer getPageSize()
	{
		return getPageSize(getContext());
	}

	/**
	 * @param context
	 * @return value of PageSize
	 */
	public final java.lang.Integer getPageSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PageSize.toString());
	}

	/**
	 * Set value of PageSize
	 * @param pagesize
	 */
	public final void setPageSize(java.lang.Integer pagesize)
	{
		setPageSize(getContext(), pagesize);
	}

	/**
	 * Set value of PageSize
	 * @param context
	 * @param pagesize
	 */
	public final void setPageSize(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pagesize)
	{
		getMendixObject().setValue(context, MemberNames.PageSize.toString(), pagesize);
	}

	/**
	 * Set value of Sorting
	 * @param sorting
	 */
	public final objectivitycommonstest.proxies.Sorting getSorting()
	{
		return getSorting(getContext());
	}

	/**
	 * @param context
	 * @return value of Sorting
	 */
	public final objectivitycommonstest.proxies.Sorting getSorting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Sorting.toString());
		if (obj == null)
			return null;

		return objectivitycommonstest.proxies.Sorting.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Sorting
	 * @param sorting
	 */
	public final void setSorting(objectivitycommonstest.proxies.Sorting sorting)
	{
		setSorting(getContext(), sorting);
	}

	/**
	 * Set value of Sorting
	 * @param context
	 * @param sorting
	 */
	public final void setSorting(com.mendix.systemwideinterfaces.core.IContext context, objectivitycommonstest.proxies.Sorting sorting)
	{
		if (sorting != null)
			getMendixObject().setValue(context, MemberNames.Sorting.toString(), sorting.toString());
		else
			getMendixObject().setValue(context, MemberNames.Sorting.toString(), null);
	}

	/**
	 * Set value of SortingDirection
	 * @param sortingdirection
	 */
	public final objectivitycommons.proxies.SortingDirection getSortingDirection()
	{
		return getSortingDirection(getContext());
	}

	/**
	 * @param context
	 * @return value of SortingDirection
	 */
	public final objectivitycommons.proxies.SortingDirection getSortingDirection(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SortingDirection.toString());
		if (obj == null)
			return null;

		return objectivitycommons.proxies.SortingDirection.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SortingDirection
	 * @param sortingdirection
	 */
	public final void setSortingDirection(objectivitycommons.proxies.SortingDirection sortingdirection)
	{
		setSortingDirection(getContext(), sortingdirection);
	}

	/**
	 * Set value of SortingDirection
	 * @param context
	 * @param sortingdirection
	 */
	public final void setSortingDirection(com.mendix.systemwideinterfaces.core.IContext context, objectivitycommons.proxies.SortingDirection sortingdirection)
	{
		if (sortingdirection != null)
			getMendixObject().setValue(context, MemberNames.SortingDirection.toString(), sortingdirection.toString());
		else
			getMendixObject().setValue(context, MemberNames.SortingDirection.toString(), null);
	}

	/**
	 * @return value of SearchName
	 */
	public final java.lang.String getSearchName()
	{
		return getSearchName(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchName
	 */
	public final java.lang.String getSearchName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SearchName.toString());
	}

	/**
	 * Set value of SearchName
	 * @param searchname
	 */
	public final void setSearchName(java.lang.String searchname)
	{
		setSearchName(getContext(), searchname);
	}

	/**
	 * Set value of SearchName
	 * @param context
	 * @param searchname
	 */
	public final void setSearchName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String searchname)
	{
		getMendixObject().setValue(context, MemberNames.SearchName.toString(), searchname);
	}

	/**
	 * @return value of SearchNumber
	 */
	public final java.lang.Integer getSearchNumber()
	{
		return getSearchNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchNumber
	 */
	public final java.lang.Integer getSearchNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SearchNumber.toString());
	}

	/**
	 * Set value of SearchNumber
	 * @param searchnumber
	 */
	public final void setSearchNumber(java.lang.Integer searchnumber)
	{
		setSearchNumber(getContext(), searchnumber);
	}

	/**
	 * Set value of SearchNumber
	 * @param context
	 * @param searchnumber
	 */
	public final void setSearchNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer searchnumber)
	{
		getMendixObject().setValue(context, MemberNames.SearchNumber.toString(), searchnumber);
	}

	/**
	 * Set value of SearchCategory
	 * @param searchcategory
	 */
	public final objectivitycommonstest.proxies.Category getSearchCategory()
	{
		return getSearchCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchCategory
	 */
	public final objectivitycommonstest.proxies.Category getSearchCategory(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.SearchCategory.toString());
		if (obj == null)
			return null;

		return objectivitycommonstest.proxies.Category.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of SearchCategory
	 * @param searchcategory
	 */
	public final void setSearchCategory(objectivitycommonstest.proxies.Category searchcategory)
	{
		setSearchCategory(getContext(), searchcategory);
	}

	/**
	 * Set value of SearchCategory
	 * @param context
	 * @param searchcategory
	 */
	public final void setSearchCategory(com.mendix.systemwideinterfaces.core.IContext context, objectivitycommonstest.proxies.Category searchcategory)
	{
		if (searchcategory != null)
			getMendixObject().setValue(context, MemberNames.SearchCategory.toString(), searchcategory.toString());
		else
			getMendixObject().setValue(context, MemberNames.SearchCategory.toString(), null);
	}

	/**
	 * @return value of SearchChangedDate
	 */
	public final java.util.Date getSearchChangedDate()
	{
		return getSearchChangedDate(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchChangedDate
	 */
	public final java.util.Date getSearchChangedDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.SearchChangedDate.toString());
	}

	/**
	 * Set value of SearchChangedDate
	 * @param searchchangeddate
	 */
	public final void setSearchChangedDate(java.util.Date searchchangeddate)
	{
		setSearchChangedDate(getContext(), searchchangeddate);
	}

	/**
	 * Set value of SearchChangedDate
	 * @param context
	 * @param searchchangeddate
	 */
	public final void setSearchChangedDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date searchchangeddate)
	{
		getMendixObject().setValue(context, MemberNames.SearchChangedDate.toString(), searchchangeddate);
	}

	/**
	 * @return value of SearchChangedByAdmin
	 */
	public final java.lang.Boolean getSearchChangedByAdmin()
	{
		return getSearchChangedByAdmin(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchChangedByAdmin
	 */
	public final java.lang.Boolean getSearchChangedByAdmin(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SearchChangedByAdmin.toString());
	}

	/**
	 * Set value of SearchChangedByAdmin
	 * @param searchchangedbyadmin
	 */
	public final void setSearchChangedByAdmin(java.lang.Boolean searchchangedbyadmin)
	{
		setSearchChangedByAdmin(getContext(), searchchangedbyadmin);
	}

	/**
	 * Set value of SearchChangedByAdmin
	 * @param context
	 * @param searchchangedbyadmin
	 */
	public final void setSearchChangedByAdmin(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean searchchangedbyadmin)
	{
		getMendixObject().setValue(context, MemberNames.SearchChangedByAdmin.toString(), searchchangedbyadmin);
	}

	/**
	 * @return value of SearchChangedByCurrentUser
	 */
	public final java.lang.Boolean getSearchChangedByCurrentUser()
	{
		return getSearchChangedByCurrentUser(getContext());
	}

	/**
	 * @param context
	 * @return value of SearchChangedByCurrentUser
	 */
	public final java.lang.Boolean getSearchChangedByCurrentUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SearchChangedByCurrentUser.toString());
	}

	/**
	 * Set value of SearchChangedByCurrentUser
	 * @param searchchangedbycurrentuser
	 */
	public final void setSearchChangedByCurrentUser(java.lang.Boolean searchchangedbycurrentuser)
	{
		setSearchChangedByCurrentUser(getContext(), searchchangedbycurrentuser);
	}

	/**
	 * Set value of SearchChangedByCurrentUser
	 * @param context
	 * @param searchchangedbycurrentuser
	 */
	public final void setSearchChangedByCurrentUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean searchchangedbycurrentuser)
	{
		getMendixObject().setValue(context, MemberNames.SearchChangedByCurrentUser.toString(), searchchangedbycurrentuser);
	}

	/**
	 * @return value of RetrieveContextVM_User
	 */
	public final system.proxies.User getRetrieveContextVM_User() throws com.mendix.core.CoreException
	{
		return getRetrieveContextVM_User(getContext());
	}

	/**
	 * @param context
	 * @return value of RetrieveContextVM_User
	 */
	public final system.proxies.User getRetrieveContextVM_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.RetrieveContextVM_User.toString());
		if (identifier != null)
			result = system.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of RetrieveContextVM_User
	 * @param retrievecontextvm_user
	 */
	public final void setRetrieveContextVM_User(system.proxies.User retrievecontextvm_user)
	{
		setRetrieveContextVM_User(getContext(), retrievecontextvm_user);
	}

	/**
	 * Set value of RetrieveContextVM_User
	 * @param context
	 * @param retrievecontextvm_user
	 */
	public final void setRetrieveContextVM_User(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User retrievecontextvm_user)
	{
		if (retrievecontextvm_user == null)
			getMendixObject().setValue(context, MemberNames.RetrieveContextVM_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.RetrieveContextVM_User.toString(), retrievecontextvm_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return retrieveContextVMMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final objectivitycommonstest.proxies.RetrieveContextVM that = (objectivitycommonstest.proxies.RetrieveContextVM) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ObjectivityCommonsTest.RetrieveContextVM";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
