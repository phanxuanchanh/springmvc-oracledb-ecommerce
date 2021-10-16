<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách các session (v$session)</h1>
	<div class="row">
		<div class="col">
			<a href="<c:url value="/he-thong/cac-process-ung-voi-session-dang-dang-nhap"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xem process tương ứng với các session đang đăng nhập
			</a>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
			<div class="card bg-danger text-white shadow">
				<div class="card-body">
					Cảnh báo: Cần cẩn thận trong việc hủy các session, việc hủy có thể dẫn đến những sự cố không mong muốn
					<div>
						<a class="text-white-50 small"
							href="#">Thông báo quan trọng</a>
					</div>
				</div>
			</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div>
						<a class="text-white-50 small"
							href="<c:url value="/he-thong/v$session"></c:url>">Tắt thông
							báo này</a>
					</div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách các session (v$session)</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">process</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">paddr</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">type</th>
									<th>Công cụ</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">saddr</th>
									<th rowspan="1" colspan="1">sid</th>
									<th rowspan="1" colspan="1">serial#</th>
									<th rowspan="1" colspan="1">username</th>
									<th rowspan="1" colspan="1">program</th>
									<th rowspan="1" colspan="1">process</th>
									<th rowspan="1" colspan="1">type</th>
									<th rowspan="1" colspan="1">paddr</th>
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ sessions }">
									<tr role="row">
										<td>${ item.saddr }</td>
										<td>${ item.sid }</td>
										<td>${ item.serial }</td>
										<td>${ item.username }</td>
										<td>${ item.program }</td>
										<td>${ item.process }</td>
										<td><a href="<c:url value="/he-thong/chi-tiet-process/${ item.paddr }"></c:url>">${ item.paddr }</a></td>
										<td>${ item.type }</td>
										<td>
											<c:url var="post_url" value="/he-thong/huy-session"></c:url> 
											<form:form id="deleteSession${ item.sid }_${ item.serial }" method="POST" action="${ post_url }">
												<input type="hidden" name="sid" value="${ item.sid }" />
												<input type="hidden" name="serial" value="${ item.serial }" />
											</form:form>
											<a class="btn btn-primary" href="<c:url value="/he-thong/chi-tiet-session/${ item.saddr }"></c:url>">Chi tiết</a> | 
											<button type="submit" class="btn btn-danger" form="deleteSession${ item.sid }_${ item.serial }">Hủy session</button>
										</td>
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