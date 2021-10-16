<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các process tương ứng với các session đang đăng nhập</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các process tương ứng với các session đang đăng nhập</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">saddr</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">serial#</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">username</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">program</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">paddr</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">sosid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">spid</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">pname</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">saddr</th>
									<th rowspan="1" colspan="1">sid</th>
									<th rowspan="1" colspan="1">serial#</th>
									<th rowspan="1" colspan="1">username</th>
									<th rowspan="1" colspan="1">program</th>
									<th rowspan="1" colspan="1">paddr</th>
									<th rowspan="1" colspan="1">pid</th>
									<th rowspan="1" colspan="1">sosid</th>
									<th rowspan="1" colspan="1">spid</th>
									<th rowspan="1" colspan="1">pname</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ processVsSessions }">
									<tr role="row">
										<td><a href="<c:url value="/he-thong/chi-tiet-session/${ item.saddr }"></c:url>">${ item.saddr }</a></td>
										<td>${ item.sid }</td>
										<td>${ item.serial }</td>
										<td>${ item.username }</td>
										<td>${ item.program }</td>
										<td><a href="<c:url value="/he-thong/chi-tiet-process/${ item.paddr }"></c:url>">${ item.paddr }</a></td>
										<td>${ item.pid }</td>
										<td>${ item.sosid }</td>
										<td>${ item.spid }</td>
										<td>${ item.pname }</td>
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