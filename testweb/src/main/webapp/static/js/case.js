$(document).ready(function(){
	caseInit();
});

function caseInit() {
    $.ajax({
        type: 'GET',
        url: '/testweb/case/getCases.do',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        success: function(data) {
            alert(data.caseList[0].name);
        },
        complete: function() {

        },
        error:function(err) {

        }
    });
}