<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết thông tin tài khoản user (dba_user)</h1>
	<a href="<c:url value="/he-thong/tao-moi-tai-khoan-user"></c:url>"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết thông tin tài khoản user (dba_user) "${ user.username }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">username</th>
							<td>${ user.username }</td>
						</tr>
						<tr>
							<th style="width: 25%;">user_id</th>
							<td>${ user.user_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password</th>
							<td>${ user.password }</td>
						</tr>
						<tr>
							<th style="width: 25%;">account_status</th>
							<td>${ user.account_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">lock_date</th>
							<td>${ user.lock_date }</td>
						</tr>
						<tr>
							<th style="width: 25%;">expiry_date</th>
							<td>${ user.expiry_date }</td>
						</tr>
						<tr>
							<th style="width: 25%;">default_tablespace</th>
							<td>${ user.default_tablespace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">temporary_tablespace</th>
							<td>${ user.temporary_tablespace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">local_temp_tablespace</th>
							<td>${ user.local_temp_tablespace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">created</th>
							<td>${ user.created }</td>
						</tr>
						<tr>
							<th style="width: 25%;">profile</th>
							<td>${ user.profile }</td>
						</tr>
						<tr>
							<th style="width: 25%;">initial_rsrc_consumer_group</th>
							<td>${ user.initial_rsrc_consumer_group }</td>
						</tr>
						<tr>
							<th style="width: 25%;">external_name</th>
							<td>${ user.external_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password_versions</th>
							<td>${ user.password_versions }</td>
						</tr>
						<tr>
							<th style="width: 25%;">editions_enabled</th>
							<td>${ user.editions_enabled }</td>
						</tr>
						<tr>
							<th style="width: 25%;">authentication_type</th>
							<td>${ user.authentication_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">proxy_only_connect</th>
							<td>${ user.proxy_only_connect }</td>
						</tr>
						<tr>
							<th style="width: 25%;">common</th>
							<td>${ user.common }</td>
						</tr>
						<tr>
							<th style="width: 25%;">last_login</th>
							<td>${ user.last_login }</td>
						</tr>
						<tr>
							<th style="width: 25%;">oracle_maintained</th>
							<td>${ user.oracle_maintained }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inherited</th>
							<td>${ user.inherited }</td>
						</tr>
						
						
						<tr>
							<th style="width: 25%;">default_collation</th>
							<td>${ user.default_collation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">implicit</th>
							<td>${ user.implicit }</td>
						</tr>
						<tr>
							<th style="width: 25%;">all_shard</th>
							<td>${ user.all_shard }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password_change_date</th>
							<td>${ user.password_change_date }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_users"></c:url>">Quay về danh
			sách</a> | <a
			class="btn btn-success"
			href="<c:url value="/he-thong/chinh-sua-tai-khoan-user/${ user.username }"></c:url>">Chỉnh sửa</a>
	</div>
</div>