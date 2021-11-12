<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Các chức năng hóa đơn chung</h1>
</div>
<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Các chức năng hóa đơn chung</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<c:url var="post_url" value="/quan-tri/cac-chuc-nang-hoa-don-chung"></c:url>
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">Cập nhật tất cả đơn giá và thành tiền</th>
							<td> 
								<form:form method="POST" action="${ post_url }">
									<input type="hidden" name="option" value="updateAllUnitPriceAndIntoPrice" />
									<button type="submit" class="btn btn-warning">Thực hiện</button>
								</form:form>			
							</td>
						</tr>
						<tr>
							<th style="width: 25%;">Cập nhật tất cả tổng tiền</th>
							<td>
								<form:form method="POST" action="${ post_url }">
									<input type="hidden" name="option" value="updateAllTotalMoney" />
									<button type="submit" class="btn btn-warning">Thực hiện</button>
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
			href="<c:url value="/quan-tri/danh-sach-hoa-don"></c:url>">Quay về danh
			sách</a>
	</div>
</div>