package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TableMapper implements RowMapper<Table> {

	public Table mapRow(ResultSet rs, int rowNum) throws SQLException {
		Table table = new Table(rs.getString("owner"), rs.getString("table_name"), rs.getString("tablespace_name"), 
				rs.getString("cluster_name"), rs.getString("iot_name"), rs.getString("status"), rs.getBigDecimal("pct_free"), 
				rs.getBigDecimal("pct_used"), rs.getBigDecimal("ini_trans"), rs.getBigDecimal("max_trans"), 
				rs.getBigDecimal("initial_extent"), rs.getBigDecimal("next_extent"), rs.getBigDecimal("min_extents"), 
				rs.getBigDecimal("max_extents"), rs.getBigDecimal("pct_increase"), rs.getBigDecimal("freelists"), 
				rs.getBigDecimal("freelist_groups"), rs.getString("logging"), rs.getString("backed_up"), rs.getBigDecimal("num_rows"), 
				rs.getBigDecimal("blocks"), rs.getBigDecimal("empty_blocks"), rs.getBigDecimal("avg_space"), rs.getBigDecimal("chain_cnt"), 
				rs.getBigDecimal("avg_row_len"), rs.getBigDecimal("avg_space_freelist_blocks"), rs.getBigDecimal("num_freelist_blocks"), 
				rs.getString("degree"), rs.getString("instances"), rs.getString("cache"), rs.getString("table_lock"), 
				rs.getBigDecimal("sample_size"), rs.getTimestamp("last_analyzed"), rs.getString("partitioned"), rs.getString("iot_type"), 
				rs.getString("temporary"), rs.getString("secondary"), rs.getString("nested"), rs.getString("buffer_pool"), 
				rs.getString("flash_cache"), rs.getString("cell_flash_cache"), rs.getString("row_movement"), rs.getString("global_stats"), 
				rs.getString("user_stats"), rs.getString("duration"), rs.getString("skip_corrupt"), rs.getString("monitoring"), 
				rs.getString("cluster_owner"), rs.getString("dependencies"), rs.getString("compression"), rs.getString("compress_for"), 
				rs.getString("dropped"), rs.getString("read_only"), rs.getString("segment_created"), rs.getString("result_cache"), 
				rs.getString("clustering"), rs.getString("activity_tracking"), rs.getString("dml_timestamp"), rs.getString("has_identity"), 
				rs.getString("container_data"), rs.getString("inmemory"), rs.getString("inmemory_priority"), rs.getString("inmemory_distribute"), 
				rs.getString("inmemory_compression"), rs.getString("inmemory_duplicate"), rs.getString("default_collation"), 
				rs.getString("duplicated"), rs.getString("sharded"), rs.getString("external"), rs.getString("hybrid"), 
				rs.getString("cellmemory"), rs.getString("containers_default"), rs.getString("container_map"), rs.getString("extended_data_link"), 
				rs.getString("extended_data_link_map"), rs.getString("inmemory_service"), rs.getString("inmemory_service_name"), 
				rs.getString("container_map_object"), rs.getString("memoptimize_read"), rs.getString("memoptimize_write"), 
				rs.getString("has_sensitive_column"), rs.getString("admit_null"), rs.getString("data_link_dml_enabled"), rs.getString("logical_replication"));
		return table;
	}
}
