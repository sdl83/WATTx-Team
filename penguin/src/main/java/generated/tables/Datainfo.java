/**
 * This class is generated by jOOQ
 */
package generated.tables;


import generated.Keys;
import generated.Public;
import generated.tables.records.DatainfoRecord;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Datainfo extends TableImpl<DatainfoRecord> {

	private static final long serialVersionUID = 285362537;

	/**
	 * The reference instance of <code>public.datainfo</code>
	 */
	public static final Datainfo DATAINFO = new Datainfo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DatainfoRecord> getRecordType() {
		return DatainfoRecord.class;
	}

	/**
	 * The column <code>public.datainfo.companyname</code>.
	 */
	public final TableField<DatainfoRecord, String> COMPANYNAME = createField("companyname", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>public.datainfo.id</code>.
	 */
	public final TableField<DatainfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.datainfo.uploaded</code>.
	 */
	public final TableField<DatainfoRecord, Time> UPLOADED = createField("uploaded", org.jooq.impl.SQLDataType.TIME.defaulted(true), this, "");

	/**
	 * The column <code>public.datainfo.datatype</code>.
	 */
	public final TableField<DatainfoRecord, String> DATATYPE = createField("datatype", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>public.datainfo.reason</code>.
	 */
	public final TableField<DatainfoRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>public.datainfo.shared</code>.
	 */
	public final TableField<DatainfoRecord, Boolean> SHARED = createField("shared", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * Create a <code>public.datainfo</code> table reference
	 */
	public Datainfo() {
		this("datainfo", null);
	}

	/**
	 * Create an aliased <code>public.datainfo</code> table reference
	 */
	public Datainfo(String alias) {
		this(alias, DATAINFO);
	}

	private Datainfo(String alias, Table<DatainfoRecord> aliased) {
		this(alias, aliased, null);
	}

	private Datainfo(String alias, Table<DatainfoRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<DatainfoRecord, Integer> getIdentity() {
		return Keys.IDENTITY_DATAINFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DatainfoRecord> getPrimaryKey() {
		return Keys.CONSTRAINT_9;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DatainfoRecord>> getKeys() {
		return Arrays.<UniqueKey<DatainfoRecord>>asList(Keys.CONSTRAINT_9);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Datainfo as(String alias) {
		return new Datainfo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Datainfo rename(String name) {
		return new Datainfo(name, null);
	}
}
