<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết Tablespace</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết Tablespace: "${ tablespace.tablespace_name }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">tablespace_name</th>
							<td>${ tablespace.tablespace_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">block_size</th>
							<td>${ tablespace.block_size }</td>
						</tr>
						<tr>
							<th style="width: 25%;">initial_extent</th>
							<td>${ tablespace.initial_extent }</td>
						</tr>
						<tr>
							<th style="width: 25%;">next_extent</th>
							<td>${ tablespace.next_extent }</td>
						</tr>
						<tr>
							<th style="width: 25%;">min_extents</th>
							<td>${ tablespace.min_extents }</td>
						</tr>
						<tr>
							<th style="width: 25%;">max_extents</th>
							<td>${ tablespace.max_extents }</td>
						</tr>
						<tr>
							<th style="width: 25%;">max_size</th>
							<td>${ tablespace.max_size }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pct_increase</th>
							<td>${ tablespace.pct_increase }</td>
						</tr>
						<tr>
							<th style="width: 25%;">min_extlen</th>
							<td>${ tablespace.min_extlen }</td>
						</tr>
						<tr>
							<th style="width: 25%;">status</th>
							<td>${ tablespace.status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">contents</th>
							<td>${ tablespace.contents }</td>
						</tr>
						<tr>
							<th style="width: 25%;">logging</th>
							<td>${ tablespace.logging }</td>
						</tr>
						<tr>
							<th style="width: 25%;">force_logging</th>
							<td>${ tablespace.force_logging }</td>
						</tr>
						<tr>
							<th style="width: 25%;">extent_management</th>
							<td>${ tablespace.extent_management }</td>
						</tr>
						<tr>
							<th style="width: 25%;">allocation_type</th>
							<td>${ tablespace.allocation_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">plugged_in</th>
							<td>${ tablespace.plugged_in }</td>
						</tr>
						<tr>
							<th style="width: 25%;">segment_space_management</th>
							<td>${ tablespace.segment_space_management }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_tab_compression</th>
							<td>${ tablespace.def_tab_compression }</td>
						</tr>
						<tr>
							<th style="width: 25%;">retention</th>
							<td>${ tablespace.retention }</td>
						</tr>
						<tr>
							<th style="width: 25%;">bigfile</th>
							<td>${ tablespace.bigfile }</td>
						</tr>
						<tr>
							<th style="width: 25%;">predicate_evaluation</th>
							<td>${ tablespace.predicate_evaluation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">encrypted</th>
							<td>${ tablespace.encrypted }</td>
						</tr>
						<tr>
							<th style="width: 25%;">compress_for</th>
							<td>${ tablespace.compress_for }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory</th>
							<td>${ tablespace.def_inmemory }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory_priority</th>
							<td>${ tablespace.def_inmemory_priority }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory_distribute</th>
							<td>${ tablespace.def_inmemory_distribute }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory_compression</th>
							<td>${ tablespace.def_inmemory_compression }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory_duplicate</th>
							<td>${ tablespace.def_inmemory_duplicate }</td>
						</tr>
						<tr>
							<th style="width: 25%;">shared</th>
							<td>${ tablespace.shared }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_index_compression</th>
							<td>${ tablespace.def_index_compression }</td>
						</tr>
						<tr>
							<th style="width: 25%;">index_compress_for</th>
							<td>${ tablespace.index_compress_for }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_cellmemory</th>
							<td>${ tablespace.def_cellmemory }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory_service</th>
							<td>${ tablespace.def_inmemory_service }</td>
						</tr>
						<tr>
							<th style="width: 25%;">def_inmemory_service_name</th>
							<td>${ tablespace.def_inmemory_service_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">lost_write_protect</th>
							<td>${ tablespace.lost_write_protect }</td>
						</tr>
						<tr>
							<th style="width: 25%;">chunk_tablespace</th>
							<td>${ tablespace.chunk_tablespace }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_tablespaces"></c:url>">Quay về danh sách</a>
	</div>
</div>