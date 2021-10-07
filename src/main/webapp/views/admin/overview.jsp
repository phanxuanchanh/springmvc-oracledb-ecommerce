<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Trang tổng quan</h1>
	<a class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<!-- Content Row -->
<div class="row">

	<div class="col-xl-3 col-md-6 mb-4">
		<div class="card border-left-primary shadow h-100 py-2">
			<div class="card-body">
				<div class="row no-gutters align-items-center">
					<div class="col mr-2">
						<div
							class="text-xs font-weight-bold text-primary text-uppercase mb-1">Số
							lượng sản phẩm</div>
						<div class="h5 mb-0 font-weight-bold text-gray-800">${ analyst.productNumber }</div>
					</div>
					<div class="col-auto">
						<i class="fas fa-book fa-2x text-gray-300"></i>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="col-xl-3 col-md-6 mb-4">
		<div class="card border-left-success shadow h-100 py-2">
			<div class="card-body">
				<div class="row no-gutters align-items-center">
					<div class="col mr-2">
						<div
							class="text-xs font-weight-bold text-success text-uppercase mb-1">Số
							lượng thể loại</div>
						<div class="h5 mb-0 font-weight-bold text-gray-800">${ analyst.productCategoryNumber }</div>
					</div>
					<div class="col-auto">
						<i class="fas fa-list fa-2x text-gray-300"></i>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="col-xl-3 col-md-6 mb-4">
		<div class="card border-left-warning shadow h-100 py-2">
			<div class="card-body">
				<div class="row no-gutters align-items-center">
					<div class="col mr-2">
						<div
							class="text-xs font-weight-bold text-warning text-uppercase mb-1">Số
							lượng nhà cung cấp</div>
						<div class="h5 mb-0 font-weight-bold text-gray-800">${ analyst.supplierNumber }</div>
					</div>
					<div class="col-auto">
						<i class="fas fa-list fa-2x text-gray-300"></i>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="col-xl-3 col-md-6 mb-4">
		<div class="card border-left-warning shadow h-100 py-2">
			<div class="card-body">
				<div class="row no-gutters align-items-center">
					<div class="col mr-2">
						<div
							class="text-xs font-weight-bold text-warning text-uppercase mb-1">Số
							lượng khách hàng</div>
						<div class="h5 mb-0 font-weight-bold text-gray-800">${ analyst.customerNumber }</div>
					</div>
					<div class="col-auto">
						<i class="fas fa-users fa-2x text-gray-300"></i>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


