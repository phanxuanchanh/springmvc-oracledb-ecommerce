<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chỉnh sửa Role</h1>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div><a class="text-white-50 small" href="<c:url value="/he-thong/chinh-sua-role/${ roleInput.role_name }"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chỉnh sửa Role</h6>
	</div>
	<div class="card-body">
		<c:url var="post_url" value="/he-thong/chinh-sua-role/${ roleInput.role_name }"></c:url>
		<form:form method="POST" action="${ post_url }"
			modelAttribute="roleInput">
			<div class="form-horizontal">

				<div class="form-group">
					<label class="control-label" for="role_name">role_name</label>
					<div>
						<form:input path="role_name"
							cssClass="form-control text-box single-line" />
							<form:errors path="role_name" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="password">password</label>
					<div>
						<form:input path="password"
							cssClass="form-control text-box single-line" />
							<form:errors path="password" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<input type="submit" value="Chỉnh sửa" class="btn btn-success">
					</div>
				</div>
			</div>
		</form:form>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_roles"></c:url>">Quay về danh
			sách</a>
	</div>
</div>