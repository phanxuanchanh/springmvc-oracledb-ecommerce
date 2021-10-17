<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Tạo mới Policy</h1>
</div>

<div class="row">
	<div class="col-lg-12 mb-4">
		<c:if test="${ state != null }">
			<div class="card bg-secondary text-white shadow">
				<div class="card-body">
					${ state }
					<div><a class="text-white-50 small" href="<c:url value="/he-thong/tao-moi-audit-policy"></c:url>">Tắt thông báo này</a></div>
				</div>
			</div>
		</c:if>
	</div>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Tạo mới Policy</h6>
	</div>
	<div class="card-body">
		<c:url var="post_url" value="/he-thong/tao-moi-audit-policy"></c:url>
		<form:form method="POST" action="${ post_url }"
			modelAttribute="auditPolicyInput">
			<div class="form-horizontal">

				<div class="form-group">
					<label class="control-label" for="object_schema">object_schema</label>
					<div>
						<form:input path="object_schema"
							cssClass="form-control text-box single-line" />
							<form:errors path="object_schema" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="object_name">object_name</label>
					<div>
						<form:input path="object_name"
							cssClass="form-control text-box single-line" />
							<form:errors path="object_name" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label" for="policy_name">policy_name</label>
					<div>
						<form:input path="policy_name"
							cssClass="form-control text-box single-line" />
							<form:errors path="policy_name" cssClass="field-validation-valid text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label" for="statement_types">statement_types</label>
					<div>
						<form:input path="statement_types"
							cssClass="form-control text-box single-line" />
							<form:errors path="statement_types" cssClass="field-validation-valid text-danger"/>
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
			href="<c:url value="/he-thong/dba_audit_policies"></c:url>">Quay về danh
			sách</a>
	</div>
</div>