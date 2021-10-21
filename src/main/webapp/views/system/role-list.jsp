<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các nhóm quyền Role (dba_roles)</h1>
	<a href="<c:url value="/he-thong/tao-moi-role"></c:url>"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800"></h1>
	<div class="row">
		<div class="col">
			<c:url var="post_url" value="/he-thong/dba_roles"></c:url> 
			<form:form method="GET" action="${ post_url }">
				<input type="text" name="role_name_keyword" class="form-control bg-light border-0 small" style="border: 1px solid !important;"
					placeholder="Tìm kiếm..." aria-label="Search" aria-describedby="basic-addon2">
			</form:form>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
			<div class="card bg-danger text-white shadow">
				<div class="card-body">
					Cảnh báo: Cần cẩn thận trong việc chỉnh sửa hoặc xóa role.
					<div>
						<a class="text-white-50 small"
							href="#">Thông báo quan trọng</a>
					</div>
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
							href="<c:url value="/he-thong/dba_roles"></c:url>">Tắt thông
							báo này</a>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các nhóm quyền Role (dba_roles)</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">role</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">role_id</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">password_required</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">authentication_type</th>
									<th>Công cụ</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">role</th>
									<th rowspan="1" colspan="1">role_id</th>
									<th rowspan="1" colspan="1">password_required</th>
									<th rowspan="1" colspan="1">authentication_type</th>
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ roles }">
									<tr role="row">
										<td>${ item.role }</td>
										<td>${ item.role_id }</td>
										<td>${ item.password_required }</td>
										<td>${ item.authentication_type }</td>
										<td>
											<c:url var="post_url" value="/he-thong/xoa-role"></c:url> 
											<form:form id="deleteRole${ item.role_id }" method="POST" action="${ post_url }">
												<input type="hidden" name="roleName" value="${ item.role }" />
											</form:form>
											<a class="btn btn-primary" href="<c:url value="/he-thong/chi-tiet-role/${ item.role_id }"></c:url>">Chi tiết</a> |
											<a class="btn btn-success" href="<c:url value="/he-thong/chinh-sua-role/${ item.role }"></c:url>">Chỉnh sửa</a> | 
											<a class="btn btn-success" href="<c:url value="/he-thong/gan-thu-hoi-quyen-role/${ item.role }"></c:url>">Gán/TH quyền</a> | 
											<button type="submit" class="btn btn-danger" form="deleteRole${ item.role_id }">Xóa</button>
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