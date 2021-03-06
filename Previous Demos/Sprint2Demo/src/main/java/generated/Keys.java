/**
 * This class is generated by jOOQ
 */
package generated;


import generated.tables.Datainfo;
import generated.tables.Receipts;
import generated.tables.Tags;
import generated.tables.records.DatainfoRecord;
import generated.tables.records.ReceiptsRecord;
import generated.tables.records.TagsRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<ReceiptsRecord, Integer> IDENTITY_RECEIPTS = Identities0.IDENTITY_RECEIPTS;
	public static final Identity<DatainfoRecord, Integer> IDENTITY_DATAINFO = Identities0.IDENTITY_DATAINFO;
	public static final Identity<TagsRecord, Integer> IDENTITY_TAGS = Identities0.IDENTITY_TAGS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ReceiptsRecord> CONSTRAINT_F = UniqueKeys0.CONSTRAINT_F;
	public static final UniqueKey<DatainfoRecord> CONSTRAINT_9 = UniqueKeys0.CONSTRAINT_9;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<ReceiptsRecord, Integer> IDENTITY_RECEIPTS = createIdentity(Receipts.RECEIPTS, Receipts.RECEIPTS.ID);
		public static Identity<DatainfoRecord, Integer> IDENTITY_DATAINFO = createIdentity(Datainfo.DATAINFO, Datainfo.DATAINFO.ID);
		public static Identity<TagsRecord, Integer> IDENTITY_TAGS = createIdentity(Tags.TAGS, Tags.TAGS.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ReceiptsRecord> CONSTRAINT_F = createUniqueKey(Receipts.RECEIPTS, Receipts.RECEIPTS.ID);
		public static final UniqueKey<DatainfoRecord> CONSTRAINT_9 = createUniqueKey(Datainfo.DATAINFO, Datainfo.DATAINFO.ID);
	}
}
