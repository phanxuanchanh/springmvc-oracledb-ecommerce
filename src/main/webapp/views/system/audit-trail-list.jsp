<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Audit Trail</h1>
	<div class="row">
		<div class="col">
			<c:url var="post_url" value="/he-thong/dba_fga_audit_trail"></c:url> 
			<form:form method="GET" action="${ post_url }">
				<input type="text" name="object_schema" class="form-control bg-light border-0 small" style="border: 1px solid !important;"
					placeholder="Tìm kiếm theo tên schema..." aria-label="Search" aria-describedby="basic-addon2">
			</form:form>
		</div>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Audit Trail</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">session_id</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">timestamp</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">db_user</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">os_user</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">userhost</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">client_id</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">econtext_id</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">ext_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">object_schema</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">object_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">policy_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">scn</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sql_text</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sql_bind</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">comment$text</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">statement_type</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">extended_timestamp</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">proxy_sessionid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">global_uid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">instance_number</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">os_process</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">transactionid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">statementid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">entryid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">obj_edition_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">dbid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">rls_info</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">current_user</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">session_id</th>
									<th rowspan="1" colspan="1">timestamp</th>
									<th rowspan="1" colspan="1">db_user</th>
									<th rowspan="1" colspan="1">os_user</th>
									<th rowspan="1" colspan="1">userhost</th>
									<th rowspan="1" colspan="1">client_id</th>
									<th rowspan="1" colspan="1">econtext_id</th>
									<th rowspan="1" colspan="1">ext_name</th>
									<th rowspan="1" colspan="1">object_schema</th>
									<th rowspan="1" colspan="1">object_name</th>
									<th rowspan="1" colspan="1">policy_name</th>
									<th rowspan="1" colspan="1">scn</th>
									<th rowspan="1" colspan="1">sql_text</th>
									<th rowspan="1" colspan="1">sql_bind</th>
									<th rowspan="1" colspan="1">comment$text</th>
									<th rowspan="1" colspan="1">statement_type</th>
									<th rowspan="1" colspan="1">extended_timestamp</th>
									<th rowspan="1" colspan="1">proxy_sessionid</th>
									<th rowspan="1" colspan="1">global_uid</th>
									<th rowspan="1" colspan="1">instance_number</th>
									<th rowspan="1" colspan="1">os_process</th>
									<th rowspan="1" colspan="1">transactionid</th>
									<th rowspan="1" colspan="1">statementid</th>
									<th rowspan="1" colspan="1">entryid</th>
									<th rowspan="1" colspan="1">obj_edition_name</th>
									<th rowspan="1" colspan="1">dbid</th>
									<th rowspan="1" colspan="1">rls_info</th>
									<th rowspan="1" colspan="1">current_user</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ auditTrails }">
									<tr role="row">
										<td>${ item.session_id }</td>
										<td>${ item.timestamp }</td>
										<td>${ item.db_user }</td>
										<td>${ item.os_user }</td>
										<td>${ item.userhost }</td>
										<td>${ item.client_id }</td>
										<td>${ item.econtext_id }</td>
										<td>${ item.ext_name }</td>
										<td>${ item.object_schema }</td>
										<td>${ item.object_name }</td>
										<td>${ item.policy_name }</td>
										<td>${ item.scn }</td>
										<td>${ item.sql_text }</td>
										<td>${ item.sql_bind }</td>
										<td>${ item.comment$text }</td>
										<td>${ item.statement_type }</td>
										<td>${ item.extended_timestamp }</td>
										<td>${ item.proxy_sessionid }</td>
										<td>${ item.global_uid }</td>
										<td>${ item.instance_number }</td>
										<td>${ item.os_process }</td>
										<td>${ item.transactionid }</td>
										<td>${ item.statementid }</td>
										<td>${ item.entryid }</td>
										<td>${ item.obj_edition_name }</td>
										<td>${ item.dbid }</td>
										<td>${ item.rls_info }</td>
										<td>${ item.current_user }</td>
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