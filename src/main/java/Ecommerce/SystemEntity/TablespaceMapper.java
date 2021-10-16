package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TablespaceMapper implements RowMapper<Tablespace> {
	private boolean fullColumn;

	public TablespaceMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public Tablespace mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new Tablespace(rs.getString("tablespace_name"), rs.getBigDecimal("block_size"),
					rs.getBigDecimal("initial_extent"), rs.getBigDecimal("next_extent"),
					rs.getBigDecimal("min_extents"), rs.getBigDecimal("max_extents"), rs.getBigDecimal("max_size"),
					rs.getBigDecimal("pct_increase"), rs.getBigDecimal("min_extlen"), rs.getString("status"),
					rs.getString("contents"), rs.getString("logging"), rs.getString("force_logging"),
					rs.getString("extent_management"), rs.getString("allocation_type"), rs.getString("plugged_in"),
					rs.getString("segment_space_management"), rs.getString("def_tab_compression"),
					rs.getString("retention"), rs.getString("bigfile"), rs.getString("predicate_evaluation"),
					rs.getString("encrypted"), rs.getString("compress_for"), rs.getString("def_inmemory"),
					rs.getString("def_inmemory_priority"), rs.getString("def_inmemory_distribute"),
					rs.getString("def_inmemory_compression"), rs.getString("def_inmemory_duplicate"),
					rs.getString("shared"), rs.getString("def_index_compression"), rs.getString("index_compress_for"),
					rs.getString("def_cellmemory"), rs.getString("def_inmemory_service"),
					rs.getString("def_inmemory_service_name"), rs.getString("lost_write_protect"),
					rs.getString("chunk_tablespace"));

		return new Tablespace(rs.getString("tablespace_name"), rs.getBigDecimal("block_size"),
				rs.getBigDecimal("initial_extent"), rs.getBigDecimal("next_extent"), rs.getString("status"),
				rs.getString("contents"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
