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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/echarts/echarts.min.js"></script>

</head>
<body>
<div id="main1" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById("main1"));

    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '一组注意力训练时注意力变化折线图',
            subtext: '实时采集该次注意力情况'
        },
        tooltip: {
            show: true
        },
        xAxis: {
            type: 'category',
            data: ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10',
                '11', '12', '13', '14', '15', '16', '17', '18', '19'],
            axisTick: {
                alignWithLabel: true
            },
            axisLabel: {
                interval: 0
            }
        },
        // y轴
        yAxis: {},
        legend: {
            orient: 'vertical',
            x: 'center',      //可设定图例在左、右、居中
            y: '378px',     //可设定图例在上、下、居中
            // padding: [0, 50, 0, 0],   //可设定图例[距上方距离，距右方距离，距下方距离，距左方距离]
            data: ['第一次测试', '第五次测试', '第十次测试']
        },
        series: [
            {
                name: '第一次测试', // 系列名称
                type: 'line', // 类型：线
                data: [18, 25, 62, 48, 23, 56, 82, 90, 92, 78, 56, 65, 76, 48, 30, 65, 70],// 数据
                smooth: true
            },
            {
                name: '第五次测试', // 系列名称
                type: 'line', // 类型：线
                data: [14, 23, 56, 68, 82, 19, 75, 68, 82, 65, 72, 88, 58, 20, 55, 80], // 数据
                smooth: true
            },
            {
                name: '第十次测试', // 系列名称
                type: 'line', // 类型：线
                data: [14, 28, 66, 78, 80, 82, 79, 59, 65, 81, 82, 58, 65, 70], // 数据
                smooth: true
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>	