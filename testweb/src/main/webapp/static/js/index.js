$(document).ready(function(){
    indexInit();
});

function indexInit() {
    $.ajax({
        type: 'GET',
        url: '/testweb/page/getPageList.do?pageName=homepage',
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        success: function(data) {
            alert(data.pageList[0].path);
        },
        complete: function() {

        },
        error:function(err) {

        }
    });
}
