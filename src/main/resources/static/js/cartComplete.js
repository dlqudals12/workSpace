// 주문 완료 페이지
$(function() {
	debugger
	$(document).ready(function() {
	    var psidList = localStorage.getItem("psidList");
	    var mid = localStorage.getItem("mid");
	    var countList = localStorage.getItem("countList");
	    
	    $.ajax({
	        type: "get",
	        url: "/cart/checkCart?psidList=" + psidList + "&mid=" + mid + "&countList=" + countList,
	        error: function (request, status, error) {
	          alert(error);
	        },
	        success: function (data) {
	          
	        },
	        error: function (e) {
	          console.log("error", e);
	        },
	    });
	});
})