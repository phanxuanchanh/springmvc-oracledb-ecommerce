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
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết thông tin tài khoản user (dba_user) "${ dba_user.username }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">username</th>
							<td>${ dba_user.username }</td>
						</tr>
						<tr>
							<th style="width: 25%;">user_id</th>
							<td>${ dba_user.user_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password</th>
							<td>${ dba_user.password }</td>
						</tr>
						<tr>
							<th style="width: 25%;">account_status</th>
							<td>${ dba_user.account_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">lock_date</th>
							<td>${ dba_user.lock_date }</td>
						</tr>
						<tr>
							<th style="width: 25%;">expiry_date</th>
							<td>${ dba_user.expiry_date }</td>
						</tr>
						<tr>
							<th style="width: 25%;">default_tablespace</th>
							<td>${ dba_user.default_tablespace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">temporary_tablespace</th>
							<td>${ dba_user.temporary_tablespace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">local_temp_tablespace</th>
							<td>${ dba_user.local_temp_tablespace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">created</th>
							<td>${ dba_user.created }</td>
						</tr>
						<tr>
							<th style="width: 25%;">profile</th>
							<td>${ dba_user.profile }</td>
						</tr>
						<tr>
							<th style="width: 25%;">initial_rsrc_consumer_group</th>
							<td>${ dba_user.initial_rsrc_consumer_group }</td>
						</tr>
						<tr>
							<th style="width: 25%;">external_name</th>
							<td>${ dba_user.external_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password_versions</th>
							<td>${ dba_user.password_versions }</td>
						</tr>
						<tr>
							<th style="width: 25%;">editions_enabled</th>
							<td>${ dba_user.editions_enabled }</td>
						</tr>
						<tr>
							<th style="width: 25%;">authentication_type</th>
							<td>${ dba_user.authentication_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">proxy_only_connect</th>
							<td>${ dba_user.proxy_only_connect }</td>
						</tr>
						<tr>
							<th style="width: 25%;">common</th>
							<td>${ dba_user.common }</td>
						</tr>
						<tr>
							<th style="width: 25%;">last_login</th>
							<td>${ dba_user.last_login }</td>
						</tr>
						<tr>
							<th style="width: 25%;">oracle_maintained</th>
							<td>${ dba_user.oracle_maintained }</td>
						</tr>
						<tr>
							<th style="width: 25%;">inherited</th>
							<td>${ dba_user.inherited }</td>
						</tr>
						
						
						<tr>
							<th style="width: 25%;">default_collation</th>
							<td>${ dba_user.default_collation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">implicit</th>
							<td>${ dba_user.implicit }</td>
						</tr>
						<tr>
							<th style="width: 25%;">all_shard</th>
							<td>${ dba_user.all_shard }</td>
						</tr>
						<tr>
							<th style="width: 25%;">password_change_date</th>
							<td>${ dba_user.password_change_date }</td>
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
			href="<c:url value="/he-thong/chinh-sua-tai-khoan-user/${ dba_user.username }"></c:url>">Chỉnh sửa</a>
	</div>
</div>