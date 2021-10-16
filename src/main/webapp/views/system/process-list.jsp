<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Process (v$process)</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Process (v$process)</h6>
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
									<th>Công cụ</th>
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
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ processes }">
									<tr role="row">
										<td>${ item.addr }</td>
										<td>${ item.pid }</td>
										<td>${ item.sosid }</td>
										<td>${ item.spid }</td>
										<td>${ item.stid }</td>
										<td>${ item.execution_type }</td>
										<td>${ item.pname }</td>
										<td>${ item.username }</td>
										<td>
											<a class="btn btn-primary" href="<c:url value="/he-thong/chi-tiet-process/${ item.addr }"></c:url>">Chi tiết</a> 
										</td>
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