<div class="task">
    <h4>${ task.summary }</h4>
    <div><prince:textToParagraphs>${ task.details }</prince:textToParagraphs></div>
    <div class="due">Due: <prince:deadline date="${ task.deadline }"/></div>
    <div class="created">Created: <prince:shortDate date="${ task.dateCreated }"/></div>
</div>


<%--<div class="task">
    <h4>${ task.summary }</h4>
    <p>${ task.details }</p>
    <div class="due">Due: <g:formatDate date="${task.deadline }"/></div>
    <div class="created">Created: <g:formatDate date="${task.dateCreated }"/></div>
</div>
--%>

<%--<div class="task">
    <h4>${ task.summary }</h4>
    <p>${ task.details }</p>
    <div class="due">Due: <prince:shortDate date="${task.deadline }"/></div>
    <div class="created">Created: <prince:shortDate date="${task.dateCreated }"/></div>
</div>--%>