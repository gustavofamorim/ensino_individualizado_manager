/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables;


import DAO.mysql.generatedclasses.Ensinoindividualizado;
import DAO.mysql.generatedclasses.Keys;
import DAO.mysql.generatedclasses.tables.records.PlaylistRecord;

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
public class Playlist extends TableImpl<PlaylistRecord> {

	private static final long serialVersionUID = -563044871;

	/**
	 * The reference instance of <code>ensinoindividualizado.playlist</code>
	 */
	public static final Playlist PLAYLIST = new Playlist();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PlaylistRecord> getRecordType() {
		return PlaylistRecord.class;
	}

	/**
	 * The column <code>ensinoindividualizado.playlist.idplaylist</code>.
	 */
	public final TableField<PlaylistRecord, Integer> IDPLAYLIST = createField("idplaylist", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.playlist.tipo</code>.
	 */
	public final TableField<PlaylistRecord, Integer> TIPO = createField("tipo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>ensinoindividualizado.playlist</code> table reference
	 */
	public Playlist() {
		this("playlist", null);
	}

	/**
	 * Create an aliased <code>ensinoindividualizado.playlist</code> table reference
	 */
	public Playlist(String alias) {
		this(alias, PLAYLIST);
	}

	private Playlist(String alias, Table<PlaylistRecord> aliased) {
		this(alias, aliased, null);
	}

	private Playlist(String alias, Table<PlaylistRecord> aliased, Field<?>[] parameters) {
		super(alias, Ensinoindividualizado.ENSINOINDIVIDUALIZADO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<PlaylistRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PLAYLIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PlaylistRecord> getPrimaryKey() {
		return Keys.KEY_PLAYLIST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PlaylistRecord>> getKeys() {
		return Arrays.<UniqueKey<PlaylistRecord>>asList(Keys.KEY_PLAYLIST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Playlist as(String alias) {
		return new Playlist(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Playlist rename(String name) {
		return new Playlist(name, null);
	}
}
