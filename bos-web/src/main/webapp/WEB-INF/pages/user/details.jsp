<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <!-- 导入jquery核心类库 -->
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
    <!-- 导入easyui类库 -->
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath }/css/default.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
    <script
            src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
            type="text/javascript"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts/echarts.min.js">

    </script>
</head>
<body>
<div id="main" style="width: 600px;height:400px;"></div>
<div style="align-content: left">
    本次舒尔特5*5方格用时16秒，中间点错了2次。
</div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    var names = [] // 用于记录当前描述情况
    var nums = [] // 用于记录当前注意力数值情况

    $.ajax({
        type: "post",
        async: true,
        url: "${pageContext.request.contextPath}/showDetails",
        data: {},
        dataType: "json", // 返回数据是json格式
        success: function (result) {
            if (result) {
                for (var i = 0; i < result.length; i++)
                    names.push(result[i].name)
                for (var i = 0; i < result.length; i++)
                    nums.push(result[i].num)
            }
            myChart.setOption({
                title: {
                    text: '注意力变化折线图',
                    subtext: '实时采集该次注意力情况'
                },
                tooltip: {
                    show: true
                },
                legend: {
                    data: '注意力值'
                },
                xAxis: {
                    type: 'category',
                    data: names,
                    axisTick: {
                        alignWithLabel: true
                    },
                    axisLabel: {
                        interval: 0
                    }
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    name: '注意力值',
                    data: nums,
                    type: 'line'
                }]
            })
        },
        error: function (errorMsg) {
            alert("数据请求失败，请刷新页面！")
        }
    })
</script>
</body>
</html>	