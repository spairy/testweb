$(document).ready(function(){
    serviceInit();
   
});

function serviceInit() {
    $.ajax({
        type: 'GET',
        url: '/controller/auth/getSession.do',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        success: function(data) {
            if (isEmpty(data.errors)) {
            	window.location.href='index.html';
            } else if (data.errors[0].errorCode != "ERR_SYS_002") {
            	$('.am-hide').addClass("am-block");
            	$('.am-hide').removeClass("am-hide");
            }
        },
        complete: function() {

        },
        error:function(err) {

        }
    });
}
