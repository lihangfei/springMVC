<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<h2>测试同名和不同名跳转</h2>
	<a href="test">跳转页面1</a> <br>
	<a href="testTwo">跳转页面2</a><br>
	
	
	<h2>测试RequestMapping放到类前面</h2>
	<a href="hello/world">跳转到hello</a><br>
	
	
	<h2>测试将参数传递到paramTest.java</h2>
	<form action="paramTest">
		姓名<input type="text" name="name"><br>
		年龄<input type="text" name="age">
		<input type="submit" value="提交">
	</form>
	
	
	<h2>测试RequestMapping参数属性</h2>
	<form action="testRequired">
		年龄<input type="text" name="age">
		<input type="submit" value="提交">
	</form>
	
	<h2>测试四种请求方式</h2>
	
	<form action="testRequest" method="get">
		<input type="submit" value="测试get">
	</form>
	
	<form action="testRequest" method="post">
		<input type="submit" value="测试post">
	</form>
	
	<form action="testRequest" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="测试put">
	</form>
	
	<form action="testRequest" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="测试delete">
	</form>
	
	<h2>测试占位符</h2>
	<a href="testPlaceHolder/123/admin">跳转到placeHolder</a><br>
	
	<h2>测试ModelAndView</h2>
	<a href="testModelAndView">跳转到success页面</a><br>
	<a href="testModelAndViewWithMap">跳转到success页面</a><br>
	
</body>
<script type="text/javascript" src="/js/jquery-1.8.3.min.js"/></script>
<script type="text/javascript">
/* script可以协助任意位置 
 * ajax 介绍
 * url 请求
 	type 请求类型 get post
 	data 传递的参数 param
 	dataType 返回值类型
 	success 成功后的回调
 	fail
 */
	function test(){
		$ajax({
			url:"",
			type:"",
			data:{},
			dataType:"",
			beforeSend:function(){
				//请求开始时
			},
			success:function(res){
				console.log(res)
			},
			error:function(err){
				if(err.status>=400&&err.status<500){
			           window.location.href="./404.html"
			        }else if(err.status>=500&&err.status<600){
			           window.location.href="./500.html"
			        }else{
			            alert(err.status + '(' + err.statusText + ')');  
			            //返回ajax请求失败的值   如(404  not find)  让用户知道是请求报错了 
			        }
			}
			
		});
	}

</script>

</html>