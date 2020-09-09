
				$("#stardium--save").on("click", function() {
					var data = {
							name: $("#stardiumname").val()
					};
	
				$.ajax({
					type:"POST",
					url:"/stardium/save",
					data: JSON.stringify(data),
					contentType:"application/json; charset=utf-8",
					dataType: "json"
				}).done(function(resp){
					alert("야구장 등록이 완료되었습니다.");
					location.href="/stardium";
				}).fail(function(error){
					alert(JSON.stringify(error));
				});
				
				}
				
		
	