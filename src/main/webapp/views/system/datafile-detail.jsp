<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết Datafile</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết Datafile: "${ datafile.file_name }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">file_name</th>
							<td>${ datafile.file_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">file_id</th>
							<td>${ datafile.file_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">tablespace_name</th>
							<td>${ datafile.tablespace_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">bytes</th>
							<td>${ datafile.bytes }</td>
						</tr>
						<tr>
							<th style="width: 25%;">blocks</th>
							<td>${ datafile.blocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">status</th>
							<td>${ datafile.status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">relative_fno</th>
							<td>${ datafile.relative_fno }</td>
						</tr>
						<tr>
							<th style="width: 25%;">autoextensible</th>
							<td>${ datafile.autoextensible }</td>
						</tr>
						<tr>
							<th style="width: 25%;">maxbytes</th>
							<td>${ datafile.maxbytes }</td>
						</tr>
						<tr>
							<th style="width: 25%;">maxblocks</th>
							<td>${ datafile.maxblocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">increment_by</th>
							<td>${ datafile.increment_by }</td>
						</tr>
						<tr>
							<th style="width: 25%;">user_bytes</th>
							<td>${ datafile.user_bytes }</td>
						</tr>
						<tr>
							<th style="width: 25%;">user_blocks</th>
							<td>${ datafile.user_blocks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">online_status</th>
							<td>${ datafile.online_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">lost_write_protect</th>
							<td>${ datafile.lost_write_protect }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/dba_data_files"></c:url>">Quay về danh sách</a>
	</div>
</div>