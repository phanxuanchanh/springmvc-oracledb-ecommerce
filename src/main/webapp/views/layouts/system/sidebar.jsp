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
		href="<c:url value="/he-thong/v$instance"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>V$INSTANCE</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/v$database"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>V$DATABASE</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/v$process"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>V$PROCESS</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/v$session"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>V$SESSION</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/dba_tables"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_TABLES</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/dba_data_files"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_DATA_FILES</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/dba_tablespaces"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_TABLESPACES</span>
	</a></li>
	
	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/he-thong/dba_audit_policies"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_AUDIT_POLICIES</span>
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
		href="<c:url value="/he-thong/dba_roles"></c:url>"> <i
			class="fas fa-fw fa-book"></i> <span>DBA_ROLES</span>
	</a></li>

	<!-- Nav Item - Book -->
	<li class="nav-item"><a class="nav-link"
		href="<c:url value="/quan-tri/tong-quan"></c:url>"> <i class="fas fa-fw fa-book"></i>
			<span>Quản trị TMDT</span>
	</a></li>

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">

	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>