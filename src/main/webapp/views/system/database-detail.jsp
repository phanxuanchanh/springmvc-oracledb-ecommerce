<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết Database</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết Database: "${ database.name }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">dbid</th>
							<td>${ database.dbid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">name</th>
							<td>${ database.name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">created</th>
							<td>${ database.created }</td>
						</tr>
						<tr>
							<th style="width: 25%;">resetlogs_change#</th>
							<td>${ database.resetlogs_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">resetlogs_time</th>
							<td>${ database.resetlogs_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prior_resetlogs_change#</th>
							<td>${ database.prior_resetlogs_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prior_resetlogs_time</th>
							<td>${ database.prior_resetlogs_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">log_mode</th>
							<td>${ database.log_mode }</td>
						</tr>
						<tr>
							<th style="width: 25%;">checkpoint_change#</th>
							<td>${ checkpoint_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">archive_change#</th>
							<td>${ database.archive_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">controlfile_type</th>
							<td>${ database.controlfile_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">controlfile_created</th>
							<td>${ database.controlfile_created }</td>
						</tr>
						<tr>
							<th style="width: 25%;">controlfile_sequence#</th>
							<td>${ database.controlfile_sequence }</td>
						</tr>
						<tr>
							<th style="width: 25%;">controlfile_change#</th>
							<td>${ database.controlfile_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">controlfile_time</th>
							<td>${ database.controlfile_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">open_resetlogs</th>
							<td>${ database.open_resetlogs }</td>
						</tr>
						<tr>
							<th style="width: 25%;">version_time</th>
							<td>${ database.version_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">open_mode</th>
							<td>${ database.open_mode }</td>
						</tr>
						<tr>
							<th style="width: 25%;">protection_mode</th>
							<td>${ database.protection_mode }</td>
						</tr>
						<tr>
							<th style="width: 25%;">protection_level</th>
							<td>${ database.protection_level }</td>
						</tr>
						<tr>
							<th style="width: 25%;">remote_archive</th>
							<td>${ database.remote_archive }</td>
						</tr>
						<tr>
							<th style="width: 25%;">activation#</th>
							<td>${ database.activation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">switchover#</th>
							<td>${ database.switchover }</td>
						</tr>
						<tr>
							<th style="width: 25%;">database_role</th>
							<td>${ database.database_role }</td>
						</tr>
						<tr>
							<th style="width: 25%;">archivelog_change#</th>
							<td>${ database.archivelog_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">archivelog_compression</th>
							<td>${ database.archivelog_compression }</td>
						</tr>
						<tr>
							<th style="width: 25%;">switchover_status</th>
							<td>${ database.switchover_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">dataguard_broker</th>
							<td>${ database.dataguard_broker }</td>
						</tr>
						<tr>
							<th style="width: 25%;">guard_status</th>
							<td>${ database.guard_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_min</th>
							<td>${ database.supplemental_log_data_min}</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_pk</th>
							<td>${ database.supplemental_log_data_pk }</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_ui</th>
							<td>${ database.supplemental_log_data_ui }</td>
						</tr>
						<tr>
							<th style="width: 25%;">force_logging</th>
							<td>${ database.force_logging }</td>
						</tr>
						<tr>
							<th style="width: 25%;">platform_id</th>
							<td>${ database.platform_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">platform_name</th>
							<td>${ database.platform_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">recovery_target_incarnation#</th>
							<td>${ database.recovery_target_incarnation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">last_open_incarnation#</th>
							<td>${ database.last_open_incarnation }</td>
						</tr>
						<tr>
							<th style="width: 25%;">current_scn</th>
							<td>${ database.current_scn }</td>
						</tr>
						<tr>
							<th style="width: 25%;">flashback_on</th>
							<td>${ database.flashback_on }</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_fk</th>
							<td>${ database.supplemental_log_data_fk }</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_all</th>
							<td>${ database.supplemental_log_data_all }</td>
						</tr>
						<tr>
							<th style="width: 25%;">db_unique_name</th>
							<td>${ database.db_unique_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">standby_became_primary_scn</th>
							<td>${ database.standby_became_primary_scn }</td>
						</tr>
						<tr>
							<th style="width: 25%;">fs_failover_mode</th>
							<td>${ database.fs_failover_mode }</td>
						</tr>
						<tr>
							<th style="width: 25%;">fs_failover_status</th>
							<td>${ database.fs_failover_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">fs_failover_current_target</th>
							<td>${ database.fs_failover_current_target }</td>
						</tr>
						<tr>
							<th style="width: 25%;">fs_failover_observer_present</th>
							<td>${ database.fs_failover_observer_present }</td>
						</tr>
						<tr>
							<th style="width: 25%;">fs_failover_observer_host</th>
							<td>${ database.fs_failover_observer_host }</td>
						</tr>
						<tr>
							<th style="width: 25%;">controlfile_converted</th>
							<td>${ database.controlfile_converted }</td>
						</tr>
						<tr>
							<th style="width: 25%;">primary_db_unique_name</th>
							<td>${ database.primary_db_unique_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_pl</th>
							<td>${ database.supplemental_log_data_pl }</td>
						</tr>
						<tr>
							<th style="width: 25%;">min_required_capture_change#</th>
							<td>${ database.min_required_capture_change }</td>
						</tr>
						<tr>
							<th style="width: 25%;">cdb</th>
							<td>${ database.cdb }</td>
						</tr>
						<tr>
							<th style="width: 25%;">con_id</th>
							<td>${ database.con_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pending_role_change_tasks</th>
							<td>${ database.pending_role_change_tasks }</td>
						</tr>
						<tr>
							<th style="width: 25%;">con_dbid</th>
							<td>${ database.con_dbid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">force_full_db_caching</th>
							<td>${ database.force_full_db_caching }</td>
						</tr>
						<tr>
							<th style="width: 25%;">supplemental_log_data_sr</th>
							<td>${ database.supplemental_log_data_sr }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/v$database"></c:url>">Quay về danh sách</a>
	</div>
</div>