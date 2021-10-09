<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Thông tin Process (v$process)</h1>
	<a href="#"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div><a class="text-white-50 small" href="<c:url value="/he-thong/v$process"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Thông tin Process (v$process)</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">



				<div class="row">
					<div class="col-sm-12">
						<table class="table table-bordered dataTable" id="dataTable"
							width="100%" cellspacing="0" role="grid"
							aria-describedby="dataTable_info" style="width: 100%;">
							<thead>
								<tr role="row">
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">addr</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sosid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">spid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">stid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">execution_type</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pname</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">username</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">serial#</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">terminal</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">program</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">traceid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">tracefile</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">background</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">latchwait</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">latchspin</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pga_used_mem</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pga_alloc_mem</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pga_freeable_mem</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pga_max_mem</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">numa_default</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">numa_curr</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">cpu_used</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">con_id</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">addr</th>
									<th rowspan="1" colspan="1">pid</th>
									<th rowspan="1" colspan="1">sosid</th>
									<th rowspan="1" colspan="1">spid</th>
									<th rowspan="1" colspan="1">stid</th>
									<th rowspan="1" colspan="1">execution_type</th>
									<th rowspan="1" colspan="1">pname</th>
									<th rowspan="1" colspan="1">username</th>
									<th rowspan="1" colspan="1">serial#</th>
									<th rowspan="1" colspan="1">terminal</th>
									<th rowspan="1" colspan="1">program</th>
									<th rowspan="1" colspan="1">traceid</th>
									<th rowspan="1" colspan="1">tracefile</th>
									<th rowspan="1" colspan="1">background</th>
									<th rowspan="1" colspan="1">latchwait</th>
									<th rowspan="1" colspan="1">latchspin</th>
									<th rowspan="1" colspan="1">pga_used_mem</th>
									<th rowspan="1" colspan="1">pga_alloc_mem</th>
									<th rowspan="1" colspan="1">pga_freeable_mem</th>
									<th rowspan="1" colspan="1">pga_max_mem</th>
									<th rowspan="1" colspan="1">numa_default</th>
									<th rowspan="1" colspan="1">numa_curr</th>
									<th rowspan="1" colspan="1">cpu_used</th>
									<th rowspan="1" colspan="1">con_id</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ v$process }">
									<tr role="row">
										<td>${ item.addr }</td>
										<td>${ item.pid }</td>
										<td>${ item.sosid }</td>
										<td>${ item.spid }</td>
										<td>${ item.stid }</td>
										<td>${ item.execution_type }</td>
										<td>${ item.pname }</td>
										<td>${ item.username }</td>
										<td>${ item.serial }</td>
										<td>${ item.terminal }</td>
										<td>${ item.program }</td>
										<td>${ item.traceid }</td>
										<td>${ item.tracefile }</td>
										<td>${ item.background }</td>
										<td>${ item.latchwait }</td>
										<td>${ item.latchspin }</td>
										<td>${ item.pga_used_mem }</td>
										<td>${ item.pga_alloc_mem }</td>
										<td>${ item.pga_freeable_mem }</td>
										<td>${ item.pga_max_mem }</td>
										<td>${ item.numa_default }</td>
										<td>${ item.numa_curr }</td>
										<td>${ item.cpu_used }</td>
										<td>${ item.con_id }</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row"></div>
			</div>
		</div>
	</div>
</div>