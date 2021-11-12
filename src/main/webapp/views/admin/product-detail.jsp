<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết sản phẩm</h1>
	<a href="<c:url value="/quan-tri/tao-moi-san-pham"></c:url>"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết sản phẩm "${ product.name }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">ID sản phẩm</th>
							<td>${ product.ID }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Tên sản phẩm</th>
							<td>${ product.name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Mô tả sản phẩm</th>
							<td>${ product.description }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Giá</th>
							<td>${ product.price }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Giảm giá</th>
							<td>${ product.discount }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Số lượng</th>
							<td>${ product.quanty }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Thể loại</th>
							<td>${ productCategory.name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Trạng thái</th>
							<td>${ productState.name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Nhà cung cấp</th>
							<td>${ supplier.name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Ngày tạo</th>
							<td>${ product.createAt }</td>
						</tr>
						<tr>
							<th style="width: 25%;">Ngày cập nhật</th>
							<td>${ product.updateAt }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/quan-tri/danh-sach-san-pham"></c:url>">Quay về danh
			sách</a> | <a
			class="btn btn-success"
			href="<c:url value="/quan-tri/chinh-sua-san-pham/${ product.ID }"></c:url>">Chỉnh sửa</a>
	</div>
</div>