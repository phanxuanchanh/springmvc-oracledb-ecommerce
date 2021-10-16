<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Thông tin tài khoản user (dba_users)</h1>
	<a href="<c:url value="/he-thong/tao-moi-tai-khoan-user"></c:url>"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
			<div class="card bg-danger text-white shadow">
				<div class="card-body">
					Cảnh báo: Cần cẩn thận trong việc chỉnh sửa hoặc xóa user
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
							href="<c:url value="/he-thong/dba_users"></c:url>">Tắt thông
							báo này</a>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Thông tin tài khoản user (dba_users)</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">username</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">account_status</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">expiry_date</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">default_tablespace</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">created</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">profile</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">last_login</th>
									<th>Công cụ</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">username</th>
									<th rowspan="1" colspan="1">account_status</th>
									<th rowspan="1" colspan="1">expiry_date</th>
									<th rowspan="1" colspan="1">default_tablespace</th>
									<th rowspan="1" colspan="1">created</th>
									<th rowspan="1" colspan="1">profile</th>
									<th rowspan="1" colspan="1">last_login</th>
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ dba_users }">
									<tr role="row">
										<td>${ item.username }</td>
										<td>${ item.account_status }</td>
										<td>${ item.expiry_date }</td>
										<td>${ item.default_tablespace }</td>
										<td>${ item.created }</td>
										<td>${ item.profile }</td>
										<td>${ item.last_login }</td>
										<td>
											<c:url var="post_url" value="/he-thong/xoa-tai-khoan-user"></c:url> 
											<form:form id="deleteDba_User${ item.username }" method="POST" action="${ post_url }">
												<input type="hidden" name="username" value="${ item.username }" />
											</form:form>
											<a class="btn btn-success" href="<c:url value="/he-thong/chinh-sua-tai-khoan-user/${ item.username }"></c:url>">Chỉnh sửa</a> | 
											<a class="btn btn-primary" href="<c:url value="/he-thong/chi-tiet-tai-khoan-user/${ item.username }"></c:url>">Xem chi tiết</a> | 
											<button type="submit" class="btn btn-danger" form="deleteDba_User${ item.username }">Xóa</button>
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