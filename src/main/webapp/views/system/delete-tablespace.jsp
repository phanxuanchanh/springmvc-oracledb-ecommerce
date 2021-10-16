<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Xóa tablespace</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Xóa tablespace: "${ tablespaceName }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
			<c:url var="post_url" value="/he-thong/xoa-tablespace/${ tablespaceName }"></c:url> 
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">Không xóa datafile</th>
							<td>
								<form:form method="GET" action="${ post_url }">
									<input type="hidden" name="option" value="not-delete-datafile" />
									<input type="submit" value="Thực hiện" class="btn btn-danger">
								</form:form>
							</td>
						</tr>
						<tr>
							<th style="width: 25%;">Xóa datafile</th>
							<td>
								<form:form method="GET" action="${ post_url }">
									<input type="hidden" name="option" value="delete-datafile" />
									<input type="submit" value="Thực hiện" class="btn btn-danger">
								</form:form>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_tablespaces"></c:url>">Quay về danh sách</a>
	</div>
</div>