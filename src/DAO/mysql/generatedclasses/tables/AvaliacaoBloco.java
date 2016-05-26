/**
 * This class is generated by jOOQ
 */
package DAO.mysql.generatedclasses.tables;


import DAO.mysql.generatedclasses.Ensinoindividualizado;
import DAO.mysql.generatedclasses.Keys;
import DAO.mysql.generatedclasses.tables.records.AvaliacaoBlocoRecord;

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
public class AvaliacaoBloco extends TableImpl<AvaliacaoBlocoRecord> {

	private static final long serialVersionUID = 961655278;

	/**
	 * The reference instance of <code>ensinoindividualizado.avaliacao_bloco</code>
	 */
	public static final AvaliacaoBloco AVALIACAO_BLOCO = new AvaliacaoBloco();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AvaliacaoBlocoRecord> getRecordType() {
		return AvaliacaoBlocoRecord.class;
	}

	/**
	 * The column <code>ensinoindividualizado.avaliacao_bloco.idavaliacao</code>.
	 */
	public final TableField<AvaliacaoBlocoRecord, Integer> IDAVALIACAO = createField("idavaliacao", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ensinoindividualizado.avaliacao_bloco.idbloco</code>.
	 */
	public final TableField<AvaliacaoBlocoRecord, Integer> IDBLOCO = createField("idbloco", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>ensinoindividualizado.avaliacao_bloco</code> table reference
	 */
	public AvaliacaoBloco() {
		this("avaliacao_bloco", null);
	}

	/**
	 * Create an aliased <code>ensinoindividualizado.avaliacao_bloco</code> table reference
	 */
	public AvaliacaoBloco(String alias) {
		this(alias, AVALIACAO_BLOCO);
	}

	private AvaliacaoBloco(String alias, Table<AvaliacaoBlocoRecord> aliased) {
		this(alias, aliased, null);
	}

	private AvaliacaoBloco(String alias, Table<AvaliacaoBlocoRecord> aliased, Field<?>[] parameters) {
		super(alias, Ensinoindividualizado.ENSINOINDIVIDUALIZADO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AvaliacaoBlocoRecord> getPrimaryKey() {
		return Keys.KEY_AVALIACAO_BLOCO_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AvaliacaoBlocoRecord>> getKeys() {
		return Arrays.<UniqueKey<AvaliacaoBlocoRecord>>asList(Keys.KEY_AVALIACAO_BLOCO_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<AvaliacaoBlocoRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<AvaliacaoBlocoRecord, ?>>asList(Keys.FK_AVALIACAO_BLOCO_AVALIACAO1, Keys.FK_AVALIACAO_BLOCO_BLOCO1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AvaliacaoBloco as(String alias) {
		return new AvaliacaoBloco(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AvaliacaoBloco rename(String name) {
		return new AvaliacaoBloco(name, null);
	}
}