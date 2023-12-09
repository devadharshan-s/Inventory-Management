/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopistant;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class AnalysisFrame extends ApplicationFrame {
   
   public AnalysisFrame( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Products",            
         "Quantity",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setSize(new java.awt.Dimension( 560 , 367 ));  
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String p1 = "Perk";        
      final String p2 = "Munch";        
      final String p3 = "ChocoPie";    
      final String p4= "Nabati";    
      final String p5 = "Chips";    
      final String p6 = "Kurkure";    
      final String p7= "Lays";    
      final String p8 = "GoodDay";   
      final String p9 = "Hide&Seek";    
      final String p10 = "Bytes"; 
      final String p12 = "Springles";    
      final String products = "Products";        
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( 25.0 , p1 , products );       
      dataset.addValue( 30.0 , p2 , products );       
      dataset.addValue( 15.0 , p3 , products ); 
      dataset.addValue( 15.0 , p4 , products ); 
      dataset.addValue( 55.0 , p5 , products ); 
      dataset.addValue( 35.0 , p6, products ); 
      dataset.addValue( 45.0 , p7 , products ); 
      dataset.addValue( 65.0 , p8 , products ); 
      dataset.addValue( 85.0 , p9 , products ); 
      dataset.addValue( 55.0 , p10 , products ); 
      dataset.addValue( 55.0 , p12 , products );
      
                

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
       AnalysisFrame chart = new AnalysisFrame("Shopylitics", 
         "Sales analysis");
      RefineryUtilities.centerFrameOnScreen(chart); 
      chart.setSize(800,800);
      chart.setVisible( true ); 
   }
}