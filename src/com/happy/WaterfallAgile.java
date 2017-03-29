package com.happy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/**
 * Created by Happy on 3/29/2017.
 */
public class WaterfallAgile extends JFrame {
    private JPanel rootPanel;
    private JCheckBox CustomerCheckBox;
    private JCheckBox ExperienceCheckBox;
    private JCheckBox LocationCheckBox;
    private JCheckBox DeadlinesCheckBox;
    private JCheckBox ProgrammersCheckBox;
    private JCheckBox StringentCheckBox;
    private JButton recommendButton;
    private JTextField AgileOrWaterfalltextField1;
    private JLabel RecommendLabel;
    private JLabel Label;
    int pointsforWaterfall = 0;
    int pointsforAgile = 0;


    public WaterfallAgile() {
       // private void createUIComponents(){
        setContentPane(rootPanel); //the frame needs to have something to display
        setPreferredSize(new Dimension(800,600));// set size on the rootPanel
        pack(); // this size the window to fit its components

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quits the program when the window is closed
        setVisible(true); // what it sound like


        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = AgileOrWaterfalltextField1.getText(); //project name
                if (pointsforWaterfall > pointsforAgile) { //give point on which one is better
                    String  waterRecommend = name + "My assignment should  use WaterFall "; // print which one project use
                    RecommendLabel.setText(waterRecommend);
                    pack();
                }
                if (pointsforWaterfall < pointsforAgile) {
                    String  Agilerecommend =  name + "My assignment should  use Agile ";
                    RecommendLabel.setText(Agilerecommend);
                    pack();

                }if (pointsforWaterfall ==  pointsforAgile) {

                    String both = name + "My assignment should use either waterfall or agile";
                    RecommendLabel.setText(both);
                }
            }
        });


        CustomerCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (CustomerCheckBox.isSelected()) {
                    pointsforWaterfall++;
                } else {
                    pointsforAgile++;
                }
            }
        });

        DeadlinesCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (DeadlinesCheckBox.isSelected()){
                    pointsforWaterfall++;
                } else {
                    pointsforAgile++;

                }
            }
        });

        ExperienceCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (ExperienceCheckBox.isSelected()){
                    pointsforWaterfall++;
                }
                else{
                    pointsforAgile++;

                }
            }
        });

        LocationCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (LocationCheckBox.isSelected()){
                    pointsforWaterfall++;
                }else {
                    pointsforAgile++;
                }
            }
        });


        StringentCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (StringentCheckBox.isSelected()){

                }else {
                    pointsforAgile++;
                }
            }
        });

        ProgrammersCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (ProgrammersCheckBox.isSelected()) {

                    pointsforWaterfall++;
                }
                else {
                    pointsforAgile++;

                }
            }
        });






    }
}
