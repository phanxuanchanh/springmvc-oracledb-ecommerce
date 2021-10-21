<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết role (dba_role)</h1>
	<a href="<c:url value="/he-thong/tao-moi-role"></c:url>"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết role (dba_role) "${ role.role }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">role</th>
							<td>${ role.role }</td>
						</tr>
						<tr>
							<th style="width: 25%;">role_id</th>
							<td>${ role.role_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password_required</th>
							<td>${ role.password_required }</td>
						</tr>
						<tr>
							<th style="width: 25%;">authentication_type</th>
							<td>${ role.authentication_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">common</th>
							<td>${ role.common }</td>
						</tr>
						<tr>
							<th style="width: 25%;">oracle_maintained</th>
							<td>${ role.oracle_maintained }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inherited</th>
							<td>${ role.inherited }</td>
						</tr>
						<tr>
							<th style="width: 25%;">implicit</th>
							<td>${ role.implicit }</td>
						</tr>
						<tr>
							<th style="width: 25%;">external_name</th>
							<td>${ role.external_name }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_roles"></c:url>">Quay về danh
			sách</a> | <a
			class="btn btn-success"
			href="<c:url value="/he-thong/chinh-sua-role/${ role.role }"></c:url>">Chỉnh sửa</a>
	</div>
</div>