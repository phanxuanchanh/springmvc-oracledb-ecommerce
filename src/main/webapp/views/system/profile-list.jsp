<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Profile (dba_profiles)</h1>
	<div class="row">
		<div class="col">
			<a href="<c:url value="/he-thong/tao-moi-profile"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
			</a>
			<a href="<c:url value="/he-thong/chinh-sua-profile"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Chỉnh sửa
			</a>
			<a href="<c:url value="/he-thong/xoa-profile"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xóa
			</a>
		</div>
	</div>

</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div><a class="text-white-50 small" href="<c:url value="/he-thong/profile"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Profile (dba_profiles)</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">profile</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">resource_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">resource_type</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">limit</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">common</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">profile</th>
									<th rowspan="1" colspan="1">resource_name</th>
									<th rowspan="1" colspan="1">resource_type</th>
									<th rowspan="1" colspan="1">limit</th>
									<th rowspan="1" colspan="1">common</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ profiles }">
									<tr role="row">
										<td>${ item.profile }</td>
										<td>${ item.resource_name }</td>
										<td>${ item.resource_type }</td>
										<td>${ item.limit }</td>
										<td>${ item.common }</td>
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