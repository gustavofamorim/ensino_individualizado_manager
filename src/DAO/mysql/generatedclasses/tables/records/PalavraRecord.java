/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables.records;


import DAO.mysql.generatedclasses.tables.Palavra;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PalavraRecord extends UpdatableRecordImpl<PalavraRecord> implements Record6<Integer, Integer, Integer, Integer, Integer, String> {

	private static final long serialVersionUID = 1890661359;

	/**
	 * Setter for <code>ensinoindividualizado.palavra.idpalavra</code>.
	 */
	public void setIdpalavra(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.palavra.idpalavra</code>.
	 */
	public Integer getIdpalavra() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>ensinoindividualizado.palavra.idcategoria</code>.
	 */
	public void setIdcategoria(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.palavra.idcategoria</code>.
	 */
	public Integer getIdcategoria() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>ensinoindividualizado.palavra.idaudio</code>.
	 */
	public void setIdaudio(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.palavra.idaudio</code>.
	 */
	public Integer getIdaudio() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>ensinoindividualizado.palavra.idimagem</code>.
	 */
	public void setIdimagem(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.palavra.idimagem</code>.
	 */
	public Integer getIdimagem() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>ensinoindividualizado.palavra.idvideo</code>.
	 */
	public void setIdvideo(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.palavra.idvideo</code>.
	 */
	public Integer getIdvideo() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>ensinoindividualizado.palavra.palavra</code>.
	 */
	public void setPalavra(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>ensinoindividualizado.palavra.palavra</code>.
	 */
	public String getPalavra() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record4<Integer, Integer, Integer, Integer> key() {
		return (Record4) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, Integer, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, Integer, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Palavra.PALAVRA.IDPALAVRA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Palavra.PALAVRA.IDCATEGORIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Palavra.PALAVRA.IDAUDIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Palavra.PALAVRA.IDIMAGEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Palavra.PALAVRA.IDVIDEO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Palavra.PALAVRA.PALAVRA_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdpalavra();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getIdcategoria();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getIdaudio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getIdimagem();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getIdvideo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getPalavra();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord value1(Integer value) {
		setIdpalavra(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord value2(Integer value) {
		setIdcategoria(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord value3(Integer value) {
		setIdaudio(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord value4(Integer value) {
		setIdimagem(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord value5(Integer value) {
		setIdvideo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord value6(String value) {
		setPalavra(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PalavraRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PalavraRecord
	 */
	public PalavraRecord() {
		super(Palavra.PALAVRA);
	}

	/**
	 * Create a detached, initialised PalavraRecord
	 */
	public PalavraRecord(Integer idpalavra, Integer idcategoria, Integer idaudio, Integer idimagem, Integer idvideo, String palavra) {
		super(Palavra.PALAVRA);

		setValue(0, idpalavra);
		setValue(1, idcategoria);
		setValue(2, idaudio);
		setValue(3, idimagem);
		setValue(4, idvideo);
		setValue(5, palavra);
	}
}
