package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Table {
	private String owner;
	private String table_name;
	private String tablespace_name;
	private String cluster_name;
	private String iot_name;
	private String status;
	private BigDecimal pct_free;
	private BigDecimal pct_used;
	private BigDecimal ini_trans;
	private BigDecimal max_trans;
	private BigDecimal initial_extent;
	private BigDecimal next_extent;
	private BigDecimal min_extents;
	private BigDecimal max_extents;
	private BigDecimal pct_increase;
	private BigDecimal freelists;
	private BigDecimal freelist_groups;
	private String logging;
	private String backed_up;
	private BigDecimal num_rows;
	private BigDecimal blocks;
	private BigDecimal empty_blocks;
	private BigDecimal avg_space;
	private BigDecimal chain_cnt;
	private BigDecimal avg_row_len;
	private BigDecimal avg_space_freelist_blocks;
	private BigDecimal num_freelist_blocks;
	private String degree;
	private String instances;
	private String cache;
	private String table_lock;
	private BigDecimal sample_size;
	private Timestamp last_analyzed;
	private String partitioned;
	private String iot_type;
	private String temporary;
	private String secondary;
	private String nested;
	private String buffer_pool;
	private String flash_cache;
	private String cell_flash_cache;
	private String row_movement;
	private String global_stats;
	private String user_stats;
	private String duration;
	private String skip_corrupt;
	private String monitoring;
	private String cluster_owner;
	private String dependencies;
	private String compression;
	private String compress_for;
	private String dropped;
	private String read_only;
	private String segment_created;
	private String result_cache;
	private String clustering;
	private String activity_tracking;
	private String dml_timestamp;
	private String has_identity;
	private String container_data;
	private String inmemory;
	private String inmemory_priority;
	private String inmemory_distribute;
	private String inmemory_compression;
	private String inmemory_duplicate;
	private String default_collation;
	private String duplicated;
	private String sharded;
	private String external;
	private String hybrid;
	private String cellmemory;
	private String containers_default;
	private String container_map;
	private String extended_data_link;
	private String extended_data_link_map;
	private String inmemory_service;
	private String inmemory_service_name;
	private String container_map_object;
	private String memoptimize_read;
	private String memoptimize_write;
	private String has_sensitive_column;
	private String admit_null;
	private String data_link_dml_enable;
	private String logical_replication;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getTablespace_name() {
		return tablespace_name;
	}

	public void setTablespace_name(String tablespace_name) {
		this.tablespace_name = tablespace_name;
	}

	public String getCluster_name() {
		return cluster_name;
	}

	public void setCluster_name(String cluster_name) {
		this.cluster_name = cluster_name;
	}

	public String getIot_name() {
		return iot_name;
	}

	public void setIot_name(String iot_name) {
		this.iot_name = iot_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getPct_free() {
		return pct_free;
	}

	public void setPct_free(BigDecimal pct_free) {
		this.pct_free = pct_free;
	}

	public BigDecimal getPct_used() {
		return pct_used;
	}

	public void setPct_used(BigDecimal pct_used) {
		this.pct_used = pct_used;
	}

	public BigDecimal getIni_trans() {
		return ini_trans;
	}

	public void setIni_trans(BigDecimal ini_trans) {
		this.ini_trans = ini_trans;
	}

	public BigDecimal getMax_trans() {
		return max_trans;
	}

	public void setMax_trans(BigDecimal max_trans) {
		this.max_trans = max_trans;
	}

	public BigDecimal getInitial_extent() {
		return initial_extent;
	}

	public void setInitial_extent(BigDecimal initial_extent) {
		this.initial_extent = initial_extent;
	}

	public BigDecimal getNext_extent() {
		return next_extent;
	}

	public void setNext_extent(BigDecimal next_extent) {
		this.next_extent = next_extent;
	}

	public BigDecimal getMin_extents() {
		return min_extents;
	}

	public void setMin_extent(BigDecimal min_extents) {
		this.min_extents = min_extents;
	}

	public BigDecimal getMax_extents() {
		return max_extents;
	}

	public void setMax_extent(BigDecimal max_extents) {
		this.max_extents = max_extents;
	}

	public BigDecimal getPct_increase() {
		return pct_increase;
	}

	public void setPct_increase(BigDecimal pct_increase) {
		this.pct_increase = pct_increase;
	}

	public BigDecimal getFreelists() {
		return freelists;
	}

	public void setFreelists(BigDecimal freelists) {
		this.freelists = freelists;
	}

	public BigDecimal getFreelist_groups() {
		return freelist_groups;
	}

	public void setFreelist_groups(BigDecimal freelist_groups) {
		this.freelist_groups = freelist_groups;
	}

	public String getLogging() {
		return logging;
	}

	public void setLogging(String logging) {
		this.logging = logging;
	}

	public String getBacked_up() {
		return backed_up;
	}

	public void setBacked_up(String backed_up) {
		this.backed_up = backed_up;
	}

	public BigDecimal getNum_rows() {
		return num_rows;
	}

	public void setNum_rows(BigDecimal num_rows) {
		this.num_rows = num_rows;
	}

	public BigDecimal getBlocks() {
		return blocks;
	}

	public void setBlocks(BigDecimal blocks) {
		this.blocks = blocks;
	}

	public BigDecimal getEmpty_blocks() {
		return empty_blocks;
	}

	public void setEmpty_blocks(BigDecimal empty_blocks) {
		this.empty_blocks = empty_blocks;
	}

	public BigDecimal getAvg_space() {
		return avg_space;
	}

	public void setAvg_space(BigDecimal avg_space) {
		this.avg_space = avg_space;
	}

	public BigDecimal getChain_cnt() {
		return chain_cnt;
	}

	public void setChain_cnt(BigDecimal chain_cnt) {
		this.chain_cnt = chain_cnt;
	}

	public BigDecimal getAvg_row_len() {
		return avg_row_len;
	}

	public void setAvg_row_len(BigDecimal avg_row_len) {
		this.avg_row_len = avg_row_len;
	}

	public BigDecimal getAvg_space_freelist_blocks() {
		return avg_space_freelist_blocks;
	}

	public void setAvg_space_freelist_blocks(BigDecimal avg_space_freelist_blocks) {
		this.avg_space_freelist_blocks = avg_space_freelist_blocks;
	}

	public BigDecimal getNum_freelist_blocks() {
		return num_freelist_blocks;
	}

	public void setNum_freelist_blocks(BigDecimal num_freelist_blocks) {
		this.num_freelist_blocks = num_freelist_blocks;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getInstances() {
		return instances;
	}

	public void setInstances(String instances) {
		this.instances = instances;
	}

	public String getCache() {
		return cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}

	public String getTable_lock() {
		return table_lock;
	}

	public void setTable_lock(String table_lock) {
		this.table_lock = table_lock;
	}

	public BigDecimal getSample_size() {
		return sample_size;
	}

	public void setSample_size(BigDecimal sample_size) {
		this.sample_size = sample_size;
	}

	public Timestamp getLast_analyzed() {
		return last_analyzed;
	}

	public void setLast_analyzed(Timestamp last_analyzed) {
		this.last_analyzed = last_analyzed;
	}

	public String getPartitioned() {
		return partitioned;
	}

	public void setPartitioned(String partitioned) {
		this.partitioned = partitioned;
	}

	public String getIot_type() {
		return iot_type;
	}

	public void setIot_type(String iot_type) {
		this.iot_type = iot_type;
	}

	public String getTemporary() {
		return temporary;
	}

	public void setTemporary(String temporary) {
		this.temporary = temporary;
	}

	public String getSecondary() {
		return secondary;
	}

	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}

	public String getNested() {
		return nested;
	}

	public void setNested(String nested) {
		this.nested = nested;
	}

	public String getBuffer_pool() {
		return buffer_pool;
	}

	public void setBuffer_pool(String buffer_pool) {
		this.buffer_pool = buffer_pool;
	}

	public String getFlash_cache() {
		return flash_cache;
	}

	public void setFlash_cache(String flash_cache) {
		this.flash_cache = flash_cache;
	}

	public String getCell_flash_cache() {
		return cell_flash_cache;
	}

	public void setCell_flash_cache(String cell_flash_cache) {
		this.cell_flash_cache = cell_flash_cache;
	}

	public String getRow_movement() {
		return row_movement;
	}

	public void setRow_movement(String row_movement) {
		this.row_movement = row_movement;
	}

	public String getGlobal_stats() {
		return global_stats;
	}

	public void setGlobal_stats(String global_stats) {
		this.global_stats = global_stats;
	}

	public String getUser_stats() {
		return user_stats;
	}

	public void setUser_stats(String user_stats) {
		this.user_stats = user_stats;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSkip_corrupt() {
		return skip_corrupt;
	}

	public void setSkip_corrupt(String skip_corrupt) {
		this.skip_corrupt = skip_corrupt;
	}

	public String getMonitoring() {
		return monitoring;
	}

	public void setMonitoring(String monitoring) {
		this.monitoring = monitoring;
	}

	public String getCluster_owner() {
		return cluster_owner;
	}

	public void setCluster_owner(String cluster_owner) {
		this.cluster_owner = cluster_owner;
	}

	public String getDependencies() {
		return dependencies;
	}

	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}

	public String getCompression() {
		return compression;
	}

	public void setCompression(String compression) {
		this.compression = compression;
	}

	public String getCompress_for() {
		return compress_for;
	}

	public void setCompress_for(String compress_for) {
		this.compress_for = compress_for;
	}

	public String getDropped() {
		return dropped;
	}

	public void setDropped(String dropped) {
		this.dropped = dropped;
	}

	public String getRead_only() {
		return read_only;
	}

	public void setRead_only(String read_only) {
		this.read_only = read_only;
	}

	public String getSegment_created() {
		return segment_created;
	}

	public void setSegment_created(String segment_created) {
		this.segment_created = segment_created;
	}

	public String getResult_cache() {
		return result_cache;
	}

	public void setResult_cache(String result_cache) {
		this.result_cache = result_cache;
	}

	public String getClustering() {
		return clustering;
	}

	public void setClustering(String clustering) {
		this.clustering = clustering;
	}

	public String getActivity_tracking() {
		return activity_tracking;
	}

	public void setActivity_tracking(String activity_tracking) {
		this.activity_tracking = activity_tracking;
	}

	public String getDml_timestamp() {
		return dml_timestamp;
	}

	public void setDml_timestamp(String dml_timestamp) {
		this.dml_timestamp = dml_timestamp;
	}

	public String getHas_identity() {
		return has_identity;
	}

	public void setHas_identity(String has_identity) {
		this.has_identity = has_identity;
	}

	public String getContainer_data() {
		return container_data;
	}

	public void setContainer_data(String container_data) {
		this.container_data = container_data;
	}

	public String getInmemory() {
		return inmemory;
	}

	public void setInmemory(String inmemory) {
		this.inmemory = inmemory;
	}

	public String getInmemory_priority() {
		return inmemory_priority;
	}

	public void setInmemory_priority(String inmemory_priority) {
		this.inmemory_priority = inmemory_priority;
	}

	public String getInmemory_distribute() {
		return inmemory_distribute;
	}

	public void setInmemory_distribute(String inmemory_distribute) {
		this.inmemory_distribute = inmemory_distribute;
	}

	public String getInmemory_compression() {
		return inmemory_compression;
	}

	public void setInmemory_compression(String inmemory_compression) {
		this.inmemory_compression = inmemory_compression;
	}

	public String getInmemory_duplicate() {
		return inmemory_duplicate;
	}

	public void setInmemory_duplicate(String inmemory_duplicate) {
		this.inmemory_duplicate = inmemory_duplicate;
	}

	public String getDefault_collation() {
		return default_collation;
	}

	public void setDefault_collation(String default_collation) {
		this.default_collation = default_collation;
	}

	public String getDuplicated() {
		return duplicated;
	}

	public void setDuplicated(String duplicated) {
		this.duplicated = duplicated;
	}

	public String getSharded() {
		return sharded;
	}

	public void setSharded(String sharded) {
		this.sharded = sharded;
	}

	public String getExternal() {
		return external;
	}

	public void setExternal(String external) {
		this.external = external;
	}

	public String getHybrid() {
		return hybrid;
	}

	public void setHybrid(String hybrid) {
		this.hybrid = hybrid;
	}

	public String getCellmemory() {
		return cellmemory;
	}

	public void setCellmemory(String cellmemory) {
		this.cellmemory = cellmemory;
	}

	public String getContainers_default() {
		return containers_default;
	}

	public void setContainers_default(String containers_default) {
		this.containers_default = containers_default;
	}

	public String getContainer_map() {
		return container_map;
	}

	public void setContainer_map(String container_map) {
		this.container_map = container_map;
	}

	public String getExtended_data_link() {
		return extended_data_link;
	}

	public void setExtended_data_link(String extended_data_link) {
		this.extended_data_link = extended_data_link;
	}

	public String getExtended_data_link_map() {
		return extended_data_link_map;
	}

	public void setExtended_data_link_map(String extended_data_link_map) {
		this.extended_data_link_map = extended_data_link_map;
	}

	public String getInmemory_service() {
		return inmemory_service;
	}

	public void setInmemory_service(String inmemory_service) {
		this.inmemory_service = inmemory_service;
	}

	public String getInmemory_service_name() {
		return inmemory_service_name;
	}

	public void setInmemory_service_name(String inmemory_service_name) {
		this.inmemory_service_name = inmemory_service_name;
	}

	public String getContainer_map_object() {
		return container_map_object;
	}

	public void setContainer_map_object(String container_map_object) {
		this.container_map_object = container_map_object;
	}

	public String getMemoptimize_read() {
		return memoptimize_read;
	}

	public void setMemoptimize_read(String memoptimize_read) {
		this.memoptimize_read = memoptimize_read;
	}

	public String getMemoptimize_write() {
		return memoptimize_write;
	}

	public void setMemoptimize_write(String memoptimize_write) {
		this.memoptimize_write = memoptimize_write;
	}

	public String getHas_sensitive_column() {
		return has_sensitive_column;
	}

	public void setHas_sensitive_column(String has_sensitive_column) {
		this.has_sensitive_column = has_sensitive_column;
	}

	public String getAdmit_null() {
		return admit_null;
	}

	public void setAdmit_null(String admit_null) {
		this.admit_null = admit_null;
	}

	public String getData_link_dml_enable() {
		return data_link_dml_enable;
	}

	public void setData_link_dml_enable(String data_link_dml_enable) {
		this.data_link_dml_enable = data_link_dml_enable;
	}

	public String getLogical_replication() {
		return logical_replication;
	}

	public void setLogical_replication(String logical_replication) {
		this.logical_replication = logical_replication;
	}

	public Table(String owner, String table_name, String tablespace_name, String cluster_name, String iot_name,
			String status, BigDecimal pct_free, BigDecimal pct_used, BigDecimal ini_trans, BigDecimal max_trans,
			BigDecimal initial_extent, BigDecimal next_extent, BigDecimal min_extents, BigDecimal max_extents,
			BigDecimal pct_increase, BigDecimal freelists, BigDecimal freelist_groups, String logging, String backed_up,
			BigDecimal num_rows, BigDecimal blocks, BigDecimal empty_blocks, BigDecimal avg_space, BigDecimal chain_cnt,
			BigDecimal avg_row_len, BigDecimal avg_space_freelist_blocks, BigDecimal num_freelist_blocks, String degree,
			String instances, String cache, String table_lock, BigDecimal sample_size, Timestamp last_analyzed,
			String partitioned, String iot_type, String temporary, String secondary, String nested, String buffer_pool,
			String flash_cache, String cell_flash_cache, String row_movement, String global_stats, String user_stats,
			String duration, String skip_corrupt, String monitoring, String cluster_owner, String dependencies,
			String compression, String compress_for, String dropped, String read_only, String segment_created,
			String result_cache, String clustering, String activity_tracking, String dml_timestamp, String has_identity,
			String container_data, String inmemory, String inmemory_priority, String inmemory_distribute,
			String inmemory_compression, String inmemory_duplicate, String default_collation, String duplicated,
			String sharded, String external, String hybrid, String cellmemory, String containers_default,
			String container_map, String extended_data_link, String extended_data_link_map, String inmemory_service,
			String inmemory_service_name, String container_map_object, String memoptimize_read,
			String memoptimize_write, String has_sensitive_column, String admit_null, String data_link_dml_enable,
			String logical_replication) {
		super();
		this.owner = owner;
		this.table_name = table_name;
		this.tablespace_name = tablespace_name;
		this.cluster_name = cluster_name;
		this.iot_name = iot_name;
		this.status = status;
		this.pct_free = pct_free;
		this.pct_used = pct_used;
		this.ini_trans = ini_trans;
		this.max_trans = max_trans;
		this.initial_extent = initial_extent;
		this.next_extent = next_extent;
		this.min_extents = min_extents;
		this.max_extents = max_extents;
		this.pct_increase = pct_increase;
		this.freelists = freelists;
		this.freelist_groups = freelist_groups;
		this.logging = logging;
		this.backed_up = backed_up;
		this.num_rows = num_rows;
		this.blocks = blocks;
		this.empty_blocks = empty_blocks;
		this.avg_space = avg_space;
		this.chain_cnt = chain_cnt;
		this.avg_row_len = avg_row_len;
		this.avg_space_freelist_blocks = avg_space_freelist_blocks;
		this.num_freelist_blocks = num_freelist_blocks;
		this.degree = degree;
		this.instances = instances;
		this.cache = cache;
		this.table_lock = table_lock;
		this.sample_size = sample_size;
		this.last_analyzed = last_analyzed;
		this.partitioned = partitioned;
		this.iot_type = iot_type;
		this.temporary = temporary;
		this.secondary = secondary;
		this.nested = nested;
		this.buffer_pool = buffer_pool;
		this.flash_cache = flash_cache;
		this.cell_flash_cache = cell_flash_cache;
		this.row_movement = row_movement;
		this.global_stats = global_stats;
		this.user_stats = user_stats;
		this.duration = duration;
		this.skip_corrupt = skip_corrupt;
		this.monitoring = monitoring;
		this.cluster_owner = cluster_owner;
		this.dependencies = dependencies;
		this.compression = compression;
		this.compress_for = compress_for;
		this.dropped = dropped;
		this.read_only = read_only;
		this.segment_created = segment_created;
		this.result_cache = result_cache;
		this.clustering = clustering;
		this.activity_tracking = activity_tracking;
		this.dml_timestamp = dml_timestamp;
		this.has_identity = has_identity;
		this.container_data = container_data;
		this.inmemory = inmemory;
		this.inmemory_priority = inmemory_priority;
		this.inmemory_distribute = inmemory_distribute;
		this.inmemory_compression = inmemory_compression;
		this.inmemory_duplicate = inmemory_duplicate;
		this.default_collation = default_collation;
		this.duplicated = duplicated;
		this.sharded = sharded;
		this.external = external;
		this.hybrid = hybrid;
		this.cellmemory = cellmemory;
		this.containers_default = containers_default;
		this.container_map = container_map;
		this.extended_data_link = extended_data_link;
		this.extended_data_link_map = extended_data_link_map;
		this.inmemory_service = inmemory_service;
		this.inmemory_service_name = inmemory_service_name;
		this.container_map_object = container_map_object;
		this.memoptimize_read = memoptimize_read;
		this.memoptimize_write = memoptimize_write;
		this.has_sensitive_column = has_sensitive_column;
		this.admit_null = admit_null;
		this.data_link_dml_enable = data_link_dml_enable;
		this.logical_replication = logical_replication;
	}

	public Table() {
		super();
	}
}
