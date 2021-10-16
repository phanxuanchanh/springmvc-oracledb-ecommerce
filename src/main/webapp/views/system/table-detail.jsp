<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết table</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết table: "${ table.table_name }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">owner</th>
							<td>${ table.owner }</td>
						</tr>
						<tr>
							<th style="width: 25%;">table_name</th>
							<td>${ table.table_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">tablespace_name</th>
							<td>${ table.tablespace_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cluster_name</th>
							<td>${ table.cluster_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">iot_name</th>
							<td>${ table.iot_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">status</th>
							<td>${ table.status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pct_free</th>
							<td>${ table.pct_free }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pct_used</th>
							<td>${ table.pct_used }</td>
						</tr>
						<tr>
							<th style="width: 25%;">ini_trans</th>
							<td>${ table.ini_trans }</td>
						</tr>
						<tr>
							<th style="width: 25%;">max_trans</th>
							<td>${ table.max_trans }</td>
						</tr>
						<tr>
							<th style="width: 25%;">initial_extent</th>
							<td>${ table.initial_extent }</td>
						</tr>
						<tr>
							<th style="width: 25%;">next_extent</th>
							<td>${ table.next_extent }</td>
						</tr>
						<tr>
							<th style="width: 25%;">min_extents</th>
							<td>${ table.min_extents }</td>
						</tr>
						<tr>
							<th style="width: 25%;">max_extents</th>
							<td>${ table.max_extents }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pct_increase</th>
							<td>${ table.pct_increase }</td>
						</tr>
						<tr>
							<th style="width: 25%;">freelists</th>
							<td>${ table.freelists }</td>
						</tr>
						<tr>
							<th style="width: 25%;">freelist_groups</th>
							<td>${ table.freelist_groups }</td>
						</tr>
						<tr>
							<th style="width: 25%;">logging</th>
							<td>${ table.logging }</td>
						</tr>
						<tr>
							<th style="width: 25%;">backed_up</th>
							<td>${ table.backed_up }</td>
						</tr>
						<tr>
							<th style="width: 25%;">num_rows</th>
							<td>${ table.num_rows }</td>
						</tr>
						<tr>
							<th style="width: 25%;">blocks</th>
							<td>${ table.blocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">empty_blocks</th>
							<td>${ table.empty_blocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">avg_space</th>
							<td>${ table.avg_space }</td>
						</tr>
						<tr>
							<th style="width: 25%;">chain_cnt</th>
							<td>${ table.chain_cnt }</td>
						</tr>
						<tr>
							<th style="width: 25%;">avg_row_len</th>
							<td>${ table.avg_row_len }</td>
						</tr>
						<tr>
							<th style="width: 25%;">avg_space_freelist_blocks</th>
							<td>${ table.avg_space_freelist_blocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">num_freelist_blocks</th>
							<td>${ table.num_freelist_blocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">instances</th>
							<td>${ table.instances }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cache</th>
							<td>${ table.cache }</td>
						</tr>
						<tr>
							<th style="width: 25%;">table_lock</th>
							<td>${ table.table_lock }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sample_size</th>
							<td>${ table.sample_size }</td>
						</tr>
						<tr>
							<th style="width: 25%;">last_analyzed</th>
							<td>${ table.last_analyzed }</td>
						</tr>
						<tr>
							<th style="width: 25%;">partitioned</th>
							<td>${ table.partitioned }</td>
						</tr>
						<tr>
							<th style="width: 25%;">iot_type</th>
							<td>${ table.iot_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">temporary</th>
							<td>${ table.temporary }</td>
						</tr>
						<tr>
							<th style="width: 25%;">secondary</th>
							<td>${ table.secondary }</td>
						</tr>
						<tr>
							<th style="width: 25%;">nested</th>
							<td>${ table.nested }</td>
						</tr>
						<tr>
							<th style="width: 25%;">buffer_pool</th>
							<td>${ table.buffer_pool }</td>
						</tr>
						<tr>
							<th style="width: 25%;">flash_cache</th>
							<td>${ table.flash_cache }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cell_flash_cache</th>
							<td>${ table.cell_flash_cache }</td>
						</tr>
						<tr>
							<th style="width: 25%;">row_movement</th>
							<td>${ table.row_movement }</td>
						</tr>
						<tr>
							<th style="width: 25%;">global_stats</th>
							<td>${ table.global_stats }</td>
						</tr>
						<tr>
							<th style="width: 25%;">user_stats</th>
							<td>${ table.user_stats }</td>
						</tr>
						<tr>
							<th style="width: 25%;">duration</th>
							<td>${ table.duration }</td>
						</tr>
						<tr>
							<th style="width: 25%;">skip_corrupt</th>
							<td>${ table.skip_corrupt }</td>
						</tr>
						<tr>
							<th style="width: 25%;">monitoring</th>
							<td>${ table.monitoring }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cluster_owner</th>
							<td>${ table.cluster_owner }</td>
						</tr>
						<tr>
							<th style="width: 25%;">dependencies</th>
							<td>${ table.dependencies }</td>
						</tr>
						<tr>
							<th style="width: 25%;">compression</th>
							<td>${ table.compression }</td>
						</tr>
						<tr>
							<th style="width: 25%;">compress_for</th>
							<td>${ table.compress_for }</td>
						</tr>
						<tr>
							<th style="width: 25%;">dropped</th>
							<td>${ table.dropped }</td>
						</tr>
						<tr>
							<th style="width: 25%;">read_only</th>
							<td>${ table.read_only }</td>
						</tr>
						<tr>
							<th style="width: 25%;">segment_created</th>
							<td>${ table.segment_created }</td>
						</tr>
						<tr>
							<th style="width: 25%;">result_cache</th>
							<td>${ table.result_cache }</td>
						</tr>
						<tr>
							<th style="width: 25%;">clustering</th>
							<td>${ table.clustering }</td>
						</tr>
						<tr>
							<th style="width: 25%;">activity_tracking</th>
							<td>${ table.activity_tracking}</td>
						</tr>
						<tr>
							<th style="width: 25%;">dml_timestamp</th>
							<td>${ table.dml_timestamp }</td>
						</tr>
						<tr>
							<th style="width: 25%;">has_identity</th>
							<td>${ table.has_identity }</td>
						</tr>
						<tr>
							<th style="width: 25%;">container_data</th>
							<td>${ table.container_data }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory</th>
							<td>${ table.inmemory }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory_priority</th>
							<td>${ table.inmemory_priority }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory_distribute</th>
							<td>${ table.inmemory_distribute }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory_compression</th>
							<td>${ table.inmemory_compression }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory_duplicate</th>
							<td>${ table.inmemory_duplicate }</td>
						</tr>
						<tr>
							<th style="width: 25%;">default_collation</th>
							<td>${ table.default_collation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">duplicated</th>
							<td>${ table.duplicated }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sharded</th>
							<td>${ table.sharded }</td>
						</tr>
						<tr>
							<th style="width: 25%;">external</th>
							<td>${ table.external }</td>
						</tr>
						<tr>
							<th style="width: 25%;">hybrid</th>
							<td>${ table.hybrid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cellmemory</th>
							<td>${ table.cellmemory }</td>
						</tr>
						<tr>
							<th style="width: 25%;">containers_default</th>
							<td>${ table.containers_default }</td>
						</tr>
						<tr>
							<th style="width: 25%;">container_map</th>
							<td>${ table.container_map }</td>
						</tr>
						<tr>
							<th style="width: 25%;">extended_data_link</th>
							<td>${ table.extended_data_link }</td>
						</tr>
						<tr>
							<th style="width: 25%;">extended_data_link_map</th>
							<td>${ table.extended_data_link_map }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory_service</th>
							<td>${ table.inmemory_service }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inmemory_service_name</th>
							<td>${ table.inmemory_service_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">container_map_object</th>
							<td>${ table.container_map_object }</td>
						</tr>
						<tr>
							<th style="width: 25%;">memoptimize_read</th>
							<td>${ table.memoptimize_read }</td>
						</tr>
						<tr>
							<th style="width: 25%;">memoptimize_write</th>
							<td>${ table.memoptimize_write }</td>
						</tr>
						<tr>
							<th style="width: 25%;">has_sensitive_column</th>
							<td>${ table.has_sensitive_column }</td>
						</tr>
						<tr>
							<th style="width: 25%;">admit_null</th>
							<td>${ table.admit_null }</td>
						</tr>
						<tr>
							<th style="width: 25%;">data_link_dml_enable</th>
							<td>${ table.data_link_dml_enable }</td>
						</tr>
						<tr>
							<th style="width: 25%;">logical_replication</th>
							<td>${ table.logical_replication }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_tables"></c:url>">Quay về danh sách</a>
	</div>
</div>