<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Danh sách sản phẩm</h1>
	<div class="row">
		<div class="col">
			<a href="<c:url value="/quan-tri/xuat-danh-sach-hoa-don-xlsx"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xuất XLSX
			</a>
			<a href="<c:url value="/quan-tri/xuat-danh-sach-hoa-don-csv"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xuất CSV
			</a>
			<a href="<c:url value="/quan-tri/cac-chuc-nang-hoa-don-chung"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Chức năng chung cho hóa đơn
			</a>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div><a class="text-white-50 small" href="<c:url value="/quan-tri/danh-sach-hoa-don"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Danh sách hóa đơn</h6>
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
										rowspan="1" colspan="1" aria-sort="ascending">ID hóa đơn</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">ID khách hàng</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">Ngày đặt hàng</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">Ngày giao hàng</th>
									<th class="sorting" tabindex="0" aria-controls="dataTable"
										rowspan="1" colspan="1" aria-sort="ascending">Tổng tiền</th>
									<th>Công cụ</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th rowspan="1" colspan="1">ID hóa đơn</th>
									<th rowspan="1" colspan="1">ID khách hàng</th>
									<th rowspan="1" colspan="1">Ngày đặt hàng</th>
									<th rowspan="1" colspan="1">Ngày giao hàng</th>
									<th rowspan="1" colspan="1">Tổng tiền</th>
									<th rowspan="1" colspan="1">Công cụ</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="item" items="${ invoices }">
									<tr role="row">
										<td>${ item.ID }</td>
										<td>${ item.customerId }</td>
										<td>${ item.orderDate }</td>
										<td>${ item.shipedDate }</td>
										<td>${ item.totalMoney }</td>
										<td>
											<c:url var="post_url" value="/quan-tri/xoa-hoa-don"></c:url> 
											<form:form id="deleteInvoice${ item.ID }" method="POST" action="${ post_url }">
												<input type="hidden" name="id" value="${ item.ID }" />
											</form:form> 
											<a class="btn btn-primary" href="<c:url value="/quan-tri/chi-tiet-hoa-don/${ item.ID }"></c:url>">Xem chi tiết</a> | 
											<button type="submit" class="btn btn-danger" form="deleteInvoice${ item.ID }">Xóa</button>
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