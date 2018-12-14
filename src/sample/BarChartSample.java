package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BarChartSample extends Application
{
    final static String queens = "Queens";
    final static String brooklyn = "Brooklyn";
    final static String bronx = "Bronx";
    final static String manhattan = "Manhattan";
    final static String staten = "Staten Island";

    public void start(Stage stage)
    {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Critical Health Inspections Per Borough");
        xAxis.setLabel("Borough");
        yAxis.setLabel("Amount");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Critical");
        series1.getData().add(new XYChart.Data(queens, 25601.34));
        series1.getData().add(new XYChart.Data(brooklyn, 20148.82));
        series1.getData().add(new XYChart.Data(bronx, 10000));
        series1.getData().add(new XYChart.Data(manhattan, 35407.15));
        series1.getData().add(new XYChart.Data(staten, 12000));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Non-Critical");
        series2.getData().add(new XYChart.Data(queens, 57401.85));
        series2.getData().add(new XYChart.Data(brooklyn, 41941.19));
        series2.getData().add(new XYChart.Data(bronx, 45263.37));
        series2.getData().add(new XYChart.Data(manhattan, 117320.16));
        series2.getData().add(new XYChart.Data(staten, 14845.27));

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
