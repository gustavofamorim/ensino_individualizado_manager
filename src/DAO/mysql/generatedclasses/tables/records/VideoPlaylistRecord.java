/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables.records;


import DAO.mysql.generatedclasses.tables.VideoPlaylist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class VideoPlaylistRecord extends UpdatableRecordImpl<VideoPlaylistRecord> implements Record3<Integer, Integer, Integer> {

	private static final long serialVersionUID = -1444007830;

	/**
	 * Setter for <code>ensinoindividualizado.video_playlist.idvideo</code>.
	 */
	public void setIdvideo(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video_playlist.idvideo</code>.
	 */
	public Integer getIdvideo() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ensinoindividualizado.video_playlist.idplaylist</code>.
	 */
	public void setIdplaylist(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video_playlist.idplaylist</code>.
	 */
	public Integer getIdplaylist() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ensinoindividualizado.video_playlist.numero</code>.
	 */
	public void setNumero(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.video_playlist.numero</code>.
	 */
	public Integer getNumero() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return VideoPlaylist.VIDEO_PLAYLIST.IDVIDEO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return VideoPlaylist.VIDEO_PLAYLIST.IDPLAYLIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return VideoPlaylist.VIDEO_PLAYLIST.NUMERO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdvideo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getIdplaylist();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getNumero();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoPlaylistRecord value1(Integer value) {
		setIdvideo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoPlaylistRecord value2(Integer value) {
		setIdplaylist(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoPlaylistRecord value3(Integer value) {
		setNumero(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VideoPlaylistRecord values(Integer value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VideoPlaylistRecord
	 */
	public VideoPlaylistRecord() {
		super(VideoPlaylist.VIDEO_PLAYLIST);
	}

	/**
	 * Create a detached, initialised VideoPlaylistRecord
	 */
	public VideoPlaylistRecord(Integer idvideo, Integer idplaylist, Integer numero) {
		super(VideoPlaylist.VIDEO_PLAYLIST);

		setValue(0, idvideo);
		setValue(1, idplaylist);
		setValue(2, numero);
	}
}
