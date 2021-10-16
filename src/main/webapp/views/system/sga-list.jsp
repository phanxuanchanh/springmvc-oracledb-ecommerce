<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Thông tin SGA (v$sga)</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Thông tin SGA (v$sga)</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">Name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">Value</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">Con_ID</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">Name</th>
									<th rowspan="1" colspan="1">Value</th>
									<th rowspan="1" colspan="1">Con_ID</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ v$sga }">
									<tr role="row">
										<td>${ item.name }</td>
										<td>${ item.value }</td>
										<td>${ item.con_id }</td>
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