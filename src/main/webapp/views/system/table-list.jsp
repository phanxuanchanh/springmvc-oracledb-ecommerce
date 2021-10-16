<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Table</h1>
	<div class="row">
		<div class="col">
			<a href="<c:url value="/he-thong/danh-sach-table-theo-user"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xem các table theo tên user
			</a>
		</div>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Table</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">table_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">tablespace_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">cluster_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">num_rows</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sample_size</th>
									<th>Công cụ</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">table_name</th>
									<th rowspan="1" colspan="1">tablespace_name</th>
									<th rowspan="1" colspan="1">cluster_name</th>
									<th rowspan="1" colspan="1">num_rows</th>
									<th rowspan="1" colspan="1">sample_size</th>
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ tables }">
									<tr role="row">
										<td>${ item.table_name }</td>
										<td>${ item.tablespace_name }</td>
										<td>${ item.cluster_name }</td>
										<td>${ item.num_rows }</td>
										<td>${ item.sample_size }</td>
										<td>
											<a class="btn btn-primary" href="<c:url value="/he-thong/chi-tiet-table/${ item.table_name }"></c:url>">Chi tiết</a> 
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