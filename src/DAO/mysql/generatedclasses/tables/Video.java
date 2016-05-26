/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables;


import DAO.mysql.generatedclasses.Ensinoindividualizado;
import DAO.mysql.generatedclasses.Keys;
import DAO.mysql.generatedclasses.tables.records.VideoRecord;

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
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Video extends TableImpl<VideoRecord> {

	private static final long serialVersionUID = -1616130668;

	/**
	 * The reference instance of <code>ensinoindividualizado.video</code>
	 */
	public static final Video VIDEO = new Video();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VideoRecord> getRecordType() {
		return VideoRecord.class;
	}

	/**
	 * The column <code>ensinoindividualizado.video.idvideo</code>.
	 */
	public final TableField<VideoRecord, Integer> IDVIDEO = createField("idvideo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.video.descricao</code>.
	 */
	public final TableField<VideoRecord, String> DESCRICAO = createField("descricao", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.video.video</code>.
	 */
	public final TableField<VideoRecord, byte[]> VIDEO_ = createField("video", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.video.nome_original</code>.
	 */
	public final TableField<VideoRecord, String> NOME_ORIGINAL = createField("nome_original", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

	/**
	 * Create a <code>ensinoindividualizado.video</code> table reference
	 */
	public Video() {
		this("video", null);
	}

	/**
	 * Create an aliased <code>ensinoindividualizado.video</code> table reference
	 */
	public Video(String alias) {
		this(alias, VIDEO);
	}

	private Video(String alias, Table<VideoRecord> aliased) {
		this(alias, aliased, null);
	}

	private Video(String alias, Table<VideoRecord> aliased, Field<?>[] parameters) {
		super(alias, Ensinoindividualizado.ENSINOINDIVIDUALIZADO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<VideoRecord, Integer> getIdentity() {
		return Keys.IDENTITY_VIDEO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<VideoRecord> getPrimaryKey() {
		return Keys.KEY_VIDEO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<VideoRecord>> getKeys() {
		return Arrays.<UniqueKey<VideoRecord>>asList(Keys.KEY_VIDEO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Video as(String alias) {
		return new Video(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Video rename(String name) {
		return new Video(name, null);
	}
}
