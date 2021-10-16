<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các Tables theo User</h1>
	<div class="row">
		<div class="col">
			<c:url var="post_url" value="/he-thong/danh-sach-table-theo-user"></c:url> 
			<form:form method="GET" action="${ post_url }">
				<input type="text" name="owner" class="form-control bg-light border-0 small" style="border: 1px solid !important;"
					placeholder="Tìm kiếm..." aria-label="Search" aria-describedby="basic-addon2">
			</form:form>
		</div>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các Tables</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">table_name</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">tablespace_name</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">table_name</th>
									<th rowspan="1" colspan="1">tablespace_name</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ tables_byOwner }">
									<tr role="row">
										<td><a href="<c:url value="/he-thong/chi-tiet-table/${ item.table_name }"></c:url>">${ item.table_name }</a></td>
										<td>${ item.tablespace_name }</td>
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