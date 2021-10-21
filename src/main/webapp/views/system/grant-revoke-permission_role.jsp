<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Gán / Thu hồi
		quyền của Role</h1>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div>
						<a class="text-white-50 small"
							href="<c:url value="/he-thong/gan-thu-hoi-quyen-role/${ rolePermissionForm.role_name }"></c:url>">Tắt
							thông báo này</a>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Gán / Thu hồi quyền
			của Role: "${ rolePermissionForm.role_name }"</h6>
	</div>
	<div class="card-body">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-12">
				<h6 class="text-bold text-success">Các quyền hệ thống hiện có</h6>
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
												rowspan="1" colspan="1" aria-sort="ascending">grantee</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">privilege</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">admin_option</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">common</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">inherited</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th rowspan="1" colspan="1">grantee</th>
											<th rowspan="1" colspan="1">privilege</th>
											<th rowspan="1" colspan="1">admin_option</th>
											<th rowspan="1" colspan="1">common</th>
											<th rowspan="1" colspan="1">inherited</th>
										</tr>
									</tfoot>
									<tbody>
										<c:forEach var="item" items="${ systemPrivileges }" varStatus="theCount">
											<tr role="row" onclick="displaySystemPrivilege(${ theCount.count })">
												<td>${ item.grantee }</td>
												<td id="systemPrivilegeItem${ theCount.count }">${ item.privilege }</td>
												<td>${ item.admin_option }</td>
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

				<h6 class="text-bold text-success mt-4">Các quyền đối tượng hiện có</h6>
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
												rowspan="1" colspan="1" aria-sort="ascending">grantee</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">owner</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">table_name</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">grantor</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">privilege</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">grantable</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">hierarchy</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">common</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">type</th>
											<th class="sorting" tabindex="0" aria-controls="dataTable"
												rowspan="1" colspan="1" aria-sort="ascending">inherited</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<th rowspan="1" colspan="1">grantee</th>
											<th rowspan="1" colspan="1">owner</th>
											<th rowspan="1" colspan="1">table_name</th>
											<th rowspan="1" colspan="1">grantor</th>
											<th rowspan="1" colspan="1">privilege</th>
											<th rowspan="1" colspan="1">grantable</th>
											<th rowspan="1" colspan="1">hierarchy</th>
											<th rowspan="1" colspan="1">common</th>
											<th rowspan="1" colspan="1">type</th>
											<th rowspan="1" colspan="1">inherited</th>
										</tr>
									</tfoot>
									<tbody>
										<c:forEach var="item" items="${ objectPrivileges }" varStatus="theCount">
											<tr role="row" onclick="displayObjectPrivilege(${ theCount.count })">
												<td>${ item.grantee } </td>
												<td>${ item.owner } </td>
												<td>${ item.table_name } </td>
												<td>${ item.grantor } </td>
												<td id="objectPrivilegeItem${ theCount.count }">${ item.privilege } </td>
												<td>${ item.grantable } </td>
												<td>${ item.hierarchy } </td>
												<td>${ item.common } </td>
												<td>${ item.type } </td>
												<td>${ item.inherited } </td>
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
			<div class="col-lg-6 col-md-6 col-sm-12">
				<c:url var="post_url"
					value="/he-thong/gan-thu-hoi-quyen-role/${ rolePermissionForm.role_name }"></c:url>
				<form:form method="POST" action="${ post_url }"
					modelAttribute="rolePermissionForm">
					<div class="form-horizontal">

						<div class="form-group">
							<label class="control-label" for="role_name">role_name</label>
							<div>
								<form:input path="role_name"
									cssClass="form-control text-box single-line"/>
								<form:errors path="role_name"
									cssClass="field-validation-valid text-danger" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label" for="permissions">permissions</label>
							<div>
								<form:input path="permissions"
									cssClass="form-control text-box single-line" />
								<form:errors path="permissions"
									cssClass="field-validation-valid text-danger" />
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="option">Lựa chọn (Gán quyền hoặc thu hồi)</label>
							<div>
								Gán quyền: <input type="radio" id="option1" name="option" value="grant" checked><br/>
								Thu hồi quyền: <input type="radio" id="option2" name="option" value="revoke">
								<form:errors path="option"
									cssClass="field-validation-valid text-danger" />
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-2 col-md-10">
								<input type="submit" value="Gán quyền / Thu hồi" class="btn btn-warning">
							</div>
						</div>
					</div>
				</form:form>
				
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_roles"></c:url>">Quay về danh
			sách</a>
	</div>
</div>

<script type="text/javascript">
	function displaySystemPrivilege(itemIndex){
		var systemPrivilege = document.getElementById("systemPrivilegeItem" + itemIndex).innerText;
		document.getElementById("permissions").value = systemPrivilege;
	}
	
	function displayObjectPrivilege(itemIndex){
		var systemPrivilege = document.getElementById("objectPrivilegeItem" + itemIndex).innerText;
		document.getElementById("permissions").value = systemPrivilege;
	}
</script>