 /**
   * 학과 별 방문자 수
   */
 google.charts.load("current", {packages:['corechart']});
    google.charts.setOnLoadCallback(drawChart);
    function drawChart() {
    	console.log(data);
    	data = eval(data);
      var data = google.visualization.arrayToDataTable(/*data);*/
      [
        ["Element", "Density", { role: "style" } ],
        ["Monday", 8.94, "#b87333"],
        ["Tuesday   ", 10.49, "silver"],
        ["Wednesday  ", 10.49, "silver"],
        ["Thursday ", 21.45, "color: #e5e4e2"],
        ["Fryday", 21.45, "color: #e5e4e2"]
      ]);

      var view = new google.visualization.DataView(data);
      view.setColumns([0, 1,
                       { calc: "stringify",
                         sourceColumn: 1,
                         type: "string",
                         role: "annotation" },
                       2]);

      var options = {
        title: "학번 별 이용 수",
        width: 700,
        height: 500,
        bar: {groupWidth: "95%"},
        legend: { position: "relative" },
      };
      var chart = new google.visualization.ColumnChart(document.getElementById("chart_div"));
      chart.draw(view, options);
  }