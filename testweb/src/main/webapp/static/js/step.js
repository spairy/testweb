$(document).ready(function(){
    stepInit();
    
});

function stepInit() {
	var thisURL = document.URL;    
	var pageID = thisURL.split('?')[1];
    $.ajax({
        type: 'GET',
        url: '/testweb/step/getSteps.do?pageID=' + pageID,
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        success: function(data) {
            var pageList = data.pageList;
            var tr;
            for(var i=0; i < pageList.length; i++) {
            	tr = $('.tr-hide').clone(true, true);
                tr.removeClass('tr-hide');
            	tr.removeClass('am-hide');
            	tr.find('.td-id').html(pageList[i].id);
            	tr.find('.td-name').html(pageList[i].name);
            	tr.find('.td-path').html(pageList[i].path);
            	tr.appendTo('.page-tbody');
            }
            
            $("tr").dblclick(function(){
            	document.location.href("step.html?"+$(this).find('td.td-id').html());
        	});
            
            $("tr").click(function(){
            	if ($(this).hasClass('am-active')) {
            		$(this).removeClass("am-active");
            	} else {
            		$(this).addClass("am-active");
            	}
        	});
        },
        complete: function() {

        },
        error:function(err) {

        }
    });
}
