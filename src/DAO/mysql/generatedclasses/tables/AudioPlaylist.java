/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables;


import DAO.mysql.generatedclasses.Ensinoindividualizado;
import DAO.mysql.generatedclasses.Keys;
import DAO.mysql.generatedclasses.tables.records.AudioPlaylistRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class AudioPlaylist extends TableImpl<AudioPlaylistRecord> {

	private static final long serialVersionUID = -1032244378;

	/**
	 * The reference instance of <code>ensinoindividualizado.audio_playlist</code>
	 */
	public static final AudioPlaylist AUDIO_PLAYLIST = new AudioPlaylist();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AudioPlaylistRecord> getRecordType() {
		return AudioPlaylistRecord.class;
	}

	/**
	 * The column <code>ensinoindividualizado.audio_playlist.idplaylist</code>.
	 */
	public final TableField<AudioPlaylistRecord, Integer> IDPLAYLIST = createField("idplaylist", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.audio_playlist.idaudio</code>.
	 */
	public final TableField<AudioPlaylistRecord, Integer> IDAUDIO = createField("idaudio", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.audio_playlist.numero</code>.
	 */
	public final TableField<AudioPlaylistRecord, Integer> NUMERO = createField("numero", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>ensinoindividualizado.audio_playlist</code> table reference
	 */
	public AudioPlaylist() {
		this("audio_playlist", null);
	}

	/**
	 * Create an aliased <code>ensinoindividualizado.audio_playlist</code> table reference
	 */
	public AudioPlaylist(String alias) {
		this(alias, AUDIO_PLAYLIST);
	}

	private AudioPlaylist(String alias, Table<AudioPlaylistRecord> aliased) {
		this(alias, aliased, null);
	}

	private AudioPlaylist(String alias, Table<AudioPlaylistRecord> aliased, Field<?>[] parameters) {
		super(alias, Ensinoindividualizado.ENSINOINDIVIDUALIZADO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AudioPlaylistRecord> getPrimaryKey() {
		return Keys.KEY_AUDIO_PLAYLIST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AudioPlaylistRecord>> getKeys() {
		return Arrays.<UniqueKey<AudioPlaylistRecord>>asList(Keys.KEY_AUDIO_PLAYLIST_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AudioPlaylistRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AudioPlaylistRecord, ?>>asList(Keys.FK_AUDIO_PLAYLIST_PLAYLIST1, Keys.FK_AUDIO_PLAYLIST_AUDIO1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AudioPlaylist as(String alias) {
		return new AudioPlaylist(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AudioPlaylist rename(String name) {
		return new AudioPlaylist(name, null);
	}
}
