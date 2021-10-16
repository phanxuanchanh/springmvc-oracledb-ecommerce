<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết Process</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết Process: "{ ADDR: ${ process.addr }; SID: ${ process.pid } }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">addr</th>
							<td>${ process.addr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pid</th>
							<td>${ process.sosid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sosid</th>
							<td>${ process.sosid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">spid</th>
							<td>${ process.spid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">stid</th>
							<td>${ process.stid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">execution_type</th>
							<td>${ process.execution_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pname</th>
							<td>${ process.pname }</td>
						</tr>
						<tr>
							<th style="width: 25%;">username</th>
							<td>${ process.username }</td>
						</tr>
						<tr>
							<th style="width: 25%;">serial</th>
							<td>${ serial }</td>
						</tr>
						<tr>
							<th style="width: 25%;">terminal</th>
							<td>${ process.terminal }</td>
						</tr>
						<tr>
							<th style="width: 25%;">program</th>
							<td>${ process.program }</td>
						</tr>
						<tr>
							<th style="width: 25%;">traceid</th>
							<td>${ process.traceid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">tracefile</th>
							<td>${ process.tracefile }</td>
						</tr>
						<tr>
							<th style="width: 25%;">background</th>
							<td>${ process.background }</td>
						</tr>
						<tr>
							<th style="width: 25%;">latchwait</th>
							<td>${ process.latchwait }</td>
						</tr>
						<tr>
							<th style="width: 25%;">latchspin</th>
							<td>${ process.latchspin }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pga_used_mem</th>
							<td>${ process.pga_used_mem }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pga_alloc_mem</th>
							<td>${ process.pga_alloc_mem }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pga_freeable_mem</th>
							<td>${ process.pga_freeable_mem }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pga_max_mem</th>
							<td>${ process.pga_max_mem }</td>
						</tr>
						<tr>
							<th style="width: 25%;">numa_default</th>
							<td>${ process.numa_default }</td>
						</tr>
						<tr>
							<th style="width: 25%;">numa_curr</th>
							<td>${ process.numa_curr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cpu_used</th>
							<td>${ process.cpu_used }</td>
						</tr>
						<tr>
							<th style="width: 25%;">con_id</th>
							<td>${ process.con_id }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/v$process"></c:url>">Quay về danh sách</a>
	</div>
</div>