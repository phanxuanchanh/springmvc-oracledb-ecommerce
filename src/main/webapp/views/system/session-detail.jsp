<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
	<h1 class="h3 mb-0 text-gray-800">Trang quản trị/Chi tiết Session</h1>
</div>

<div class="card shadow mb-4">
	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">Chi tiết Session: "{ SADDR: ${ session.saddr }; SID: ${ session.sid } }"</h6>
	</div>
	<div class="card-body">
		<div class="table-responsive">
			<div id="dataTable" class="dataTables_wrapper dt-bootstrap4">
				<table class="table table-bordered table table-hover">
					<tbody>
						<tr>
							<th style="width: 25%;">action</th>
							<td>${ session.action }</td>
						</tr>
						<tr>
							<th style="width: 25%;">action_hash</th>
							<td>${ session.action_hash }</td>
						</tr>
						<tr>
							<th style="width: 25%;">audsid</th>
							<td>${ session.audsid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">blocking_instance</th>
							<td>${ session.blocking_instance }</td>
						</tr>
						<tr>
							<th style="width: 25%;">blocking_session</th>
							<td>${ session.blocking_session }</td>
						</tr>
						<tr>
							<th style="width: 25%;">blocking_session_status</th>
							<td>${ session.blocking_session_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">client_identifier</th>
							<td>${ session.client_identifier }</td>
						</tr>
						<tr>
							<th style="width: 25%;">client_info</th>
							<td>${ session.client_info }</td>
						</tr>
						<tr>
							<th style="width: 25%;">command</th>
							<td>${ command }</td>
						</tr>
						<tr>
							<th style="width: 25%;">con_id</th>
							<td>${ session.con_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">creator_addr</th>
							<td>${ session.creator_addr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">creator_serial#</th>
							<td>${ session.creator_serial }</td>
						</tr>
						<tr>
							<th style="width: 25%;">current_queue_duration</th>
							<td>${ session.current_queue_duration }</td>
						</tr>
						<tr>
							<th style="width: 25%;">ecid</th>
							<td>${ session.ecid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">event</th>
							<td>${ session.event }</td>
						</tr>
						<tr>
							<th style="width: 25%;">event#</th>
							<td>${ session.event2 }</td>
						</tr>
						<tr>
							<th style="width: 25%;">external_name</th>
							<td>${ session.external_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">failed_over</th>
							<td>${ session.failed_over }</td>
						</tr>
						<tr>
							<th style="width: 25%;">failover_method</th>
							<td>${ session.failover_method }</td>
						</tr>
						<tr>
							<th style="width: 25%;">failover_type</th>
							<td>${ session.failover_type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">final_blocking_instance</th>
							<td>${ session.final_blocking_instance }</td>
						</tr>
						<tr>
							<th style="width: 25%;">final_blocking_session</th>
							<td>${ session.final_blocking_session }</td>
						</tr>
						<tr>
							<th style="width: 25%;">final_blocking_session_status</th>
							<td>${ session.final_blocking_session_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">fixed_table_sequence</th>
							<td>${ session.fixed_table_sequence }</td>
						</tr>
						<tr>
							<th style="width: 25%;">last_call_et</th>
							<td>${ session.last_call_et }</td>
						</tr>
						<tr>
							<th style="width: 25%;">lockwait</th>
							<td>${ session.lockwait }</td>
						</tr>
						<tr>
							<th style="width: 25%;">logon_time</th>
							<td>${ session.logon_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">machine</th>
							<td>${ session.machine }</td>
						</tr>
						<tr>
							<th style="width: 25%;">module</th>
							<td>${ session.module }</td>
						</tr>
						<tr>
							<th style="width: 25%;">module_hash</th>
							<td>${ session.module_hash }</td>
						</tr>
						<tr>
							<th style="width: 25%;">osuser</th>
							<td>${ session.osuser }</td>
						</tr>
						<tr>
							<th style="width: 25%;">ownerid</th>
							<td>${ session.ownerid }</td>
						</tr>
						<tr>
							<th style="width: 25%;">paddr</th>
							<td>${ session.paddr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pddl_status</th>
							<td>${ session.pddl_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pdml_enabled</th>
							<td>${ session.pdml_enabled }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pdml_status</th>
							<td>${ session.pdml_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pga_tunable_mem</th>
							<td>${ session.pga_tunable_mem }</td>
						</tr>
						<tr>
							<th style="width: 25%;">plsql_debugger_connected</th>
							<td>${ session.plsql_debugger_connected }</td>
						</tr>
						<tr>
							<th style="width: 25%;">plsql_entry_object_id</th>
							<td>${ session.plsql_entry_object_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">plsql_entry_subprogram_id</th>
							<td>${ session.plsql_entry_subprogram_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">plsql_object_id</th>
							<td>${ session.plsql_object_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">plsql_subprogram_id</th>
							<td>${ session.plsql_subprogram_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">port</th>
							<td>${ session.port }</td>
						</tr>
						<tr>
							<th style="width: 25%;">pq_status</th>
							<td>${ session.pq_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prev_child_number</th>
							<td>${ session.prev_child_number }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prev_exec_id</th>
							<td>${ session.prev_exec_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prev_exec_start</th>
							<td>${ session.prev_exec_start }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prev_hash_value</th>
							<td>${ session.prev_hash_value }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prev_sql_addr</th>
							<td>${ session.prev_sql_addr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">prev_sql_id</th>
							<td>${ session.prev_sql_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">process</th>
							<td>${ session.process }</td>
						</tr>
						<tr>
							<th style="width: 25%;">program</th>
							<td>${ session.program }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p1</th>
							<td>${ session.p1 }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p1raw</th>
							<td>${ session.p1raw }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p1text</th>
							<td>${ session.p1text }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p2</th>
							<td>${ session.p2 }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p2raw</th>
							<td>${ session.p2raw }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p2text</th>
							<td>${ session.p2text }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p3</th>
							<td>${ session.p3 }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p3raw</th>
							<td>${ session.p3raw }</td>
						</tr>
						<tr>
							<th style="width: 25%;">p3text</th>
							<td>${ session.p3text }</td>
						</tr>
						<tr>
							<th style="width: 25%;">resource_consumer_group</th>
							<td>${ session.resource_consumer_group }</td>
						</tr>
						<tr>
							<th style="width: 25%;">row_wait_block#</th>
							<td>${ session.row_wait_block }</td>
						</tr>
						<tr>
							<th style="width: 25%;">row_wait_file#</th>
							<td>${ session.row_wait_file }</td>
						</tr>
						<tr>
							<th style="width: 25%;">row_wait_obj#</th>
							<td>${ session.row_wait_obj }</td>
						</tr>
						<tr>
							<th style="width: 25%;">row_wait_row#</th>
							<td>${ session.row_wait_row }</td>
						</tr>
						<tr>
							<th style="width: 25%;">saddr</th>
							<td>${ session.saddr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">schema#</th>
							<td>${ session.schema }</td>
						</tr>
						<tr>
							<th style="width: 25%;">schemaname</th>
							<td>${ session.schemaname }</td>
						</tr>
						<tr>
							<th style="width: 25%;">seconds_in_wait</th>
							<td>${ session.seconds_in_wait }</td>
						</tr>
						<tr>
							<th style="width: 25%;">seq#</th>
							<td>${ session.seq }</td>
						</tr>
						<tr>
							<th style="width: 25%;">serial#</th>
							<td>${ session.serial }</td>
						</tr>
						<tr>
							<th style="width: 25%;">server</th>
							<td>${ session.server }</td>
						</tr>
						<tr>
							<th style="width: 25%;">service_name</th>
							<td>${ session.service_name }</td>
						</tr>
						<tr>
							<th style="width: 25%;">session_edition_id</th>
							<td>${ session.session_edition_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">shard_ddl_status</th>
							<td>${ session.shard_ddl_status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sid</th>
							<td>${ session.sid}</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_address</th>
							<td>${ session.sql_address }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_child_number</th>
							<td>${ session.sql_child_number }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_exec_id</th>
							<td>${ session.sql_exec_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_exec_start</th>
							<td>${ session.sql_exec_start }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_hash_value</th>
							<td>${ session.sql_hash_value }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_id</th>
							<td>${ session.sql_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_trace</th>
							<td>${ session.sql_trace }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_trace_binds</th>
							<td>${ session.sql_trace_binds }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_trace_plan_stats</th>
							<td>${ session.sql_trace_plan_stats }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_trace_waits</th>
							<td>${ session.sql_trace_waits }</td>
						</tr>
						<tr>
							<th style="width: 25%;">sql_translation_profile_id</th>
							<td>${ session.sql_translation_profile_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">state</th>
							<td>${ session.state }</td>
						</tr>
						<tr>
							<th style="width: 25%;">status</th>
							<td>${ session.status }</td>
						</tr>
						<tr>
							<th style="width: 25%;">taddr</th>
							<td>${ session.taddr }</td>
						</tr>
						<tr>
							<th style="width: 25%;">terminal</th>
							<td>${ session.terminal }</td>
						</tr>
						<tr>
							<th style="width: 25%;">time_remaining_micro</th>
							<td>${ session.time_remaining_micro }</td>
						</tr>
						<tr>
							<th style="width: 25%;">time_since_last_wait_micro</th>
							<td>${ session.time_since_last_wait_micro }</td>
						</tr>
						<tr>
							<th style="width: 25%;">top_level_call#</th>
							<td>${ session.top_level_call }</td>
						</tr>
						<tr>
							<th style="width: 25%;">type</th>
							<td>${ session.type }</td>
						</tr>
						<tr>
							<th style="width: 25%;">user#</th>
							<td>${ session.user }</td>
						</tr>
						<tr>
							<th style="width: 25%;">username</th>
							<td>${ session.username }</td>
						</tr>
						<tr>
							<th style="width: 25%;">wait_class</th>
							<td>${ session.wait_class }</td>
						</tr>
						<tr>
							<th style="width: 25%;">wait_class#</th>
							<td>${ session.wait_class2 }</td>
						</tr>
						<tr>
							<th style="width: 25%;">wait_class_id</th>
							<td>${ session.wait_class_id }</td>
						</tr>
						<tr>
							<th style="width: 25%;">wait_time</th>
							<td>${ session.wait_time }</td>
						</tr>
						<tr>
							<th style="width: 25%;">wait_time_micro</th>
							<td>${ session.wait_time_micro }</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="card-footer">
		<a class="btn btn-primary"
			href="<c:url value="/he-thong/v$session"></c:url>">Quay về danh sách</a>
	</div>
</div>