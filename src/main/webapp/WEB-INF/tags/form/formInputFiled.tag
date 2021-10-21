<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ attribute name="id" required="true" rtexprvalue="true" %>
<%@ attribute name="path" required="true" rtexprvalue="true" %>
<%@ attribute name="label" required="true" rtexprvalue="true" %>
<%@ attribute name="value" required="true" rtexprvalue="true" %>
<%@ attribute name="parentDivClass" required="true" rtexprvalue="true" %>
<%@ attribute name="divClass" required="true" rtexprvalue="true" %>
<%@ attribute name="inputClass" required="true" rtexprvalue="true" %>
<div class="${parentDivClass}">
	<label for="${id}">${label}</label>
    <div class="${divClass}">
        <form:input path="${path}" class="${inputClass}" id="${id}" value="${value}" />
    </div>
</div>