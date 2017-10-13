/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Tags;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagsRecord extends TableRecordImpl<TagsRecord> implements Record3<Integer, Integer, String> {

	private static final long serialVersionUID = 1685142641;

	/**
	 * Setter for <code>public.tags.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.tags.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.tags.receipt_id</code>.
	 */
	public void setReceiptId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.tags.receipt_id</code>.
	 */
	public Integer getReceiptId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.tags.tag</code>.
	 */
	public void setTag(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.tags.tag</code>.
	 */
	public String getTag() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Tags.TAGS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Tags.TAGS.RECEIPT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Tags.TAGS.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getReceiptId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value2(Integer value) {
		setReceiptId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord value3(String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagsRecord values(Integer value1, Integer value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TagsRecord
	 */
	public TagsRecord() {
		super(Tags.TAGS);
	}

	/**
	 * Create a detached, initialised TagsRecord
	 */
	public TagsRecord(Integer id, Integer receiptId, String tag) {
		super(Tags.TAGS);

		setValue(0, id);
		setValue(1, receiptId);
		setValue(2, tag);
	}
}
