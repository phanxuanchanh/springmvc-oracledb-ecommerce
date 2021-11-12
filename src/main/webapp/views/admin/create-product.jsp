<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Tạo mới sản phẩm</h1>
	<a href="#"
		class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
		<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
	</a>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div><a class="text-white-50 small" href="<c:url value="/quan-tri/tao-moi-san-pham"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Tạo mới sản phẩm</h6>
	</div>
	<div class="card-body">
		<c:url var="post_url" value="/quan-tri/tao-moi-san-pham"></c:url>
		<form:form method="POST" action="${ post_url }"
			modelAttribute="product">
			<div class="form-horizontal">

				<div class="form-group">
					<label class="control-label" for="name">Tên sản phẩm</label>
					<div>
						<form:input path="name"
							cssClass="form-control text-box single-line" />
							<form:errors path="name" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label" for="description">Mô tả sản phẩm</label>
					<div>
						<form:textarea path="description" cssClass="form-control" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="price">Giá</label>
					<div>
						<form:input path="price"
							cssClass="form-control text-box single-line" />
							<form:errors path="price" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="discount">Giảm giá</label>
					<div>
						<form:input path="discount"
							cssClass="form-control text-box single-line" />
							<form:errors path="discount" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="quanty">Số lượng</label>
					<div>
						<form:input path="quanty"
							cssClass="form-control text-box single-line" />
							<form:errors path="quanty" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="productCategoryId">Chọn danh mục (thể loại)</label>
					<div>
						<form:select path="productCategoryId" cssClass="form-control">
							<form:options items="${ productCategories }" itemValue="ID" itemLabel="name"></form:options>							
						</form:select>
							<form:errors path="productCategoryId" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="productStateId">Chọn trạng thái sản phẩm</label>
					<div>
						<form:select path="productStateId" cssClass="form-control">
							<form:options items="${ productStates }" itemValue="ID" itemLabel="name"></form:options>							
						</form:select>
							<form:errors path="productStateId" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="supplierId">Chọn nhà cung cấp</label>
					<div>
						<form:select path="supplierId" cssClass="form-control">
							<form:options items="${ suppliers }" itemValue="ID" itemLabel="name"></form:options>							
						</form:select>
							<form:errors path="supplierId" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<input type="submit" value="Tạo mới" class="btn btn-success">
					</div>
				</div>
			</div>
		</form:form>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/quan-tri/danh-sach-san-pham"></c:url>">Quay về danh
			sách</a>
	</div>
</div>