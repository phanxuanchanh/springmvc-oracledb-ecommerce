<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="<c:url value="/"></c:url>">
		<div class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-laugh-wink"></i>
		</div>
		<div class="sidebar-brand-text mx-3">
			Hệ thống <sup>2</sup>
		</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<li class="nav-item active"><a class="nav-link" href="<c:url value="/quan-tri/tong-quan"></c:url>">
			<i class="fas fa-fw fa-tachometer-alt"></i> <span>Trang tổng
				quan</span>
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider">

	<!-- Heading -->
	<div class="sidebar-heading">Các chức năng quản lý</div>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/v$sga"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>V$SGA</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="#"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>PGA</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/v$process"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>V$PROCESS</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/quan-tri/danh-sach-trang-thai-hoa-don"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>Quản lý TT hóa đơn</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/quan-tri/danh-sach-phuong-thuc-thanh-toan"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>Quản lý PT thanh toán</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/dba_users"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_USERS</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/dba_profiles"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_PROFILES</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/quan-tri/danh-sach-nguoi-dung"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>Quản lý người dùng</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/quan-tri/danh-sach-nguoi-quan-tri"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>Quản lý người quản trị</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/quan-tri-he-thong/co-so-du-lieu"></c:url>"> <i class="fas fa-fw fa-book"></i>
			<span>Quản lý hệ thống</span>
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>