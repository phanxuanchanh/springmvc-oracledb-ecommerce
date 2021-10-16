<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Xóa Profile</h1>
	<div class="row">
		<div class="col">
			<a href="<c:url value="/he-thong/tao-moi-profile"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Tạo mới
			</a>
			<a href="<c:url value="/he-thong/chinh-sua-profile"></c:url>"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Chỉnh sửa
			</a>
			<a href="#"
				class="btn btn-sm btn-primary shadow-sm">
				<i class="fas fa-download fa-sm text-white-50"></i> Xóa
			</a>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
			<div class="card bg-danger text-white shadow">
				<div class="card-body">
					Cần cẩn thận khi xóa profile, việc xóa nhầm có thể gây ra lỗi nghiêm trọng đối với CSDL.
					<div><a class="text-white-50 small" href="#">Thông báo quan trọng</a></div>
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
					<div><a class="text-white-50 small" href="<c:url value="/he-thong/xoa-profile"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Xóa Profile</h6>
	</div>
	<div class="card-body">
		<c:url var="post_url" value="/he-thong/xoa-profile"></c:url>
		<form:form method="POST" action="${ post_url }"
			modelAttribute="profileInput2">
			<div class="form-horizontal">

				<div class="form-group">
					<label class="control-label" for="name">Tên profile</label>
					<div>
						<form:input path="profile_name"
							cssClass="form-control text-box single-line" />
							<form:errors path="profile_name" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<input type="submit" value="Xóa" class="btn btn-success">
					</div>
				</div>
			</div>
		</form:form>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_profiles"></c:url>">Quay về danh
			sách</a>
	</div>
</div>