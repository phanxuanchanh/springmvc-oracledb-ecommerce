<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Tablespace</h1>
	<div class="row">
		<div class="col">
			<a href="<c:url value="/he-thong/tao-moi-tablespace"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
			</a>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
			<div class="card bg-danger text-white shadow">
				<div class="card-body">
					Cần cẩn thận khi xóa tablespace, việc xóa nhầm có thể gây ra lỗi nghiêm trọng đối với CSDL.
					<div><a class="text-white-50 small" href="#">Thông báo quan trọng</a></div>
				</div>
			</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div>
						<a class="text-white-50 small"
							href="<c:url value="/he-thong/dba_tablespaces"></c:url>">Tắt thông
							báo này</a>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Tablespace</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">tablespace_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">block_size</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">initial_extent</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">next_extent</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">status</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">contents</th>
									<th>Công cụ</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">tablespace_name</th>
									<th rowspan="1" colspan="1">block_size</th>
									<th rowspan="1" colspan="1">initial_extent</th>
									<th rowspan="1" colspan="1">next_extent</th>
									<th rowspan="1" colspan="1">status</th>
									<th rowspan="1" colspan="1">contents</th>
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ tablespaces }">
									<tr role="row">
										<td>
											<a href="<c:url value="/he-thong/danh-sach-datafile-theo-tablespace?tablespace_name=${ item.tablespace_name }"></c:url>">
												${ item.tablespace_name }</a>
										</td>
										<td>${ item.block_size }</td>
										<td>${ item.initial_extent }</td>
										<td>${ item.next_extent }</td>
										<td>${ item.status }</td>
										<td>${ item.contents }</td>
										<td>
											<a class="btn btn-primary" href="<c:url value="/he-thong/chi-tiet-tablespace/${ item.tablespace_name }"></c:url>">Chi tiết</a> |
											<a class="btn btn-success" href="<c:url value="/he-thong/them-datafile-vao-tablespace/${ item.tablespace_name }"></c:url>">Thêm datafile</a> |
											<a class="btn btn-danger" href="<c:url value="/he-thong/xoa-tablespace/${ item.tablespace_name }"></c:url>">Xóa</a> 
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