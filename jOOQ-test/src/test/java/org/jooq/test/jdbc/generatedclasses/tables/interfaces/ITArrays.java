/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITArrays extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>.
	 */
	public void setStringArray(java.lang.Object value);

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>.
	 */
	public java.lang.Object getStringArray();

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	public void setNumberArray(java.lang.Object value);

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	public java.lang.Object getNumberArray();

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>.
	 */
	public void setDateArray(java.lang.Object value);

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>.
	 */
	public java.lang.Object getDateArray();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITArrays
	 */
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITArrays from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITArrays
	 */
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITArrays> E into(E into);
}
