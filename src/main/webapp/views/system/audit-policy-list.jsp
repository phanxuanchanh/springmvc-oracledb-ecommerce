<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Policy (dba_audit_policies)</h1>
		<div class="row">
		<div class="col">
			<a href="<c:url value="/he-thong/tao-moi-audit-policy"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
			</a>
			<a href="<c:url value="/he-thong/dba_fga_audit_trail"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xem quá trình ghi nhận audit
			</a>
		</div>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Policy (dba_audit_policies)</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">object_schema</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">object_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">policy_owner</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">policy_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">policy_text</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">policy_column</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pf_schema</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pf_package</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pf_function</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">enabled</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sel</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">ins</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">upd</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">del</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">audit_trail</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">policy_column_options</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">common</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">inherited</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">object_schema</th>
									<th rowspan="1" colspan="1">object_name</th>
									<th rowspan="1" colspan="1">policy_owner</th>
									<th rowspan="1" colspan="1">policy_name</th>
									<th rowspan="1" colspan="1">policy_text</th>
									<th rowspan="1" colspan="1">policy_column</th>
									<th rowspan="1" colspan="1">pf_schema</th>
									<th rowspan="1" colspan="1">pf_package</th>
									<th rowspan="1" colspan="1">pf_function</th>
									<th rowspan="1" colspan="1">enabled</th>
									<th rowspan="1" colspan="1">sel</th>
									<th rowspan="1" colspan="1">ins</th>
									<th rowspan="1" colspan="1">upd</th>
									<th rowspan="1" colspan="1">del</th>
									<th rowspan="1" colspan="1">audit_trail</th>
									<th rowspan="1" colspan="1">policy_column_options</th>
									<th rowspan="1" colspan="1">common</th>
									<th rowspan="1" colspan="1">inherited</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ auditPolicies }">
									<tr role="row">
										<td>${ item.object_schema }</td>
										<td>${ item.object_name }</td>
										<td>${ item.policy_owner }</td>
										<td>${ item.policy_name }</td>
										<td>${ item.policy_text }</td>
										<td>${ item.policy_column }</td>
										<td>${ item.pf_schema }</td>
										<td>${ item.pf_package }</td>
										<td>${ item.pf_function }</td>
										<td>${ item.enabled }</td>
										<td>${ item.sel }</td>
										<td>${ item.ins }</td>
										<td>${ item.upd }</td>
										<td>${ item.del }</td>
										<td>${ item.audit_trail }</td>
										<td>${ item.policy_column_options }</td>
										<td>${ item.common }</td>
										<td>${ item.inherited }</td>
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