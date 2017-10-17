/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Datainfo;

import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DatainfoRecord extends UpdatableRecordImpl<DatainfoRecord> implements Record12<String, Integer, Time, String, String, Boolean, String, String, String, String, String, String> {

	private static final long serialVersionUID = 5363848;

	/**
	 * Setter for <code>public.datainfo.companyname</code>.
	 */
	public void setCompanyname(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.datainfo.companyname</code>.
	 */
	public String getCompanyname() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.datainfo.id</code>.
	 */
	public void setId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.datainfo.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.datainfo.uploaded</code>.
	 */
	public void setUploaded(Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.datainfo.uploaded</code>.
	 */
	public Time getUploaded() {
		return (Time) getValue(2);
	}

	/**
	 * Setter for <code>public.datainfo.datatype</code>.
	 */
	public void setDatatype(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.datainfo.datatype</code>.
	 */
	public String getDatatype() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.datainfo.reason</code>.
	 */
	public void setReason(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.datainfo.reason</code>.
	 */
	public String getReason() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.datainfo.shared</code>.
	 */
	public void setShared(Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.datainfo.shared</code>.
	 */
	public Boolean getShared() {
		return (Boolean) getValue(5);
	}

	/**
	 * Setter for <code>public.datainfo.address</code>.
	 */
	public void setAddress(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.datainfo.address</code>.
	 */
	public String getAddress() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>public.datainfo.contact</code>.
	 */
	public void setContact(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.datainfo.contact</code>.
	 */
	public String getContact() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>public.datainfo.website</code>.
	 */
	public void setWebsite(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.datainfo.website</code>.
	 */
	public String getWebsite() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>public.datainfo.dopname</code>.
	 */
	public void setDopname(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.datainfo.dopname</code>.
	 */
	public String getDopname() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>public.datainfo.dopcontact</code>.
	 */
	public void setDopcontact(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.datainfo.dopcontact</code>.
	 */
	public String getDopcontact() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>public.datainfo.companytype</code>.
	 */
	public void setCompanytype(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>public.datainfo.companytype</code>.
	 */
	public String getCompanytype() {
		return (String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, Integer, Time, String, String, Boolean, String, String, String, String, String, String> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<String, Integer, Time, String, String, Boolean, String, String, String, String, String, String> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Datainfo.DATAINFO.COMPANYNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Datainfo.DATAINFO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Time> field3() {
		return Datainfo.DATAINFO.UPLOADED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Datainfo.DATAINFO.DATATYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Datainfo.DATAINFO.REASON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
		return Datainfo.DATAINFO.SHARED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Datainfo.DATAINFO.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Datainfo.DATAINFO.CONTACT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Datainfo.DATAINFO.WEBSITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return Datainfo.DATAINFO.DOPNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return Datainfo.DATAINFO.DOPCONTACT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return Datainfo.DATAINFO.COMPANYTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getCompanyname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Time value3() {
		return getUploaded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDatatype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getReason();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
		return getShared();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getContact();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getWebsite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getDopname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getDopcontact();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getCompanytype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value1(String value) {
		setCompanyname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value2(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value3(Time value) {
		setUploaded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value4(String value) {
		setDatatype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value5(String value) {
		setReason(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value6(Boolean value) {
		setShared(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value7(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value8(String value) {
		setContact(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value9(String value) {
		setWebsite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value10(String value) {
		setDopname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value11(String value) {
		setDopcontact(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord value12(String value) {
		setCompanytype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatainfoRecord values(String value1, Integer value2, Time value3, String value4, String value5, Boolean value6, String value7, String value8, String value9, String value10, String value11, String value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DatainfoRecord
	 */
	public DatainfoRecord() {
		super(Datainfo.DATAINFO);
	}

	/**
	 * Create a detached, initialised DatainfoRecord
	 */
	public DatainfoRecord(String companyname, Integer id, Time uploaded, String datatype, String reason, Boolean shared, String address, String contact, String website, String dopname, String dopcontact, String companytype) {
		super(Datainfo.DATAINFO);

		setValue(0, companyname);
		setValue(1, id);
		setValue(2, uploaded);
		setValue(3, datatype);
		setValue(4, reason);
		setValue(5, shared);
		setValue(6, address);
		setValue(7, contact);
		setValue(8, website);
		setValue(9, dopname);
		setValue(10, dopcontact);
		setValue(11, companytype);
	}
}