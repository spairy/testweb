$(document).ready(function(){
    indexInit();
});

function indexInit() {
    $.ajax({
        type: 'GET',
        url: '/testweb/service/getService.do?serviceName=name1',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        success: function(data) {
            
        },
        complete: function() {

        },
        error:function(err) {

        }
    });
}
