<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết Instance</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết Instance: "${ instance.instance_name }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">instance_number</th>
							<td>${ instance.instance_number }</td>
						</tr>
						<tr>
							<th style="width: 25%;">instance_name</th>
							<td>${ instance.instance_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">host_name</th>
							<td>${ instance.host_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">version</th>
							<td>${ instance.version }</td>
						</tr>
						<tr>
							<th style="width: 25%;">version_legacy</th>
							<td>${ instance.version_legacy }</td>
						</tr>
						<tr>
							<th style="width: 25%;">version_full</th>
							<td>${ instance.version_full }</td>
						</tr>
						<tr>
							<th style="width: 25%;">startup_time</th>
							<td>${ instance.startup_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">status</th>
							<td>${ instance.status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">parallel</th>
							<td>${ parallel }</td>
						</tr>
						<tr>
							<th style="width: 25%;">thread#</th>
							<td>${ instance.thread }</td>
						</tr>
						<tr>
							<th style="width: 25%;">archiver</th>
							<td>${ instance.archiver }</td>
						</tr>
						<tr>
							<th style="width: 25%;">log_switch_wait</th>
							<td>${ instance.log_switch_wait }</td>
						</tr>
						<tr>
							<th style="width: 25%;">logins</th>
							<td>${ instance.logins }</td>
						</tr>
						<tr>
							<th style="width: 25%;">shutdown_pending</th>
							<td>${ instance.shutdown_pending }</td>
						</tr>
						<tr>
							<th style="width: 25%;">database_status</th>
							<td>${ instance.database_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">instance_role</th>
							<td>${ instance.instance_role }</td>
						</tr>
						<tr>
							<th style="width: 25%;">active_state</th>
							<td>${ instance.active_state }</td>
						</tr>
						<tr>
							<th style="width: 25%;">blocked</th>
							<td>${ instance.blocked }</td>
						</tr>
						<tr>
							<th style="width: 25%;">con_id</th>
							<td>${ instance.con_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">instance_mode</th>
							<td>${ instance.instance_mode }</td>
						</tr>
						<tr>
							<th style="width: 25%;">edition</th>
							<td>${ instance.edition }</td>
						</tr>
						<tr>
							<th style="width: 25%;">family</th>
							<td>${ instance.family }</td>
						</tr>
						<tr>
							<th style="width: 25%;">database_type</th>
							<td>${ instance.database_type }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/v$instance"></c:url>">Quay về danh sách</a>
	</div>
</div>